package com.kingdee.fpy.ai.rules;

import static org.junit.Assert.*;

import com.kingdee.fpy.ai.config.LlmProperties;
import com.kingdee.fpy.ai.llm.LlmClient;
import com.kingdee.fpy.ai.validation.JexlValidationService;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.service.InvoiceRulesService;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.junit.Before;
import org.junit.Test;

public class LlmRuleGenerationServiceTest {

    static class StubLlm implements LlmClient {
        int callCount = 0;
        @Override public ChatResult chat(List<Message> messages, Options options) {
            callCount++;
            ChatResult res = new ChatResult();
            if (callCount == 1) {
                // invalid JSON
                res.content = "{";
            } else {
                res.content = "{\"ruleType\":1,\"fieldPath\":\"invoice.total\",\"ruleExpression\":\"1 + 1 == 2\",\"active\":true}";
            }
            return res;
        }
    }

    static class NoopInvoiceRulesService implements InvoiceRulesService {
        @Override public int insert(InvoiceRules invoiceRules) { invoiceRules.setId(1L); return 1; }
        @Override public int updateById(InvoiceRules invoiceRules) { return 0; }
        @Override public int deleteById(Long id) { return 0; }
        @Override public InvoiceRules selectById(Long id) { return null; }
        @Override public List<InvoiceRules> selectAll() { return new ArrayList<>(); }
        @Override public List<InvoiceRules> selectByTenantIdOrCompanyId(String tenantId, String companyId, String country) { return new ArrayList<>(); }
    }

    private LlmRuleGenerationService service;

    @Before
    public void setup() throws Exception {
        StubLlm llm = new StubLlm();
        RulePromptBuilder builder = new RulePromptBuilder();
        JexlValidationService jexlValidationService = new JexlValidationService();
        JexlEngine engine = new JexlBuilder().create();
        java.lang.reflect.Field f = JexlValidationService.class.getDeclaredField("jexlEngine");
        f.setAccessible(true);
        f.set(jexlValidationService, engine);
        LlmProperties props = new LlmProperties();
        InvoiceRulesService irs = new NoopInvoiceRulesService();
        service = new LlmRuleGenerationService(llm, builder, jexlValidationService, props, irs);
    }

    @Test
    public void testGenerateWithRepair() {
        RuleGenerationService.Request req = new RuleGenerationService.Request();
        req.ruleType = 1; req.fieldPath = "invoice.total"; req.businessIntent = "校验总额大于0"; req.save = true; req.maxRetries = 2;
        RuleGenerationService.Response resp = service.generate(req);
        assertNotNull(resp.generatedRule);
        assertTrue(resp.attempts.size() >= 2);
        assertTrue(resp.saved);
        assertEquals(Long.valueOf(1L), resp.ruleId);
    }
} 