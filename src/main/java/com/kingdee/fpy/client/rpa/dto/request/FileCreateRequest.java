package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 文件创建请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class FileCreateRequest {
    
    /**
     * 请求ID
     */
    private String requestId;
    
    /**
     * 文件资源（最大10M，只支持单个文件上传）
     */
    private Resource file;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
}