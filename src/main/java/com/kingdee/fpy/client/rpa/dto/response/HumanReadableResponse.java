package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人类可读文件生成响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class HumanReadableResponse extends BaseResponse {
    private HumanReadableData data;
    
    @Data
    public static class HumanReadableData {
        private String documentId;
        private String createTime;
    }
}