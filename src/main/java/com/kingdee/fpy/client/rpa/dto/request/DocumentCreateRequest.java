package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 文档创建请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentCreateRequest {
    
    /**
     * 请求ID
     */
    private String requestId;
    
    /**
     * 载荷文件（只支持一个文件，最大10MB）
     */
    private Resource payload;
    
    /**
     * 文档类型
     * Order - 订单
     * GoodReceipt - 收货单
     * Invoice - 发票
     * InvoiceResponse - 发票响应
     */
    private String documentType;
    
    /**
     * 协议（默认值为国家设置，如：BIS3.0, SGPINT1.0）
     */
    private String protocol;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
    
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