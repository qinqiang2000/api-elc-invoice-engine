package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.ValidationError;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文档验证响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentValidateResponse extends BaseResponse {
    private DocumentValidateData data;
    
    @Data
    public static class DocumentValidateData {
        private List<ValidationError> validateErrors;
    }
}