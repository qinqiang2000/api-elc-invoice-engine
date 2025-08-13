package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 文档验证请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentValidateRequest {
    
    /**
     * 文档类型
     */
    private String documentType;
    
    /**
     * 载荷文件
     */
    private Resource payload;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
}