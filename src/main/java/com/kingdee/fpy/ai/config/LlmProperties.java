package com.kingdee.fpy.ai.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * LLM client configuration (provider-agnostic).
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "llm")
public class LlmProperties {
    /** Provider identifier, e.g., openai, azure-openai, ollama */
    private String provider = "openai";

    /** Base URL for API */
    private String baseUrl = "https://api.openai.com/v1";

    /** Model name */
    private String model = "gpt-5-mini";

    /** API key (can be set from env OPENAI_API_KEY via application.properties mapping) */
    private String apiKey;

    /** Request timeout milliseconds */
    private int timeoutMs = 20000;

    /** Max repair attempts for generation (controller may override per-request) */
    private int defaultMaxRetries = 2;

    @PostConstruct
    public void init() {
        if (apiKey == null || apiKey.isEmpty()) {
            String envKey = System.getenv("OPENAI_API_KEY");
            if (envKey != null && !envKey.isEmpty()) {
                this.apiKey = envKey;
            }
        }
    }
} 