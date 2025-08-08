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
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 金帆
 * @Date: 2025/8/5 13:48
 * @Description:
 */
@Service
@Slf4j
public class InvoiceAppleyService {

    @Autowired
    InvoiceRulesService invoiceRulesService;
    @Autowired
    InvoiceRulesService ruleRulesService;
    @Autowired
    RuleLogServiceImpl ruleLogService;
    @Autowired
    JexlExecutionService jexlExecutionService;
    @Autowired
    XmlBuildService xmlBuildService;

    @Autowired
    InvoiceRequestServiceImpl invoiceRequestService;

    @Autowired
    InvoiceServiceImpl invoiceService;

    @Autowired
    InvoiceLineServiceImpl invoiceLineService;


    public Result createInvoice(JSONObject invoice) {
        Result result = new Result<>();
        // 企业信息查询 -- 查询 企业租户ID，企业ID ，所属国家
        // 获取要执行的规则 TODO 企业信息获取
        List<InvoiceRules> invoiceRules = ruleRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> validRuls = invoiceRules.stream()
                .filter(rule -> RuleEnum.CHECK.getValue() == rule.getRuleType()).collect(Collectors.toList());
        invoiceRules.removeAll(validRuls);
        // 先执行校验规则
        JexlContext context = jexlExecutionService.createJexlContext();
        context.set("invoice", invoice);
        executeRule(validRuls, context, "rule:{},contition:{},valid fail:{}", result, "rule:%s,valid fail:%s");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return result;
        }
        // 再执行补全逻辑
        executeRule(invoiceRules, context, "rule:{},contition:{},complete fail:{}", result, "rule:%s,complete fail:%s");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return result;
        }
        // 入开票申请单,发票表，明细表，状态为待开票
        log.info("invoice:{}", invoice);
       /* Map<String, Object> xmlMap = new HashMap<>();
        xmlMap.put("invoice", invoice);
        String s = xmlBuildService.buildXmlFromJson(xmlMap);
        System.out.println(s);*/
        // 调通道接口提交开票
        //InvoiceRequest invoiceRequest = JSON.parseObject(JSON.toJSONString(invoice), InvoiceRequest.class);
        String invoiceNo = invoice.getString("ID");
        InvoiceRequest exist =  invoiceRequestService.queryByInvoiceNo(invoiceNo);
        if(null != exist){
            result.setResultType(ResultType.EXIST_FAIL);
            return result;
        }
        InvoiceRequest invoiceRequest = createInvoiceReuqEvent(invoice);
        invoiceRequestService.create(invoiceRequest);
        // 入发票表
        Invoice saveInvoice = new Invoice();
        BeanUtil.copyProperties(invoiceRequest, saveInvoice);
        invoiceService.saveInvoice(saveInvoice);
        // 明细表
        saveItems(invoice, invoiceRequest, saveInvoice);
        /*// json 转为xml 调通道接口开票
        log.info("submit invoice", invoice);
        Map<String, Object> xmlMap = new HashMap<>();
        xmlMap.put("invoice", invoice);
        String s = xmlBuildService.buildXmlFromJson(xmlMap);
        log.info("xml:{}", s);
        // 获取开票结果*/
        return result;
    }

    private InvoiceRequest createInvoiceReuqEvent(JSONObject invoice) {
        InvoiceRequest invoiceRequest = new InvoiceRequest();
        invoiceRequest.setTenantId("TODO");
        invoiceRequest.setCompanyId("TODO");
        invoiceRequest.setInvoiceType(invoice.getString("InvoiceTypeCode"));
        invoiceRequest.setInvoiceSubType("TODO");
        invoiceRequest.setSubmissionType("TODO");
        invoiceRequest.setInvoiceNo(invoice.getString("ID"));
        invoiceRequest.setIssueDate(invoice.getDate("IssueDate"));

        invoiceRequest.setSellBilled(invoice.getString("SellBilled"));

        invoiceRequest.setSendCompanyId("TODO");
        invoiceRequest.setReceiveCompanyId("TODO");
        invoiceRequest.setSendCompanyName("TODO");
        invoiceRequest.setReceiverCompanyName("TODO");

        invoiceRequest.setTotalAmount(invoice.getJSONObject("LegalMonetaryTotal").getJSONObject("PayableAmount").getBigDecimal("value"));
        BigDecimal bigDecimal = invoice.getJSONObject("LegalMonetaryTotal").getJSONObject("LineExtensionAmount").getBigDecimal("value");
        invoiceRequest.setTaxAmount(invoiceRequest.getTotalAmount().subtract(bigDecimal));
        invoiceRequest.setCurrency(invoice.getString("DocumentCurrencyCode"));

        invoiceRequest.setOrderRefid("TODO");
        invoiceRequest.setBillingRefid("TODO");
        invoiceRequest.setExtField(JSON.toJSONString(invoice));
        invoiceRequest.setSourceDocumentType("TODO");
        invoiceRequest.setTargetDocumentId("TODO");
        invoiceRequest.setStatus(1);
        return invoiceRequest;
    }

    private void saveItems(JSONObject invoice, InvoiceRequest invoiceRequest, Invoice saveInvoice) {
        List<InvoiceLine> items = new java.util.ArrayList<>();
        JSONArray jsonArray = invoice.getJSONArray("InvoiceLine");
        int seq = 1;
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject itemJson = jsonArray.getJSONObject(i);
            InvoiceLine invoiceLine = new InvoiceLine();
            invoiceLine.setInvoiceRequestId(invoiceRequest.getId());
            invoiceLine.setInvoiceId(saveInvoice.getId());
            invoiceLine.setSeq(seq);
            seq++;
            invoiceLine.setInvoiceLineAmount(itemJson.getJSONObject("LineExtensionAmount").getBigDecimal("value"));
            invoiceLine.setAmount(invoiceLine.getInvoiceLineAmount());
            // 0:普通行 1折扣，2收费
            invoiceLine.setType(0);
            invoiceLine.setUnit(itemJson.getJSONObject("InvoicedQuantity").getString("unitCode"));
            invoiceLine.setQuantity(itemJson.getJSONObject("InvoicedQuantity").getBigDecimal("value"));
            invoiceLine.setPrice(itemJson.getJSONObject("Price").getJSONObject("PriceAmount").getBigDecimal("value"));
            invoiceLine.setItemName(itemJson.getJSONObject("Item").getString("Name"));
            invoiceLine.setCategoryCode(itemJson.getJSONObject("Item").getJSONObject("ClassifiedTaxCategory").getString("ID"));
            invoiceLine.setTaxRate(itemJson.getJSONObject("Item").getJSONObject("ClassifiedTaxCategory").getBigDecimal("Percent"));
            invoiceLine.setExtField(JSON.toJSONString(itemJson));
            invoiceLine.setStatus(1);
            items.add(invoiceLine);
            // 明细行关联的折扣行
            JSONArray chargeArray = itemJson.getJSONArray("AllowanceCharge");
            if(CollectionUtil.isNotEmpty(chargeArray)){
                for (int j = 0; j < chargeArray.size(); j++) {
                    JSONObject chargeJson = chargeArray.getJSONObject(j);
                    InvoiceLine invoiceChageLine = new InvoiceLine();
                    BeanUtil.copyProperties(invoiceLine,invoiceChageLine);
                    Boolean chargeIndicator = chargeJson.getBoolean("ChargeIndicator");
                    if(chargeIndicator){
                        invoiceChageLine.setType(2);
                    }else{
                        invoiceChageLine.setType(1);
                    }
                    invoiceChageLine.setAmount(chargeJson.getJSONObject("Amount").getBigDecimal("value"));
                    items.add(invoiceChageLine);
                }
            }
        }
        // 表头折扣
        JSONArray discountArray = invoice.getJSONArray("AllowanceCharge");
        if(CollectionUtil.isNotEmpty(discountArray)){
            for (int i = 0; i < discountArray.size(); i++) {
                JSONObject discountJson = discountArray.getJSONObject(i);
                InvoiceLine invoiceDiscountLine = new InvoiceLine();
                invoiceDiscountLine.setInvoiceRequestId(invoiceRequest.getId());
                invoiceDiscountLine.setInvoiceId(saveInvoice.getId());
                invoiceDiscountLine.setSeq(seq);
                seq++;
                if(null != discountJson.getJSONObject("BaseAmount")){
                    invoiceDiscountLine.setInvoiceLineAmount(discountJson.getJSONObject("BaseAmount").getBigDecimal("value"));
                }
                invoiceDiscountLine.setAmount(discountJson.getJSONObject("Amount").getBigDecimal("value"));
                Boolean chargeIndicator = discountJson.getBoolean("ChargeIndicator");
                if(chargeIndicator){
                    invoiceDiscountLine.setType(2);
                }else{
                    invoiceDiscountLine.setType(1);
                }
                invoiceDiscountLine.setItemName(discountJson.getString("Description"));
                invoiceDiscountLine.setCategoryCode(discountJson.getJSONObject("TaxCategory").getString("ID"));
                invoiceDiscountLine.setTaxRate(discountJson.getJSONObject("TaxCategory").getBigDecimal("Percent"));
                invoiceDiscountLine.setStatus(1);
                items.add(invoiceDiscountLine);
            }
        }
        invoiceLineService.batchInsert(items);
    }


    private void executeRule(List<InvoiceRules> validRuls, JexlContext context, String logStr, Result result,
            String errMsg) {
        JSONObject invoice = (JSONObject) context.get("invoice");
        List<RuleLog> ruleLogs = new java.util.ArrayList<>();
        for (InvoiceRules invoiceRule : validRuls) {
            RuleLog ruleLog = new RuleLog();
            ruleLog.setRuleCode(invoiceRule.getRuleCode());
            ruleLog.setInputData(JSON.toJSONString(context.get("invoice")));
            ruleLog.setInvoiceNo(StrUtil.nullToEmpty(invoice.getString("invoiceNo")));
            ruleLog.setBillNo(StrUtil.nullToEmpty(invoice.getString("billNo")));
            Boolean apply = true;
            if (StringUtils.isNotBlank(invoiceRule.getFieldPath())) {
                apply = jexlExecutionService.executeExpression(context, invoiceRule.getApplyTo());
            }
            if (apply) {
                Boolean b = jexlExecutionService.executeExpression(context, invoiceRule.getRuleExpression());
                ruleLog.setExecutionResult(b ? 1 : 2);
                if (!b) {
                    // 字段校验没过
                    log.info(logStr, invoiceRule.getFieldPath(), invoiceRule.getRuleExpression(),
                            invoiceRule.getErrorMessage());
                    result.getErrorMsgArray()
                            .add(String.format(errMsg, invoiceRule.getRuleName(), invoiceRule.getErrorMessage()));
                    ruleLog.setErrorMessage(invoiceRule.getErrorMessage());
                }
                ruleLogs.add(ruleLog);
            }
        }
        if (!ruleLogs.isEmpty()) {
            ruleLogService.insertBatch(ruleLogs);
        }
    }
}
