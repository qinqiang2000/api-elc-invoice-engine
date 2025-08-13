package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 通道相关API的请求头
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ChannelHeaders {
    
    /**
     * 授权头
     */
    private String authorization;
    
    /**
     * 公司ID
     */
    private String companyId;
    
    /**
     * 时区
     */
    private String timezone;
}