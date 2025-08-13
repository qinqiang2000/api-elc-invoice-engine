package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通道更新响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelUpdateResponse extends BaseResponse {
    private ChannelCreateResponse.ChannelCreateData data;
}