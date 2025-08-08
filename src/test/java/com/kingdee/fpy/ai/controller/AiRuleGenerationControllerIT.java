package com.kingdee.fpy.ai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.ai.llm.LlmClient;
import com.kingdee.fpy.ai.validation.JexlValidationService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("local")
public class AiRuleGenerationControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @TestConfiguration
    static class StubLlmConfig {
        @Bean
        @Primary
        public LlmClient stubLlmClient() {
            return new LlmClient() {
                int count = 0;
                @Override
                public ChatResult chat(List<Message> messages, Options options) {
                    count++;
                    ChatResult res = new ChatResult();
                    if (count == 1) {
                        // Return directly valid JSON for simplicity
                        res.content = "{\"ruleType\":1,\"fieldPath\":\"invoice.totalAmount\",\"applyTo\":\"invoice != null\",\"ruleExpression\":\"invoice.totalAmount != null && invoice.totalAmount > 0\",\"errorMessage\":\"总金额必须大于0\",\"priority\":5}";
                    } else {
                        res.content = res.content;
                    }
                    return res;
                }
            };
        }
    }

    @Test
    public void generate_shouldReturnValidRule_withoutSaving() {
        String url = "/api/ai/rules/jexl/generate";
        Map<String, Object> body = new HashMap<>();
        body.put("ruleType", 1);
        body.put("fieldPath", "invoice.totalAmount");
        body.put("businessIntent", "发票总金额必须大于0；不符合则返回失败");
        body.put("country", "CN");
        body.put("priority", 5);
        body.put("save", false);
        body.put("maxRetries", 1);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> req = new HttpEntity<>(JSON.toJSONString(body), headers);

        ResponseEntity<String> resp = restTemplate.postForEntity(url, req, String.class);
        assertTrue(resp.getStatusCode().is2xxSuccessful(), "response should be 2xx");
        JSONObject obj = JSON.parseObject(resp.getBody());
        assertNotNull(obj.getJSONObject("generatedRule"));
        assertEquals(Integer.valueOf(1), obj.getJSONObject("generatedRule").getInteger("ruleType"));
        assertEquals("invoice.totalAmount", obj.getJSONObject("generatedRule").getString("fieldPath"));
        assertFalse(obj.getBooleanValue("saved"));
        assertNotNull(obj.getJSONArray("attempts"));
        // at least one attempt and syntaxOk should be true
        assertTrue(obj.getJSONArray("attempts").size() >= 1);
        JSONObject firstAttempt = obj.getJSONArray("attempts").getJSONObject(0);
        assertTrue(firstAttempt.getBooleanValue("syntaxOk"));
    }
} 