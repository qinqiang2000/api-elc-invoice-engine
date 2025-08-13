package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import java.util.List;

/**
 * 文档发送请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentSendRequest {
    
    /**
     * 请求数据
     */
    private DocumentSendData data;
    
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
    
    @Data
    public static class DocumentSendData {
        
        /**
         * 请求ID
         */
        private String requestId;
        
        /**
         * 投递方式列表
         */
        private List<DeliveryMethod> delivery;
    }
    
    @Data
    public static class DeliveryMethod {
        
        /**
         * 投递方法（EMAIL, SMS）
         */
        private String method;
        
        /**
         * 账户
         */
        private String account;
        
        /**
         * 模版（可选）
         */
        private String template;
    }
}