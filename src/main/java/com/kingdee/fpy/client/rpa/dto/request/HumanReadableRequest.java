package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 人类可读文件生成请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class HumanReadableRequest {
    
    /**
     * 请求ID
     */
    private String requestId;
    
    /**
     * 模版文件ID
     * 模版文件ID，可以通过API "create file"上传；如果为null，将使用默认模版
     */
    private String templateFileId;
    
    /**
     * LOGO文件ID
     * LOGO文件ID，可以通过API "create file"上传；如果为null，则没有LOGO
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
     * 公司ID
     */
    private String companyId;
    
    /**
     * 时区
     */
    private String timezone;
    
    /**
     * 客户端跟踪ID
     */
    private String clientTraceId;
}