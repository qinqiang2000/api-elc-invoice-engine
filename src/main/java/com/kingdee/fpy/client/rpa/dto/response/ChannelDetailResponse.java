package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通道详情响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelDetailResponse extends BaseResponse {
    private ChannelDetailData data;
    
    @Data
    public static class ChannelDetailData {
        private String channelId;
        private String priority;
        private String clientid;
        private String clientSecret;
        private String contactName;
        private String contactMail;
        private String type;
        private String status; // Activating, Activated, Deactivating, Deactivated
    }
}