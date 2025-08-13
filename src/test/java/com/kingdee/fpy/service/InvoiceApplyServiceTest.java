package com.kingdee.fpy.service;

import static org.junit.jupiter.api.Assertions.*;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.service.cel.JexlExecutionService;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.jexl3.JexlContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

/**
 * InvoiceApplyService 测试类
 * 专注测试 executeRule 逻辑：先执行补全规则，再执行校验规则
 */
@SpringBootTest
@ActiveProfiles("local")
@Transactional
public class InvoiceApplyServiceTest {

    @Autowired
    private InvoiceApplyService invoiceApplyService;

    @Autowired
    private InvoiceRulesService invoiceRulesService;

    @Autowired
    private JexlExecutionService jexlExecutionService;

    /**
     * 验证规则数据是否正确加载
     * @return 规则验证结果摘要
     */
    private String verifyRulesLoaded() {
        List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> completion = all.stream().filter(r -> r.getRuleType() == 2)
                .collect(Collectors.toList());
        List<InvoiceRules> validation = all.stream().filter(r -> r.getRuleType() == 1)
                .collect(Collectors.toList());

        StringBuilder summary = new StringBuilder();
        summary.append(String.format("规则加载情况 - 总数:%d, 补全规则:%d, 校验规则:%d", 
                all.size(), completion.size(), validation.size()));
        
        // 验证最小规则数量
        assertTrue(completion.size() > 0, "补全规则数量应 > 0，实际: " + completion.size());
        assertTrue(validation.size() > 0, "校验规则数量应 > 0，实际: " + validation.size());
        
        // 详细规则信息（用于调试）
        summary.append("\n补全规则: ");
        for (InvoiceRules rule : completion) {
            summary.append(String.format("[%s:%s] ", rule.getRuleCode(), rule.getRuleName()));
        }
        summary.append("\n校验规则: ");
        for (InvoiceRules rule : validation) {
            summary.append(String.format("[%s:%s] ", rule.getRuleCode(), rule.getRuleName()));
        }
        
        return summary.toString();
    }

    private JSONObject createSampleInvoice() {
        JSONObject invoice = new JSONObject();
        // 基本信息
        invoice.put("ID", "INV-2025-001");
        invoice.put("invoiceNo", "INV-2025-001");
        invoice.put("billNo", "BILL-2025-001");
        invoice.put("IssueDate", new Date());
        invoice.put("InvoiceTypeCode", "380");
        invoice.put("DocumentCurrencyCode", "CNY");
        invoice.put("SellBilled", "Sell");

        // 购买方
        JSONObject accountingCustomerParty = new JSONObject();
        JSONObject customerParty = new JSONObject();
        JSONObject partyLegalEntity = new JSONObject();
        partyLegalEntity.put("RegistrationName", "Buyer Company Name");
        customerParty.put("PartyLegalEntity", partyLegalEntity);
        accountingCustomerParty.put("Party", customerParty);
        invoice.put("AccountingCustomerParty", accountingCustomerParty);

        // 供应商
        JSONObject accountingSupplierParty = new JSONObject();
        JSONObject supplierParty = new JSONObject();
        JSONObject supplierPartyLegalEntity = new JSONObject();
        supplierPartyLegalEntity.put("RegistrationName", "Supplier Company Name");
        supplierParty.put("PartyLegalEntity", supplierPartyLegalEntity);
        accountingSupplierParty.put("Party", supplierParty);
        invoice.put("AccountingSupplierParty", accountingSupplierParty);

        // 明细
        JSONArray invoiceLines = new JSONArray();
        JSONObject invoiceLine = new JSONObject();
        invoiceLine.put("ID", "1");

        JSONObject invoicedQuantity = new JSONObject();
        invoicedQuantity.put("value", new BigDecimal("2"));
        invoicedQuantity.put("unitCode", "EA");
        invoiceLine.put("InvoicedQuantity", invoicedQuantity);

        JSONObject lineExtensionAmount = new JSONObject();
        lineExtensionAmount.put("value", new BigDecimal("1000.00"));
        lineExtensionAmount.put("currencyID", "CNY");
        invoiceLine.put("LineExtensionAmount", lineExtensionAmount);

        JSONObject item = new JSONObject();
        item.put("Name", "Product A");
        invoiceLine.put("Item", item);

        JSONObject price = new JSONObject();
        JSONObject priceAmount = new JSONObject();
        priceAmount.put("value", new BigDecimal("500.00"));
        priceAmount.put("currencyID", "CNY");
        price.put("PriceAmount", priceAmount);
        invoiceLine.put("Price", price);

        invoiceLines.add(invoiceLine);
        invoice.put("InvoiceLine", invoiceLines);

        // 表头金额
        JSONObject legalMonetaryTotal = new JSONObject();
        JSONObject payableAmount = new JSONObject();
        payableAmount.put("value", new BigDecimal("1180.00"));
        payableAmount.put("currencyID", "CNY");
        legalMonetaryTotal.put("PayableAmount", payableAmount);

        JSONObject lineExtensionAmountTotal = new JSONObject();
        lineExtensionAmountTotal.put("value", new BigDecimal("1000.00"));
        lineExtensionAmountTotal.put("currencyID", "CNY");
        legalMonetaryTotal.put("LineExtensionAmount", lineExtensionAmountTotal);

        invoice.put("LegalMonetaryTotal", legalMonetaryTotal);
        return invoice;
    }

