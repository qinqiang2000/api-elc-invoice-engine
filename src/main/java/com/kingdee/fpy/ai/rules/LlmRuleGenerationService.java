package com.kingdee.fpy.ai.rules;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.ai.config.LlmProperties;
import com.kingdee.fpy.ai.llm.LlmClient;
import com.kingdee.fpy.ai.validation.JexlValidationService;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.service.InvoiceRulesService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class LlmRuleGenerationService implements RuleGenerationService {

    private final LlmClient llmClient;
    private final RulePromptBuilder promptBuilder;
    private final JexlValidationService jexlValidationService;
    private final LlmProperties props;
    private final InvoiceRulesService invoiceRulesService;

    @Override
    public Response generate(Request req) {
        RulePromptBuilder.BuildParams params = new RulePromptBuilder.BuildParams(
            req.ruleType, req.fieldPath, req.businessIntent, req.country, req.tags, req.priority, req.invoiceSample, req.generationType
        );

        LlmClient.Options options = new LlmClient.Options();
        options.model = props.getModel();
        options.jsonResponse = true;
        // Do not set temperature; some models only support default value
        // options.temperature = 0.2;

        List<AttemptInfo> attempts = new ArrayList<>();

        // initial
        LlmClient.ChatResult initial = llmClient.chat(promptBuilder.buildInitial(params), options);
        AttemptInfo a1 = validateAttempt(1, initial.content, req.generationType);
        attempts.add(a1);
        log.info("LLM attempt {} validation: syntaxOk={}, errorSummary={}", 1, a1.syntaxOk, a1.errorSummary);

        InvoiceRules finalRule = null;
        if (a1.syntaxOk) {
            finalRule = parseInvoiceRules(a1.candidateJson, req);
        } else {
            int max = req.maxRetries != null ? req.maxRetries : props.getDefaultMaxRetries();
            String prevJson = a1.candidateJson;
            String error = a1.errorSummary;
            for (int i = 0; i < max; i++) {
                LlmClient.ChatResult repaired = llmClient.chat(
                    promptBuilder.buildRepair(params, prevJson, error), options
                );
                AttemptInfo ai = validateAttempt(2 + i, repaired.content, req.generationType);
                attempts.add(ai);
                log.info("LLM attempt {} validation: syntaxOk={}, errorSummary={}", 2 + i, ai.syntaxOk, ai.errorSummary);
                if (ai.syntaxOk) {
                    finalRule = parseInvoiceRules(ai.candidateJson, req);
                    break;
                } else {
                    prevJson = ai.candidateJson;
                    error = ai.errorSummary;
                }
            }
        }

        Response resp = new Response();
        resp.generatedRule = finalRule;
        resp.saved = false;
        resp.ruleId = null;
        resp.attempts = attempts;

        if (finalRule != null) {
            ensureRuleCode(finalRule);
            log.info("Final rule prepared: ruleCode={}, fieldPath={}, ruleType={}", finalRule.getRuleCode(), finalRule.getFieldPath(), finalRule.getRuleType());
        }

        if (finalRule != null && req.save) {
            // defaults
            if (finalRule.getActive() == null) finalRule.setActive(Boolean.TRUE);
            if (finalRule.getPriority() == null) finalRule.setPriority(req.priority != null ? req.priority : 0);
            if (finalRule.getCountry() == null) finalRule.setCountry(req.country);
            if (finalRule.getTags() == null) finalRule.setTags(req.tags);
            if (finalRule.getRuleType() == 0) finalRule.setRuleType(req.ruleType);
            // persist
            int affected = invoiceRulesService.insert(finalRule);
            // assume mapper fills id via DB (or we can fetch)
            resp.saved = affected > 0;
            resp.ruleId = finalRule.getId();
        }

        return resp;
    }

    private AttemptInfo validateAttempt(int index, String content, GenerationType generationType) {
        AttemptInfo ai = new AttemptInfo();
        ai.index = index;
        ai.candidateJson = content;
        try {
            JSONObject obj = JSON.parseObject(content);
            String applyTo = obj.getString("applyTo");
            String ruleExpression = obj.getString("ruleExpression");

            // 根据生成类型调整验证逻辑
            List<JexlValidationService.ValidationError> errors = new ArrayList<>();
            switch (generationType) {
                case RULE_EXPRESSION_ONLY:
                    // 仅验证ruleExpression，applyTo不是必需的
                    errors.addAll(jexlValidationService.validate(applyTo, ruleExpression, false, true));
                    break;
                case APPLY_TO_ONLY:
                    // 仅验证applyTo，ruleExpression不是必需的
                    errors.addAll(jexlValidationService.validate(applyTo, ruleExpression, true, false));
                    break;
                default: // FULL
                    // 验证完整规则，两个字段都是必需的
                    errors.addAll(jexlValidationService.validate(applyTo, ruleExpression, true, true));

                    // Note: 仅记录重复条件，不触发修复循环（性能考量）
                    List<String> repeats = findRepeatedNullChecks(applyTo, ruleExpression);
                    if (!repeats.isEmpty()) {
                        log.warn("ruleExpression contains conditions repeated from applyTo: {}", String.join(" | ", repeats));
                    }
                    break;
            }

            ai.syntaxOk = errors.isEmpty();
            if (!ai.syntaxOk) {
                StringBuilder sb = new StringBuilder();
                for (JexlValidationService.ValidationError e : errors) {
                    sb.append(e.getField()).append(": ").append(e.getMessage()).append("; ");
                }
                ai.errorSummary = sb.toString();
            }
        } catch (Exception ex) {
            ai.syntaxOk = false;
            ai.errorSummary = "Invalid JSON: " + ex.getMessage();
        }
        return ai;
    }

    private List<String> findRepeatedNullChecks(String applyTo, String ruleExpression) {
        List<String> repeats = new ArrayList<>();
        if (applyTo == null || ruleExpression == null) return repeats;
        String at = applyTo.replaceAll("\n", " ").trim();
        String re = ruleExpression.replaceAll("\n", " ").trim();
        if (at.isEmpty() || re.isEmpty()) return repeats;

        // Extract simple null-check fragments from applyTo, like "invoice.xxx != null" or "invoice.xxx == null"
        Pattern p = Pattern.compile("(invoice\\.[A-Za-z0-9_\\.]+\\s*(?:!=|==)\\s*null)");
        Matcher m = p.matcher(at);
        Set<String> set = new HashSet<>();
        while (m.find()) {
            String frag = m.group(1).replaceAll("\\s+", " ").trim();
            if (frag.length() >= 12) set.add(frag);
        }
        // Also catch trivial invoice != null checks if any（虽然我们已在提示词禁止，但仍防御）
        if (at.contains("invoice != null")) set.add("invoice != null");
        if (at.contains("invoice==null") || at.contains("invoice == null")) set.add("invoice == null");

        for (String frag : set) {
            if (re.contains(frag)) {
                repeats.add(frag);
            }
        }
        return repeats;
    }

    private InvoiceRules parseInvoiceRules(String json, Request req) {
        try {
            InvoiceRules rule = JSON.parseObject(json, InvoiceRules.class);
            // ensure minimal required
            if (rule.getRuleType() == 0) rule.setRuleType(req.ruleType);
            if (rule.getFieldPath() == null) rule.setFieldPath(req.fieldPath);
            return rule;
        } catch (Exception ex) {
            return null;
        }
    }

    private void ensureRuleCode(InvoiceRules rule) {
        if (rule == null) return;
        String code = rule.getRuleCode();
        if (code == null || code.contains("<timestamp>")) {
            rule.setRuleCode("AI-sys-" + System.currentTimeMillis());
        }
    }
} 