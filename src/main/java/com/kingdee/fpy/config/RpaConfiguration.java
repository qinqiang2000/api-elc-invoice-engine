package com.kingdee.fpy.config;

import com.kingdee.fpy.client.rpa.RpaClient;
import com.kingdee.fpy.client.rpa.RpaClientImpl;
import com.kingdee.fpy.client.rpa.RpaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RPA客户端配置
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Configuration
@EnableConfigurationProperties(RpaProperties.class)
@ConditionalOnProperty(prefix = "rpa.client", name = "enabled", havingValue = "true", matchIfMissing = true)
@Slf4j
public class RpaConfiguration {

    @Bean
    public RestTemplate rpaRestTemplate(RpaProperties properties) {
        RestTemplate restTemplate = new RestTemplate();
        
        // 设置超时时间
        restTemplate.getMessageConverters().forEach(converter -> {
            log.debug("RPA RestTemplate message converter: {}", converter.getClass().getSimpleName());
        });
        
        log.info("RPA RestTemplate configured with baseUrl: {}, connectTimeout: {}ms, readTimeout: {}ms", 
                properties.getBaseUrl(), properties.getConnectTimeout(), properties.getReadTimeout());
        
        return restTemplate;
    }

    @Bean
    public RpaClient rpaClient(RpaProperties properties) {
        log.info("Initializing RPA client with baseUrl: {}", properties.getBaseUrl());
        return new RpaClientImpl(properties);
    }
}