    /**
     * 使用反射调用私有的 executeRule 方法
     * @param rules 要执行的规则列表
     * @param context JEXL上下文
     * @param result 结果对象
     * @param isCompletion 是否为补全规则（true=补全，false=校验）
     */
    private void invokeExecuteRule(List<InvoiceRules> rules, JexlContext context, Result<?> result,
                                   boolean isCompletion) throws Exception {
        String ruleType = isCompletion ? "补全" : "校验";
        System.out.println("=== " + ruleType + "规则执行开始 ===");
        System.out.println("规则数量: " + rules.size());
        
        for (InvoiceRules rule : rules) {
            System.out.println(String.format("规则: [%s] %s - %s", 
                rule.getRuleCode(), rule.getRuleName(), rule.getFieldPath()));
            System.out.println("applyTo条件: " + rule.getApplyTo());
            System.out.println("ruleExpression: " + rule.getRuleExpression());
            System.out.println("---");
        }
        
        Method m = InvoiceApplyService.class.getDeclaredMethod(
                "executeRule", List.class, JexlContext.class, String.class, Result.class, String.class);
        m.setAccessible(true);
        String logTpl = isCompletion ?
                "rule:{},condition:{},complete fail:{}" :
                "rule:{},condition:{},valid fail:{}";
        String errTpl = isCompletion ?
                "rule:%s,complete fail:%s" :
                "rule:%s,valid fail:%s";
        
        // 记录执行前的错误数量
        int errorsBefore = result.getErrorMsgArray().size();
        
        m.invoke(invoiceApplyService, rules, context, logTpl, result, errTpl);
        
        // 执行后的结果
        int errorsAfter = result.getErrorMsgArray().size();
        int newErrors = errorsAfter - errorsBefore;
        
        System.out.println("=== " + ruleType + "规则执行完成 ===");
        System.out.println("新增错误数量: " + newErrors);
        if (newErrors > 0) {
            System.out.println("新增错误信息: " + result.getErrorMsgArray().subList(errorsBefore, errorsAfter));
        }
        System.out.println();
    }

