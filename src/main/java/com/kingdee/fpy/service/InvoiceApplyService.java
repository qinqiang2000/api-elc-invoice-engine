package com.kingdee.fpy.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.enums.RuleEnum;
import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceLine;
import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.model.RuleLog;
import com.kingdee.fpy.service.cel.JexlExecutionService;
import com.kingdee.fpy.service.imp.InvoiceServiceImpl;
import com.kingdee.fpy.service.imp.RuleLogServiceImpl;
import com.kingdee.fpy.service.impl.InvoiceLineServiceImpl;
import com.kingdee.fpy.service.impl.InvoiceRequestServiceImpl;
import com.kingdee.fpy.utils.ResultType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 发票申请服务类，负责发票创建和规则校验
 *
 * @author 金帆
 * @date 2025/8/5 13:48
 */
@Service
@Slf4j
public class InvoiceApplyService {

    private final InvoiceRulesService invoiceRulesService;
    private final RuleLogServiceImpl ruleLogService;
    private final JexlExecutionService jexlExecutionService;
    private final XmlBuildService xmlBuildService;
    private final InvoiceRequestServiceImpl invoiceRequestService;
    private final InvoiceServiceImpl invoiceService;
    private final InvoiceLineServiceImpl invoiceLineService;

    @Autowired
    public InvoiceApplyService(InvoiceRulesService invoiceRulesService, RuleLogServiceImpl ruleLogService,
            JexlExecutionService jexlExecutionService, XmlBuildService xmlBuildService,
            InvoiceRequestServiceImpl invoiceRequestService, InvoiceServiceImpl invoiceService,
            InvoiceLineServiceImpl invoiceLineService) {
        this.invoiceRulesService = invoiceRulesService;
        this.ruleLogService = ruleLogService;
        this.jexlExecutionService = jexlExecutionService;
        this.xmlBuildService = xmlBuildService;
        this.invoiceRequestService = invoiceRequestService;
        this.invoiceService = invoiceService;
        this.invoiceLineService = invoiceLineService;
    }


    /**
     * 创建发票申请
     *
     * @param invoice 发票JSON数据
     * @return 创建结果
     */
    public Result createInvoice(JSONObject invoice) {
        Assert.notNull(invoice, "发票数据不能为空");

        Result result = new Result();

        try {
            // 1. 执行规则校验和补全l
            if (!validateAndCompleteInvoice(invoice, result)) {
                return result;
            }

            // 2. 检查发票是否已存在
            String invoiceNo = invoice.getString("ID");
            if (isInvoiceExist(invoiceNo)) {
                result.setResultType(ResultType.EXIST_FAIL);
                return result;
            }
            // 3. 保存发票数据
            saveInvoiceData(invoice);

            // 4. 生成XML
            generateInvoiceXml(invoice);

            log.info("发票创建成功，发票号：{}", invoiceNo);

            return result;

        } catch (Exception e) {
            log.error("创建发票失败", e);
            result.setResultType(ResultType.SYSTEM_ERROR);
            result.getErrorMsgArray().add("系统异常：" + e.getMessage());
            return result;
        }
    }

    /**
     * 校验和补全发票数据
     */
    private boolean validateAndCompleteInvoice(JSONObject invoice, Result result) {
        List<InvoiceRules> allRules = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        if (CollectionUtil.isEmpty(allRules)) {
            log.warn("未找到对应的规则配置");
            return true;
        }

        List<InvoiceRules> validationRules = allRules.stream()
                .filter(rule -> Objects.equals(RuleEnum.CHECK.getValue(), rule.getRuleType()))
                .collect(Collectors.toList());

        List<InvoiceRules> completionRules = allRules.stream()
                .filter(rule -> !Objects.equals(RuleEnum.CHECK.getValue(), rule.getRuleType()))
                .collect(Collectors.toList());

        JexlContext context = jexlExecutionService.createJexlContext();
        context.set("invoice", invoice);

        executeRules(validationRules, context, result, "校验规则失败");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return false;
        }

