package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 通道创建请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ChannelCreateRequest {
    
    /**
     * 通道数据
     */
    private ChannelData data;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
    
    @Data
    public static class ChannelData {
        /**
         * 优先级
         */
        private String priority;
        
        /**
         * 客户端ID
         */
        private String clientid;
        
        /**
         * 客户端密钥
         */
        private String clientSecret;
        
        /**
         * 联系人姓名
         */
        private String contactName;
        
        /**
         * 联系人邮箱
         */
        private String contactMail;
        
        /**
         * 通道类型
         * CN_RPA - 中国RPA
         * CN_LEQI - 中国乐企
         * SG_DP - 新加坡DP
         */
        private String type;
    }
}