package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 发票相关API的请求头
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class InvoiceHeaders {
    
    /**
     * 授权头
     */
    private String authorization;
    
    /**
     * 公司ID（OUNO）
     */
    private String companyId;
    
    /**
     * 时区（默认UTC）
     */
    private String timezone;
    
    /**
     * 客户端跟踪ID
     */
    private String clientTraceId;
}