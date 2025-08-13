package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 文档预览请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentPreviewRequest {
    
    /**
     * 请求ID（唯一请求标识）
     */
    private String requestId;
    
    /**
     * 载荷文件
     */
    private Resource payload;
    
    /**
     * 模版文件ID（可选）
     */
    private String templateFileId;
    
    /**
     * LOGO文件ID（可选）
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
}