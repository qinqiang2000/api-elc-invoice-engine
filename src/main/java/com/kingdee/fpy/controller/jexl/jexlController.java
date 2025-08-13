package com.kingdee.fpy.controller.jexl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.service.InvoiceApplyService;
import com.kingdee.fpy.service.InvoiceRulesService;
import com.kingdee.fpy.service.cel.JexlExecutionService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.util.StreamUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author: 金帆
 * @Date: 2025/7/31 10:15
 * @Description: JEXL控制器，演示数据库函数使用
 */
@RestController
@RequestMapping("/jexl")
@Slf4j
public class jexlController {

    @Autowired
    private  JexlExecutionService jexlService;

    @Autowired
    private InvoiceApplyService invoiceApplyService;

    @Autowired
    private InvoiceRulesService invoiceRulesService;

    @PostMapping("/api/execute")
    @ResponseBody
    public Map<String, Object> apiExecute(@RequestBody Map<String, Object> params) {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        try {
            Object expression = params.get("expression");
            JSONObject invoice = JSON.parseObject(JSON.toJSONString(params.get("invoice")));
            Object o = jexlService.executeExpression(expression.toString(), invoice);
            objectObjectHashMap.put("result", invoice);
            objectObjectHashMap.put("jexelResult", o);
        } catch (Exception e) {
            objectObjectHashMap.put("result", e.getMessage());
        }
        return objectObjectHashMap;
    }

    @PostMapping("/api/validateInvoice")
    @ResponseBody
    public Result<JSONObject> validateInvoice(@RequestBody Map<String, Object> params) {
        try {
            String companyId = (String) params.get("companyId");
            String ruleCode = (String) params.get("ruleCode");
            Object invoiceObj = params.get("invoice");
            
            if (invoiceObj == null) {
                return Result.error("400", "发票数据不能为空");
            }
            
            JSONObject invoice;
            if (invoiceObj instanceof JSONObject) {
                invoice = (JSONObject) invoiceObj;
            } else {
                invoice = JSON.parseObject(JSON.toJSONString(invoiceObj));
            }
            
            Result<JSONObject> result = invoiceApplyService.validateInvoiceByRule(companyId, ruleCode, invoice);
            
            // 验证成功且提供了规则编码，则更新规则状态为测试通过
            if (result.isSuccess() && StringUtils.isNotBlank(ruleCode)) {
                try {
                    invoiceRulesService.updateStatus(ruleCode, 2); // 2表示测试通过
                    log.info("规则验证成功，状态已更新为测试通过，规则编码：{}", ruleCode);
                } catch (Exception e) {
                    log.error("更新规则状态失败，规则编码：{}", ruleCode, e);
                    // 不影响主流程，仅记录日志
                }
            }
            
            return result;
            
        } catch (Exception e) {
            log.error("发票规则校验接口异常", e);
            return Result.error("500", "系统异常：" + e.getMessage());
        }
    }

    @GetMapping("/api/getInvoiceData")
    @ResponseBody
    public Result<JSONObject> getInvoiceData() {
        try {
            ClassPathResource resource = new ClassPathResource("json/invoice.json");
            String jsonContent = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
            JSONObject invoiceData = JSON.parseObject(jsonContent);
            return Result.success(invoiceData);
        } catch (IOException e) {
            log.error("读取发票数据文件失败", e);
            return Result.error("500", "读取发票数据失败：" + e.getMessage());
        } catch (Exception e) {
            log.error("获取发票数据异常", e);
            return Result.error("500", "获取发票数据异常：" + e.getMessage());
        }
    }

}
