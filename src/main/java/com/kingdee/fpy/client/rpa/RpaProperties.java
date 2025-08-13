package com.kingdee.fpy.client.rpa;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * RPA平台API客户端配置属性
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@ConfigurationProperties(prefix = "rpa.client")
public class RpaProperties {

    /**
     * RPA平台API基础URL
     */
    private String baseUrl = "https://api-sit.piaozone.com";

    /**
     * API认证密钥
     */
    private String apiKey;

    /**
     * 默认公司ID
     */
    private String companyId;

    /**
     * 默认时区，格式为UTC格式，默认为UTC0
     */
    private String timezone = "UTC0";

    /**
     * 连接超时时间（毫秒）
     */
    private Integer connectTimeout = 30000;

    /**
     * 读取超时时间（毫秒）
     */
    private Integer readTimeout = 60000;

    /**
     * 是否启用请求日志
     */
    private boolean enableLogging = true;

    /**
     * 最大重试次数
     */
    private int maxRetries = 3;

    /**
     * 重试间隔（毫秒）
     */
    private long retryInterval = 1000;
}