package com.kingdee.fpy.client.rpa.dto.common;

import lombok.Data;

/**
 * RPA API错误响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ErrorResponse {
    
    /**
     * 错误消息
     */
    private String message;
    
    /**
     * 错误代码
     */
    private String errorcode;
}