package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通道状态响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelStatusResponse extends BaseResponse {
    private ChannelStatusData data;
    
    @Data
    public static class ChannelStatusData {
        private String channelId;
        private String status;
    }
}