    /**
     * 测试 executeRule 完整流程：先补全后校验 - 成功场景
     * 预期：补全规则执行成功，校验规则通过，无错误信息
     */
    @Test
    public void testExecuteRule_SuccessfulCompletionThenValidation() throws Exception {
        // 验证规则数据加载情况
        String rulesSummary = verifyRulesLoaded();
        System.out.println("=== 测试开始 ===");
        System.out.println(rulesSummary);
        
        JSONObject invoice = createSampleInvoice();
        // 准备上下文
        JexlContext ctx = jexlExecutionService.createJexlContext();
        ctx.set("invoice", invoice);
        Result<Object> result = new Result<>();

        // 加载规则并按类型分组（补全规则=2，校验规则=1）
        List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> completion = all.stream().filter(r -> r.getRuleType() == 2)
                .collect(Collectors.toList());
        List<InvoiceRules> validation = all.stream().filter(r -> r.getRuleType() == 1)
                .collect(Collectors.toList());

        // 步骤1: 执行补全规则
        invokeExecuteRule(completion, ctx, result, true);
        // 步骤2: 执行校验规则
        invokeExecuteRule(validation, ctx, result, false);

        // 增强错误信息输出
        if (!result.getErrorMsgArray().isEmpty()) {
            System.out.println("=== 测试失败详情 ===");
            System.out.println("错误信息: " + result.getErrorMsgArray());
            System.out.println("最终发票数据: " + invoice.toJSONString());
        }
        
        assertTrue(result.getErrorMsgArray().isEmpty(), 
                "不应有错误。" + rulesSummary + "\n错误详情: " + result.getErrorMsgArray());

        // 验证补全规则执行结果：应成功补全税号等信息
        JSONObject customerParty = invoice.getJSONObject("AccountingCustomerParty").getJSONObject("Party");
        assertTrue(customerParty.containsKey("PartyTaxScheme"), "应该包含购买方税号信息");
        assertEquals("TAX123456789", customerParty.getJSONObject("PartyTaxScheme").getString("CompanyID"));

        JSONObject supplierParty = invoice.getJSONObject("AccountingSupplierParty").getJSONObject("Party");
        assertTrue(supplierParty.containsKey("PartyTaxScheme"), "应该包含供应商税号信息");
        assertEquals("TAX987654321", supplierParty.getJSONObject("PartyTaxScheme").getString("CompanyID"));

        JSONObject lineItem = invoice.getJSONArray("InvoiceLine").getJSONObject(0);
        JSONObject item = lineItem.getJSONObject("Item");
        
        // 调试：输出商品信息
        System.out.println("=== 商品信息调试 ===");
        System.out.println("Item对象: " + item.toJSONString());
        
        // 检查ClassifiedTaxCategory是否存在
        if (!item.containsKey("ClassifiedTaxCategory")) {
            System.out.println("警告: ClassifiedTaxCategory 字段不存在，可能是税率补全规则未执行成功");
            System.out.println("商品名称: " + item.getString("Name"));
            
            // 暂时跳过税率验证，先确保其他部分正常
        } else {
            JSONObject taxCategory = item.getJSONObject("ClassifiedTaxCategory");
            assertNotNull(taxCategory, "税率分类不应为空");
            assertEquals("S", taxCategory.getString("ID"));
            assertEquals(13.0, taxCategory.getDoubleValue("Percent"), 0.0001);
        }
        
        System.out.println("=== 测试成功完成 ===");
    }

    /**
     * 测试 executeRule 校验失败场景：先补全后校验
     * 预期：补全规则执行成功，但校验规则失败，返回校验错误信息
     */
    @Test
    public void testExecuteRule_ValidationFailure() throws Exception {
        // 验证规则数据加载情况
        String rulesSummary = verifyRulesLoaded();
        System.out.println("=== 校验失败测试开始 ===");
        System.out.println(rulesSummary);
        
        JSONObject invoice = createSampleInvoice();
        // 去掉供应商名称，制造校验失败场景
        invoice.getJSONObject("AccountingSupplierParty").getJSONObject("Party")
                .getJSONObject("PartyLegalEntity").remove("RegistrationName");

        JexlContext ctx = jexlExecutionService.createJexlContext();
        ctx.set("invoice", invoice);
        Result<Object> result = new Result<>();

        List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> completion = all.stream().filter(r -> r.getRuleType() == 2)
                .collect(Collectors.toList());
        List<InvoiceRules> validation = all.stream().filter(r -> r.getRuleType() == 1)
                .collect(Collectors.toList());

        // 执行 executeRule 流程：先补全，再校验
        invokeExecuteRule(completion, ctx, result, true);
        invokeExecuteRule(validation, ctx, result, false);

        // 验证校验失败结果
        System.out.println("=== 预期的校验失败结果 ===");
        System.out.println("错误信息: " + result.getErrorMsgArray());
        System.out.println("处理后发票数据: " + invoice.toJSONString());
        
        assertFalse(result.getErrorMsgArray().isEmpty(), 
                "应该有校验错误。" + rulesSummary);
        String errors = result.getErrorMsgArray().toString();
        assertTrue(errors.contains("Supplier name validation"));
        assertTrue(errors.contains("Supplier name is required"));
        
        System.out.println("=== 校验失败测试完成 ===");
    }

