package com.kingdee.fpy.client.rpa.dto.common;

import lombok.Data;

/**
 * RPA API响应基类
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class BaseResponse {
    
    /**
     * 响应代码
     */
    private String code;
    
    /**
     * 响应消息
     */
    private String message;
    
    /**
     * 跟踪ID
     */
    private String traceid;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
}