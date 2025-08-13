package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 参与方查询结果响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PartyQueryResultResponse extends BaseResponse {
    private PartyQueryResponse.PartyQueryData data;
}