/*
package com.kingdee.fpy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;
import com.kingdee.fpy.service.cel.CelValidationService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * @Author: 金帆
 * @Date: 2025/7/29 16:09
 * @Description:
 *//*

@RestController
@RequestMapping("/api/users")
public class CelController {
    @Autowired
    private CelValidationService celValidationService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody JSONObject params) {
        // 定义校验规则
        //String validationRule = "invoice.age >= 18 && invoice.name.matches('[a-zA-Z]+')";
        String validationRule = params.getString("validationRule");
        String execoutRule = params.getString("execoutRule");

        // 准备变量
        Map<String, Object> variables =new HashMap<>();
       // variables.put("invoice", JSON.parseObject(JSON.toJSONString(params.getJSONObject("invoice")), invoice.class));
        variables.put("invoice",params.getJSONObject("invoice"));
        variables =ImmutableMap.of(
                "invoice", params.getJSONObject("invoice"));
        // 执行校验
        if (!celValidationService.validate(validationRule, variables)) {
            return ResponseEntity.badRequest().body("校验失败");
        }else{
            Object evaluate = celValidationService.evaluate(execoutRule, variables);
            System.out.println(evaluate);
        }

        // 处理业务逻辑
        return ResponseEntity.ok("校验补全成功");
    }
}
*/
