package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件删除响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileDeleteResponse extends BaseResponse {
    
    /**
     * 响应数据
     */
    private FileDeleteData data;
    
    @Data
    public static class FileDeleteData {
        /**
         * 文件ID
         */
        private String fileId;
        
        /**
         * 删除时间
         */
        private String deleteTime;
    }
}