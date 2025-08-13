package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import org.springframework.core.io.Resource;

/**
 * 文档转换请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentConvertRequest {
    
    /**
     * 载荷文件
     */
    private Resource payload;
    
    /**
     * 文档类型
     */
    private String documentType;
    
    /**
     * 协议
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