package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.DeliveryStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文档发送响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentSendResponse extends BaseResponse {
    private DocumentSendData data;
    
    @Data
    public static class DocumentSendData {
        private String requestId;
        private List<DeliveryStatus> delivery;
    }
}