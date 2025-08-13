package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.ValidationError;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 清算签发响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClearanceIssueResponse extends BaseResponse {
    private ClearanceIssueData data;
    
    @Data
    public static class ClearanceIssueData {
        private String status;
        private String submissionId;
        private String ackId;
        private List<ValidationError> validateErrors;
    }
}