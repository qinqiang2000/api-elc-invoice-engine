package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;
import java.util.List;

/**
 * 发票发送请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class InvoiceSendRequest {
    
    /**
     * 请求ID（唯一ID，幂等性，通过ID跟踪请求）
     */
    private String requestId;
    
    /**
     * 载荷文件（文档不超过10M，支持传多个文件，建议使用单据id作为文件名，保证文件名在请求内唯一）
     */
    private List<Resource> payload;
    
    /**
     * 清算通道
     * 如果为空，取国家默认值。如果国家有税局通道，则取channel中priority最小的通道；
     * NA代表强制不使用通道。
     */
    private String clearanceChannel;
    
    /**
     * 协议（取国家的默认设置）
     */
    private String protocol;
    
    /**
     * 模版文件ID
     * 传入模版文件的FileId；可以为空；为空时，取默认模版；模版可以通过Create File上传。
     */
    private String templateFileId;
    
    /**
     * LOGO文件ID
     * 传入LOGO图片的FileId；可以为空；为空时，没有LOGO；可以通过Create File上传。
     */
    private String logoFileId;
    
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
    
    /**
     * 接受语言（默认en）
     */
    private String acceptLanguage;
}