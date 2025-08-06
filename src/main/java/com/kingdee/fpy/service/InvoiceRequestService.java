package com.kingdee.fpy.service;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.enums.RuleEnum;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.model.RuleLog;
import com.kingdee.fpy.service.cel.JexlExecutionService;
import com.kingdee.fpy.service.imp.RuleLogServiceImpl;
import com.kingdee.fpy.utils.ResultType;
import java.util.List;
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
public class InvoiceRequestService {

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
    private JexlEngine jexlEngine;

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
        executeRule(validRuls, context, "rule:{},contition:{},valid fail:{}", result,
                "rule:%s,valid fail:%s");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return result;
        }
        // 再执行补全逻辑
        executeRule(invoiceRules, context, "rule:{},contition:{},complete fail:{}", result,
                "rule:%s,complete fail:%s");
        if (!result.getErrorMsgArray().isEmpty()) {
            result.setResultType(ResultType.VALID_FAIL);
            return result;
        }
        // 入开票申请单,发票表，明细表，状态为待开票
        log.info("invoice:{}", invoice);
        // 调通道接口提交开票

        /*// json 转为xml 调通道接口开票
        log.info("submit invoice", invoice);
        Map<String, Object> xmlMap = new HashMap<>();
        xmlMap.put("invoice", invoice);
        String s = xmlBuildService.buildXmlFromJson(xmlMap);
        log.info("xml:{}", s);
        // 获取开票结果*/
        return result;
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
                    log.info(logStr, invoiceRule.getFieldPath(), invoiceRule.getRuleExpression(), invoiceRule.getErrorMessage());
                    result.getErrorMsgArray().add(String.format(errMsg, invoiceRule.getRuleName(), invoiceRule.getErrorMessage()));
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
