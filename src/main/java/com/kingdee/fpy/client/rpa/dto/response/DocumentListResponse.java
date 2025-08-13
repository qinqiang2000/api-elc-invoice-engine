package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文档列表响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentListResponse extends BaseResponse {
    private DocumentListData data;
    
    @Data
    public static class DocumentListData {
        private Boolean hasMore;
        private Integer nextCursor;
        private List<DocumentDetailResponse.DocumentDetailData> document;
    }
}