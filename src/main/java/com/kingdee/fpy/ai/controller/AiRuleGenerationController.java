package com.kingdee.fpy.ai.controller;

import com.kingdee.fpy.ai.rules.RuleGenerationService;
import com.kingdee.fpy.ai.rules.RuleGenerationService.Request;
import com.kingdee.fpy.ai.rules.RuleGenerationService.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai/rules/jexl")
@RequiredArgsConstructor
public class AiRuleGenerationController {

    private final RuleGenerationService ruleGenerationService;

    @PostMapping("/generate")
    public Response generate(@RequestBody Request request) {
        return ruleGenerationService.generate(request);
    }
} 