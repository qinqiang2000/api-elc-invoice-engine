package com.kingdee.fpy.config.piaozone;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "piao.zone")
public class PiaozoneConfig {

    private String baseUrl;

    private String tokenApi;

    private String getTenantOrgApi;


}
