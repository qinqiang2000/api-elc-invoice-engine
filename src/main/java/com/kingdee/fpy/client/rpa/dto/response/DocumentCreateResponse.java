package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文档创建响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentCreateResponse extends BaseResponse {
    
    /**
     * 响应数据
     */
    private DocumentCreateData data;
    
    @Data
    public static class DocumentCreateData {
        /**
         * 文档ID
         */
        private String documentId;
        
        /**
         * 文档类型
         */
        private String documentType;
        
        /**
         * 创建时间
         */
        private String createTime;
    }
}