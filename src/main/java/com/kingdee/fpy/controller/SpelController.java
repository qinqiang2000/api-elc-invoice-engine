package com.kingdee.fpy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.service.cel.SpelValidationService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 金帆
 * @Date: 2025/7/29 16:09
 * @Description:
 */
@RestController
@RequestMapping("/api/spel")
public class SpelController {
    @Autowired
    private SpelValidationService spelValidationService;
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.addPropertyAccessor(new MapAccessor() {
            @Override
            public boolean canRead(EvaluationContext ctx, Object target, String name) {
                return (target instanceof Map);
            }
        });

        Map<String, Object> sampleMap = new HashMap<>();
        sampleMap.put("testKey", "testValue");
        context.setVariable("map", sampleMap);
        // 测试方括号表示法
        System.out.println(parser.parseExpression("#map['testKey']").getValue(context));
        // 测试点表示法
        System.out.println(parser.parseExpression("#map.testKey").getValue(context));
        // 应该输出"testValue"


    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody JSONObject params) {
        // 定义校验规则
        //String validationRule = "invoice.age >= 18 && invoice.name.matches('[a-zA-Z]+')";
        String validationRule = params.getString("validationRule");
        String execoutRule = params.getString("execoutRule");

        // 准备变量
        Map<String, Object> variables =new HashMap<>();
       // variables.put("invoice", JSON.parseObject(JSON.toJSONString(params.getJSONObject("invoice")), invoice.class));
        variables.put("invoice", params.getJSONObject("invoice"));

        // 执行校验
        // spelValidationService.process(JSON.parseObject(JSON.toJSONString(params.getJSONObject("invoice")), invoice.class),validationRule,execoutRule);
        spelValidationService.process(variables,validationRule,execoutRule);

        // 处理业务逻辑
        return ResponseEntity.ok("校验补全成功");
    }
}
