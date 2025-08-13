package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.ValidationError;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 清算使用量响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClearanceUsageResponse extends BaseResponse {
    private ClearanceUsageData data;
    
    @Data
    public static class ClearanceUsageData {
        private String status;
        private List<ClearanceResult> result;
    }
    
    @Data
    public static class ClearanceResult {
        private String submissionStatus;
        private String submissionId;
        private String ackId;
        private String filename;
        private List<ValidationError> validateErrors;
    }
}