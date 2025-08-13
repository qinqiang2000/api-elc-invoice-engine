package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;
import java.util.List;

/**
 * 通道更新请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class ChannelUpdateRequest {
    
    /**
     * 请求ID
     */
    private String requestId;
    
    /**
     * 通道更新数据
     */
    private ChannelUpdateData data;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
    
    @Data
    public static class ChannelUpdateData {
        /**
         * 通道信息列表
         */
        private List<ChannelInfo> channel;
    }
    
    @Data
    public static class ChannelInfo {
        /**
         * 通道ID
         */
        private String channelId;
        
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
         */
        private String type;
    }
}