package com.kingdee.fpy.ai.llm;

import com.kingdee.fpy.ai.config.LlmProperties;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@Slf4j
public class OpenAiLlmClient implements LlmClient {

    private final LlmProperties props;
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public ChatResult chat(List<Message> messages, Options options) {
        String url = props.getBaseUrl() + "/chat/completions";

        Map<String, Object> body = new HashMap<>();
        String model = options != null && options.model != null ? options.model : props.getModel();
        body.put("model", model);
        body.put("messages", messages);
        if (options != null && options.maxTokens != null) body.put("max_tokens", options.maxTokens);
        if (options != null && options.temperature != null) body.put("temperature", options.temperature);
        if (options != null && options.jsonResponse) {
            Map<String, Object> rf = new HashMap<>();
            rf.put("type", "json_object");
            body.put("response_format", rf);
        }

        // Log request (safe)
        try {
            log.info("LLM request: provider=openai, model={}, url={}, jsonResponse={}, messages={}",
                model, url, (options != null && options.jsonResponse), toSafeMessages(messages));
        } catch (Exception ignore) {}

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(props.getApiKey());

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);
        ResponseEntity<Map> resp = restTemplate.postForEntity(url, entity, Map.class);
        Map<String, Object> respBody = resp.getBody();
        String content = null;
        if (respBody != null) {
            Object choices = respBody.get("choices");
            if (choices instanceof List) {
                List list = (List) choices;
                if (!list.isEmpty()) {
                    Object first = list.get(0);
                    if (first instanceof Map) {
                        Map firstMap = (Map) first;
                        Object msg = firstMap.get("message");
                        if (msg instanceof Map) {
                            Object c = ((Map) msg).get("content");
                            content = c == null ? null : c.toString();
                        }
                    }
                }
            }
        }

        // Log response (safe)
        try {
            String preview = content == null ? null : (content.length() > 1000 ? content.substring(0, 1000) + "..." : content);
            log.info("LLM response: model={}, contentPreview={}", model, preview);
        } catch (Exception ignore) {}

        ChatResult result = new ChatResult();
        result.content = content;
        result.raw = (Map<String, Object>) (Map) respBody;
        return result;
    }

    private String toSafeMessages(List<Message> messages) {
        if (messages == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < messages.size(); i++) {
            Message m = messages.get(i);
            String role = m.role;
            String content = m.content;
            if (content != null && content.length() > 1000) {
                content = content.substring(0, 1000) + "...";
            }
            sb.append("{role=").append(role).append(", content=").append(String.valueOf(content)).append("}");
            if (i < messages.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
} 