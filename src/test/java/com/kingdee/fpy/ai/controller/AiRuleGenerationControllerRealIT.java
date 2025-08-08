package com.kingdee.fpy.ai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("local")
@EnabledIfSystemProperty(named = "llm.api-key", matches = ".+")
public class AiRuleGenerationControllerRealIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void generate_live_shouldSucceed_withSyntaxOk() {
        String url = "/api/ai/rules/jexl/generate";
        Map<String, Object> body = new HashMap<>();
        body.put("ruleType", 1);
        body.put("fieldPath", "invoice.totalAmount");
        body.put("businessIntent", "发票总金额必须大于0；不符合则返回失败");
        body.put("country", "CN");
        body.put("priority", 1);
        // save 不传，默认 false
        body.put("maxRetries", 1);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> req = new HttpEntity<>(JSON.toJSONString(body), headers);

        ResponseEntity<String> resp = restTemplate.postForEntity(url, req, String.class);
        assertTrue(resp.getStatusCode().is2xxSuccessful(), "response should be 2xx");
        assertNotNull(resp.getBody());
        JSONObject obj = JSON.parseObject(resp.getBody());
        assertNotNull(obj.getJSONObject("generatedRule"));
        assertEquals("invoice.totalAmount", obj.getJSONObject("generatedRule").getString("fieldPath"));
        assertFalse(obj.getBooleanValue("saved"));
        assertNotNull(obj.getJSONArray("attempts"));
        assertTrue(obj.getJSONArray("attempts").size() >= 1);
        assertTrue(obj.getJSONArray("attempts").getJSONObject(0).getBooleanValue("syntaxOk"));
    }
} 