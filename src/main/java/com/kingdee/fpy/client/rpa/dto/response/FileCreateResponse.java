package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件创建响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileCreateResponse extends BaseResponse {
    
    /**
     * 响应数据
     */
    private FileCreateData data;
    
    @Data
    public static class FileCreateData {
        /**
         * 文件ID
         */
        private String fileId;
        
        /**
         * 创建时间
         */
        private String createTime;
    }
}