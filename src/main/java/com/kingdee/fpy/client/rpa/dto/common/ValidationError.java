package com.kingdee.fpy.client.rpa.dto.common;

import lombok.Data;

/**
 * 验证错误信息
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ValidationError {
    
    /**
     * 错误代码
     */
    private String code;
    
    /**
     * 错误消息
     */
    private String message;
    
    /**
     * 多语言错误消息
     */
    private String messageLang;
}