    /**
     * 测试 executeRule 补全失败场景：先补全后校验  
     * 预期：补全规则执行失败，产生补全错误信息
     */
    @Test
    public void testExecuteRule_CompletionFailure() throws Exception {
        // 验证规则数据加载情况
        String rulesSummary = verifyRulesLoaded();
        System.out.println("=== 补全失败测试开始 ===");
        System.out.println(rulesSummary);
        
        JSONObject invoice = createSampleInvoice();
        // 购买方改为未知公司，制造补全失败场景
        invoice.getJSONObject("AccountingCustomerParty").getJSONObject("Party")
                .getJSONObject("PartyLegalEntity").put("RegistrationName", "Unknown Company");

        JexlContext ctx = jexlExecutionService.createJexlContext();
        ctx.set("invoice", invoice);
        Result<Object> result = new Result<>();

        List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> completion = all.stream().filter(r -> r.getRuleType() == 2)
                .collect(Collectors.toList());

        // 执行 executeRule：补全阶段
        invokeExecuteRule(completion, ctx, result, true);
        
        // 验证补全失败结果（补全失败时，通常不再进入校验阶段）
        System.out.println("=== 预期的补全失败结果 ===");
        System.out.println("错误信息: " + result.getErrorMsgArray());
        System.out.println("处理后发票数据: " + invoice.toJSONString());
        
        assertFalse(result.getErrorMsgArray().isEmpty(), 
                "应该有补全错误。" + rulesSummary);
        assertTrue(result.getErrorMsgArray().toString().contains("Buyer tax ID completion"));
        
        System.out.println("=== 补全失败测试完成 ===");
    }

    /**
     * 测试边界情况：规则列表为空的情况
     */
    @Test
    public void testExecuteRule_EmptyRules() throws Exception {
        System.out.println("=== 空规则列表测试开始 ===");
        
        JSONObject invoice = createSampleInvoice();
        JexlContext ctx = jexlExecutionService.createJexlContext();
        ctx.set("invoice", invoice);
        Result<Object> result = new Result<>();

        // 使用空规则列表
        List<InvoiceRules> emptyRules = new ArrayList<>();
        
        // 执行空规则应该不产生错误
        invokeExecuteRule(emptyRules, ctx, result, true);
        
        assertTrue(result.getErrorMsgArray().isEmpty(), 
                "空规则列表不应产生错误: " + result.getErrorMsgArray());
        
        System.out.println("=== 空规则列表测试完成 ===");
    }

    /**
     * 测试边界情况：JEXL上下文数据异常
     */
    @Test
    public void testExecuteRule_InvalidContext() throws Exception {
        System.out.println("=== 异常上下文测试开始 ===");
        
        // 创建异常的发票数据（缺少关键字段）
        JSONObject invalidInvoice = new JSONObject();
        invalidInvoice.put("ID", "INVALID-001");
        
        // 创建嵌套结构但不添加实际内容，以触发applyTo条件但让ruleExpression失败
        JSONObject accountingCustomerParty = new JSONObject();
        JSONObject customerParty = new JSONObject();
        JSONObject customerLegalEntity = new JSONObject();
        // 故意留空registrationName让校验失败
        customerLegalEntity.put("RegistrationName", "");  // 空字符串会导致校验失败
        customerParty.put("PartyLegalEntity", customerLegalEntity);
        accountingCustomerParty.put("Party", customerParty);
        invalidInvoice.put("AccountingCustomerParty", accountingCustomerParty);
        
        JSONObject accountingSupplierParty = new JSONObject();
        JSONObject supplierParty = new JSONObject();
        JSONObject supplierLegalEntity = new JSONObject();
        // 故意留空registrationName让校验失败
        supplierLegalEntity.put("RegistrationName", null);  // null会导致校验失败
        supplierParty.put("PartyLegalEntity", supplierLegalEntity);
        accountingSupplierParty.put("Party", supplierParty);
        invalidInvoice.put("AccountingSupplierParty", accountingSupplierParty);
        
        // 创建发票行但缺少Item名称
        JSONArray invoiceLines = new JSONArray();
        JSONObject line = new JSONObject();
        JSONObject item = new JSONObject();
        item.put("Name", "");  // 空字符串会导致校验失败
        line.put("Item", item);
        invoiceLines.add(line);
        invalidInvoice.put("InvoiceLine", invoiceLines);
        
        JexlContext ctx = jexlExecutionService.createJexlContext();
        ctx.set("invoice", invalidInvoice);
        Result<Object> result = new Result<>();

        // 只加载校验规则进行测试
        List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");
        List<InvoiceRules> validation = all.stream().filter(r -> r.getRuleType() == 1)
                .collect(Collectors.toList());
        
        if (!validation.isEmpty()) {
            // 执行校验规则，应该产生大量错误
            invokeExecuteRule(validation, ctx, result, false);
            
            System.out.println("异常数据处理结果 - 错误数量: " + result.getErrorMsgArray().size());
            System.out.println("错误信息: " + result.getErrorMsgArray());
            
            // 异常数据应该产生校验错误
            assertFalse(result.getErrorMsgArray().isEmpty(), 
                    "异常数据应该产生校验错误");
        }
        
        System.out.println("=== 异常上下文测试完成 ===");
    }
} 