package com.kingdee.fpy.ai.rules;

import static org.junit.Assert.*;

import com.kingdee.fpy.ai.llm.LlmClient.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class RulePromptBuilderTest {

    @Test
    public void testBuildInitialContainsDbNamespace() {
        RulePromptBuilder builder = new RulePromptBuilder();
        Map<String, Object> sample = new HashMap<>();
        sample.put("invoiceNo", "INV-1");
        RulePromptBuilder.BuildParams params = new RulePromptBuilder.BuildParams(1, "invoice.total", "校验总额大于0", "CN", "Retail", 10, sample, GenerationType.FULL);
        List<Message> msgs = builder.buildInitial(params);
        assertTrue(msgs.get(0).content.contains("db.query("));
        assertTrue(msgs.get(1).content.contains("ruleType: 1"));
        assertTrue(msgs.get(1).content.contains("fieldPath: invoice.total"));
    }
} 