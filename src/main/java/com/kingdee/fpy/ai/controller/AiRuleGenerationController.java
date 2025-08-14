package com.kingdee.fpy.ai.controller;

import com.kingdee.fpy.ai.rules.RuleGenerationService;
import com.kingdee.fpy.ai.rules.RuleGenerationService.Request;
import com.kingdee.fpy.ai.rules.RuleGenerationService.Response;
import com.kingdee.fpy.ai.validation.JexlValidationService;
import com.kingdee.fpy.commom.Result;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ai/rules/jexl")
@RequiredArgsConstructor
public class AiRuleGenerationController {

    private final RuleGenerationService ruleGenerationService;
    private final JexlValidationService jexlValidationService;

    @PostMapping("/generate")
    public Result<Response> generate(@RequestBody Request request) {
        Response response = ruleGenerationService.generate(request);
        return Result.success(response);
    }

    @PostMapping("/validate")
    public Result<JexlValidationResponse> validate(@RequestBody JexlValidationRequest request) {
        // 对于语法校验，我们只校验表达式本身，不区分applyTo和ruleExpression
        // applyTo不是必需的，ruleExpression（即request.getExpression()）也可以为空或仅做语法检查
        List<JexlValidationService.ValidationError> errors = jexlValidationService.validate(
                null,  // applyTo设为null，不验证applyTo
                request.getExpression(),  // 要验证的表达式
                false,  // applyTo不是必需的
                false   // ruleExpression不是必需的（只做语法验证）
        );
        
        JexlValidationResponse validationResponse = new JexlValidationResponse();
        validationResponse.setValid(errors.isEmpty());
        validationResponse.setErrors(errors);
        return Result.success(validationResponse);
    }

    @Data
    public static class JexlValidationRequest {
        private String expression;
    }

    @Data
    public static class JexlValidationResponse {
        private boolean valid;
        private List<JexlValidationService.ValidationError> errors;
    }
} 