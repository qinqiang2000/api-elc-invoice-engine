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
        
        // 验证Result结构
        assertNotNull(obj.getString("errcode"));
        assertNotNull(obj.getString("message"));
        assertNotNull(obj.getString("traceId"));
        
        // 验证data字段中的内容
        JSONObject data = obj.getJSONObject("data");
        assertNotNull(data);
        assertNotNull(data.getJSONObject("generatedRule"));
        assertEquals(Integer.valueOf(1), data.getJSONObject("generatedRule").getInteger("ruleType"));
        assertEquals("invoice.totalAmount", data.getJSONObject("generatedRule").getString("fieldPath"));
        assertFalse(data.getBooleanValue("saved"));
        assertNotNull(data.getJSONArray("attempts"));
        // at least one attempt and syntaxOk should be true
        assertTrue(data.getJSONArray("attempts").size() >= 1);
        JSONObject firstAttempt = data.getJSONArray("attempts").getJSONObject(0);
        assertTrue(firstAttempt.getBooleanValue("syntaxOk"));
    }

    @Test
    public void validate_shouldReturnValid_forCorrectJexlExpressions() {
        String url = "/api/ai/rules/jexl/validate";
        Map<String, Object> body = new HashMap<>();
        body.put("expression", "invoice != null && invoice.totalAmount.doubleValue() > 0");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> req = new HttpEntity<>(JSON.toJSONString(body), headers);

        ResponseEntity<String> resp = restTemplate.postForEntity(url, req, String.class);
        assertTrue(resp.getStatusCode().is2xxSuccessful(), "response should be 2xx");
        JSONObject obj = JSON.parseObject(resp.getBody());
        
        // 验证Result结构
        assertNotNull(obj.getString("errcode"));
        assertNotNull(obj.getString("message"));
        assertNotNull(obj.getString("traceId"));
        
        // 验证data字段中的内容
        JSONObject data = obj.getJSONObject("data");
        assertNotNull(data);
        assertTrue(data.getBooleanValue("valid"), "should be valid");
        assertNotNull(data.getJSONArray("errors"));
        assertEquals(0, data.getJSONArray("errors").size(), "should have no errors");
    }

    @Test
    public void validate_shouldReturnInvalid_forIncorrectJexlExpressions() {
        String url = "/api/ai/rules/jexl/validate";
        Map<String, Object> body = new HashMap<>();
        body.put("expression", "invoice.totalAmount +"); // incomplete expression

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> req = new HttpEntity<>(JSON.toJSONString(body), headers);

        ResponseEntity<String> resp = restTemplate.postForEntity(url, req, String.class);
        assertTrue(resp.getStatusCode().is2xxSuccessful(), "response should be 2xx");
        JSONObject obj = JSON.parseObject(resp.getBody());
        
        // 验证Result结构
        assertNotNull(obj.getString("errcode"));
        assertNotNull(obj.getString("message"));
        assertNotNull(obj.getString("traceId"));
        
        // 验证data字段中的内容
        JSONObject data = obj.getJSONObject("data");
        assertNotNull(data);
        assertFalse(data.getBooleanValue("valid"), "should be invalid");
        assertNotNull(data.getJSONArray("errors"));
        assertTrue(data.getJSONArray("errors").size() > 0, "should have errors");
        
        // Check error structure
        JSONObject firstError = data.getJSONArray("errors").getJSONObject(0);
        assertNotNull(firstError.getString("field"));
        assertNotNull(firstError.getString("message"));
    }

    @Test
    public void validate_shouldReturnValid_forSimpleExpression() {
        String url = "/api/ai/rules/jexl/validate";
        Map<String, Object> body = new HashMap<>();
        body.put("expression", "1 + 1 == 2");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> req = new HttpEntity<>(JSON.toJSONString(body), headers);

        ResponseEntity<String> resp = restTemplate.postForEntity(url, req, String.class);
        assertTrue(resp.getStatusCode().is2xxSuccessful(), "response should be 2xx");
        JSONObject obj = JSON.parseObject(resp.getBody());
        
        // 验证Result结构
        assertNotNull(obj.getString("errcode"));
        assertNotNull(obj.getString("message"));
        assertNotNull(obj.getString("traceId"));
        
        // 验证data字段中的内容
        JSONObject data = obj.getJSONObject("data");
        assertNotNull(data);
        assertTrue(data.getBooleanValue("valid"), "should be valid");
        assertEquals(0, data.getJSONArray("errors").size(), "should have no errors");
    }
} 