        executeRules(completionRules, context, result, "补全规则失败");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return false;
        }

        return true;
    }

    private boolean isInvoiceExist(String invoiceNo) {
        if (StringUtils.isBlank(invoiceNo)) {
            return false;
        }
        InvoiceRequest existing = invoiceRequestService.queryByInvoiceNo(invoiceNo);
        return existing != null;
    }

    private void generateInvoiceXml(JSONObject invoice) {
        Map<String, Object> xmlMap = new HashMap<>();
        xmlMap.put("invoice", invoice);
        // String xmlContent = xmlBuildService.buildXmlFromJson(xmlMap);
        String xmlContent = null;
        try {
            xmlContent = xmlBuildService.convertJsonToXml(JSON.toJSONString(xmlMap));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        log.info("生成发票XML成功，发票号：{},xml:{}", invoice.getString("ID"),xmlContent);
        if (log.isDebugEnabled()) {
            log.debug("XML内容：{}", xmlContent);
        }

        // 调用外部开票API
        try {
            String requestId = callSendInvoiceApi(xmlContent, invoice.getString("ID"));
            updateInvoiceSubmissionInfo(invoice.getString("ID"), requestId);
        } catch (Exception e) {
            log.error("调用开票API失败，发票号：{}", invoice.getString("ID"), e);
            throw new RuntimeException("开票API调用失败: " + e.getMessage(), e);
        }
    }

    private void saveInvoiceData(JSONObject invoice) {
        InvoiceRequest invoiceRequest = createInvoiceRequest(invoice);
        invoiceRequestService.create(invoiceRequest);

        Invoice invoiceEntity = new Invoice();
        BeanUtil.copyProperties(invoiceRequest, invoiceEntity);
        invoiceService.saveInvoice(invoiceEntity);

        saveInvoiceLines(invoice, invoiceRequest, invoiceEntity);
    }

    /**
     * 创建发票申请对象
     */
    private InvoiceRequest createInvoiceRequest(JSONObject invoice) {
        InvoiceRequest invoiceRequest = new InvoiceRequest();
        invoiceRequest.setTenantId("TODO");
        invoiceRequest.setCompanyId("TODO");
        invoiceRequest.setInvoiceType(invoice.getJSONObject("InvoiceTypeCode").getString("value"));
        invoiceRequest.setInvoiceSubType("TODO");
        invoiceRequest.setSubmissionType("TODO");
        invoiceRequest.setInvoiceNo(invoice.getString("ID"));
        invoiceRequest.setIssueDate(invoice.getDate("IssueDate"));

        invoiceRequest.setSellBilled(invoice.getString("SellBilled"));

        invoiceRequest.setSendCompanyId("TODO");
        invoiceRequest.setReceiveCompanyId("TODO");
        invoiceRequest.setSendCompanyName("TODO");
        invoiceRequest.setReceiverCompanyName("TODO");

        // 财务信息安全处理
        JSONObject legalMonetaryTotal = invoice.getJSONObject("LegalMonetaryTotal");
        if (legalMonetaryTotal != null) {
            JSONObject payableAmount = legalMonetaryTotal.getJSONObject("PayableAmount");
            JSONObject lineExtensionAmount = legalMonetaryTotal.getJSONObject("LineExtensionAmount");

            if (payableAmount != null) {
                invoiceRequest.setTotalAmount(payableAmount.getBigDecimal("value"));
            }

            if (lineExtensionAmount != null && invoiceRequest.getTotalAmount() != null) {
                BigDecimal lineAmount = lineExtensionAmount.getBigDecimal("value");
                BigDecimal taxAmount = invoiceRequest.getTotalAmount().subtract(lineAmount);
                invoiceRequest.setTaxAmount(taxAmount);
            }
        }
        invoiceRequest.setCurrency(invoice.getString("DocumentCurrencyCode"));

        invoiceRequest.setOrderRefid("TODO");
        invoiceRequest.setBillingRefid("TODO");
        invoiceRequest.setExtField(JSON.toJSONString(invoice));
        invoiceRequest.setSourceDocumentType("TODO");
        invoiceRequest.setTargetDocumentId("TODO");
        invoiceRequest.setStatus(1);
        return invoiceRequest;
    }

    /**
     * 保存发票明细行
     */
    private void saveInvoiceLines(JSONObject invoice, InvoiceRequest invoiceRequest, Invoice invoiceEntity) {
        List<InvoiceLine> invoiceLines = new ArrayList<>();
        JSONArray jsonArray = invoice.getJSONArray("InvoiceLine");
        if (CollectionUtil.isEmpty(jsonArray)) {
            return;
        }

        int sequenceNumber = 1;
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject itemJson = jsonArray.getJSONObject(i);
            InvoiceLine invoiceLine = new InvoiceLine();
            invoiceLine.setInvoiceRequestId(invoiceRequest.getId());
            invoiceLine.setInvoiceId(invoiceEntity.getId());
            invoiceLine.setSeq(sequenceNumber++);

            // 安全处理JSON对象取值
            setLineAmountInfo(itemJson, invoiceLine);
            setLineQuantityInfo(itemJson, invoiceLine);
            setLineItemInfo(itemJson, invoiceLine);

            // 0:普通行 1:折扣 2:收费
            invoiceLine.setType(0);
            invoiceLine.setExtField(JSON.toJSONString(itemJson));
            invoiceLine.setStatus(1);
            invoiceLines.add(invoiceLine);

            // 处理明细行关联的折扣和收费
            processLineAllowanceCharges(itemJson, invoiceLine, invoiceLines);
        }

        // 处理表头级别的折扣和收费
        processHeaderAllowanceCharges(invoice, invoiceRequest, invoiceEntity, invoiceLines, sequenceNumber);

        // 批量保存所有明细行
        if (CollectionUtil.isNotEmpty(invoiceLines)) {
            invoiceLineService.batchInsert(invoiceLines);
        }
    }

    /**
     * 设置行金额信息
     */
    private void setLineAmountInfo(JSONObject itemJson, InvoiceLine invoiceLine) {
        JSONObject lineExtensionAmount = itemJson.getJSONObject("LineExtensionAmount");
        if (lineExtensionAmount != null) {
            BigDecimal amount = lineExtensionAmount.getBigDecimal("value");
            invoiceLine.setInvoiceLineAmount(amount);
            invoiceLine.setAmount(amount);
        }
    }

    /**
     * 设置行数量信息
     */
    private void setLineQuantityInfo(JSONObject itemJson, InvoiceLine invoiceLine) {
        JSONObject invoicedQuantity = itemJson.getJSONObject("InvoicedQuantity");
        if (invoicedQuantity != null) {
            invoiceLine.setUnit(invoicedQuantity.getString("unitCode"));
            invoiceLine.setQuantity(invoicedQuantity.getBigDecimal("value"));
        }

        JSONObject priceObj = itemJson.getJSONObject("Price");
        if (priceObj != null) {
            JSONObject priceAmount = priceObj.getJSONObject("PriceAmount");
            if (priceAmount != null) {
                invoiceLine.setPrice(priceAmount.getBigDecimal("value"));
            }
        }
    }

    /**
     * 设置行商品信息
     */
    private void setLineItemInfo(JSONObject itemJson, InvoiceLine invoiceLine) {
        JSONObject item = itemJson.getJSONObject("Item");
        if (item != null) {
            invoiceLine.setItemName(item.getString("Name"));
            JSONObject classifiedTaxCategory = item.getJSONObject("ClassifiedTaxCategory");
            if (classifiedTaxCategory != null) {
                invoiceLine.setCategoryCode(classifiedTaxCategory.getString("ID"));
                invoiceLine.setTaxRate(classifiedTaxCategory.getBigDecimal("Percent"));
            }
        }
    }

    /**
     * 处理明细行的折扣和收费
     */
    private void processLineAllowanceCharges(JSONObject itemJson, InvoiceLine baseLine,
            List<InvoiceLine> invoiceLines) {
        JSONArray chargeArray = itemJson.getJSONArray("AllowanceCharge");
        if (CollectionUtil.isEmpty(chargeArray)) {
            return;
        }

        for (int j = 0; j < chargeArray.size(); j++) {
            JSONObject chargeJson = chargeArray.getJSONObject(j);
            InvoiceLine chargeLine = new InvoiceLine();
            BeanUtil.copyProperties(baseLine, chargeLine);

            Boolean chargeIndicator = chargeJson.getBoolean("ChargeIndicator");
            chargeLine.setType(Boolean.TRUE.equals(chargeIndicator) ? 2 : 1);

            JSONObject amountObj = chargeJson.getJSONObject("Amount");
            if (amountObj != null) {
                chargeLine.setAmount(amountObj.getBigDecimal("value"));
            }

            invoiceLines.add(chargeLine);
        }
    }

    /**
     * 处理表头级别的折扣和收费
     */
    private void processHeaderAllowanceCharges(JSONObject invoice, InvoiceRequest invoiceRequest, Invoice invoiceEntity,
            List<InvoiceLine> invoiceLines, int sequenceNumber) {
        JSONArray discountArray = invoice.getJSONArray("AllowanceCharge");
        if (CollectionUtil.isEmpty(discountArray)) {
            return;
        }

        for (int i = 0; i < discountArray.size(); i++) {
            JSONObject discountJson = discountArray.getJSONObject(i);
            InvoiceLine discountLine = new InvoiceLine();
            discountLine.setInvoiceRequestId(invoiceRequest.getId());
            discountLine.setInvoiceId(invoiceEntity.getId());
            discountLine.setSeq(sequenceNumber++);

            // 设置基础金额
            JSONObject baseAmount = discountJson.getJSONObject("BaseAmount");
            if (baseAmount != null) {
                discountLine.setInvoiceLineAmount(baseAmount.getBigDecimal("value"));
            }

            // 设置折扣/收费金额
            JSONObject amount = discountJson.getJSONObject("Amount");
            if (amount != null) {
                discountLine.setAmount(amount.getBigDecimal("value"));
            }

            // 设置类型
            Boolean chargeIndicator = discountJson.getBoolean("ChargeIndicator");
            discountLine.setType(Boolean.TRUE.equals(chargeIndicator) ? 2 : 1);

            // 设置其他信息
            discountLine.setItemName(discountJson.getString("Description"));

            JSONObject taxCategory = discountJson.getJSONObject("TaxCategory");
            if (taxCategory != null) {
                discountLine.setCategoryCode(taxCategory.getString("ID"));
                discountLine.setTaxRate(taxCategory.getBigDecimal("Percent"));
            }

            discountLine.setStatus(1);
            invoiceLines.add(discountLine);
        }
    }

    /**
     * 执行规则列表
     */
    private void executeRules(List<InvoiceRules> rules, JexlContext context, Result result, String errorType) {
        JSONObject invoice = (JSONObject) context.get("invoice");
        List<RuleLog> ruleLogs = new ArrayList<>();

        for (InvoiceRules invoiceRule : rules) {
            RuleLog ruleLog = new RuleLog();
            ruleLog.setRuleCode(invoiceRule.getRuleCode());
            ruleLog.setInputData(JSON.toJSONString(context.get("invoice")));
            ruleLog.setInvoiceNo(StrUtil.nullToEmpty(invoice.getString("invoiceNo")));
            ruleLog.setBillNo(StrUtil.nullToEmpty(invoice.getString("billNo")));

            // 检查规则是否应用
            Boolean shouldApply = true;
            if (StringUtils.isNotBlank(invoiceRule.getApplyTo())) {
                shouldApply = jexlExecutionService.executeExpression(context, invoiceRule.getApplyTo());
            }

            if (Boolean.TRUE.equals(shouldApply)) {
                Boolean ruleResult = jexlExecutionService.executeExpression(context, invoiceRule.getRuleExpression());
                ruleLog.setExecutionResult(Boolean.TRUE.equals(ruleResult) ? 1 : 2);

                if (!Boolean.TRUE.equals(ruleResult)) {
                    log.info("规则执行失败 - 规则：{}，表达式：{}，错误信息：{}", invoiceRule.getFieldPath(),
                            invoiceRule.getRuleExpression(), invoiceRule.getErrorMessage());
                    result.getErrorMsgArray()
                            .add(String.format("%s - 规则：%s，错误：%s", errorType, invoiceRule.getRuleName(),
                                    invoiceRule.getErrorMessage()));
                    ruleLog.setErrorMessage(invoiceRule.getErrorMessage());
                }
                ruleLogs.add(ruleLog);
            }
        }

        if (CollectionUtil.isNotEmpty(ruleLogs)) {
            ruleLogService.insertBatch(ruleLogs);
        }
    }

    /**
     * 调用外部开票API
     */
    private String callSendInvoiceApi(String xmlContent, String invoiceNo) {
        log.info("调用开票API，发票号：{}", invoiceNo);
        // TODO: 实现调用 https://app.apifox.com/project/4496927 Send Invoice API
        // 返回示例requestId，实际应从API响应获取
        return "REQ_" + System.currentTimeMillis();
    }

    /**
     * 更新发票提交信息
     */
    private void updateInvoiceSubmissionInfo(String invoiceNo, String requestId) {
        log.info("更新发票提交信息，发票号：{}，请求ID：{}", invoiceNo, requestId);
        
        // 查询发票记录
        Invoice invoice = invoiceService.queryByInvoiceNo(invoiceNo);
        if (invoice != null) {
            invoice.setSubmissionId(requestId);
            invoice.setStatus(2); // 开票中状态
            invoiceService.updateInvoice(invoice);
            log.info("发票状态已更新为开票中，发票号：{}，请求ID：{}", invoiceNo, requestId);
        } else {
            log.warn("未找到发票记录，发票号：{}", invoiceNo);
        }
    }

    /**
     * 根据企业编码和规则编码校验发票数据
     *
     * @param companyId 企业编码
     * @param ruleCode 规则编码，可选
     * @param invoice 发票JSON数据
     * @return 校验结果
     */
    public Result validateInvoiceByRule(String companyId, String ruleCode, JSONObject invoice) {
        Assert.notNull(invoice, "发票数据不能为空");
        
        Result result = new Result();
        
        try {
            // 根据是否提供规则编码来查询规则
            List<InvoiceRules> rules  = invoiceRulesService.selectByCompanyIdAndRuleCode(companyId, ruleCode);
            if (CollectionUtil.isEmpty(rules)) {
                log.warn("未找到对应的规则配置，企业编码：{}，规则编码：{}", companyId, ruleCode);
                return result;
            }

            // 分离校验规则和补全规则
            List<InvoiceRules> validationRules = rules.stream()
                    .filter(rule -> Objects.equals(RuleEnum.CHECK.getValue(), rule.getRuleType()))
                    .collect(Collectors.toList());

            List<InvoiceRules> completionRules = rules.stream()
                    .filter(rule -> !Objects.equals(RuleEnum.CHECK.getValue(), rule.getRuleType()))
                    .collect(Collectors.toList());

            // 创建执行上下文
            JexlContext context = jexlExecutionService.createJexlContext();
            context.set("invoice", invoice);

            // 执行校验规则
            executeRules(validationRules, context, result, "校验规则失败");
            if (!result.getErrorMsgArray().isEmpty()) {
                return result;
            }

            // 执行补全规则
            executeRules(completionRules, context, result, "补全规则失败");
            if (!result.getErrorMsgArray().isEmpty()) {
                return result;
            }

            // 返回处理后的发票数据
            result.setData(invoice);
            return result;

        } catch (Exception e) {
            log.error("规则校验失败", e);
            result.setResultType(ResultType.SYSTEM_ERROR);
            result.getErrorMsgArray().add("系统异常：" + e.getMessage());
            result.setData(invoice);
            return result;
        }
    }
}
