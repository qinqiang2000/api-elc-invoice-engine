package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 清算使用量请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ClearanceUsageRequest {
    
    /**
     * 请求ID（唯一请求标识）
     */
    private String requestId;
    
    /**
     * 载荷文件（文档不超过10M，支持传多个文件）
     */
    private Resource payload;
    
    /**
     * 清算通道（默认为国家设置）
     */
    private String clearanceChannel;
    
    /**
     * 协议（默认为国家设置）
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
}