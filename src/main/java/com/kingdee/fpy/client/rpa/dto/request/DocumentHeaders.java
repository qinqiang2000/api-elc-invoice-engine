package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 文档相关API的请求头
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentHeaders {
    
    /**
     * 授权头
     */
    private String authorization;
    
    /**
     * 公司ID
     */
    private String companyId;
    
    /**
     * 时区（UTC格式，默认UTC0）
     */
    private String timezone;
    
    /**
     * 客户端跟踪ID
     */
    private String clientTraceId;
}