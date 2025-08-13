package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.DeliveryStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文档投递响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentDeliveryResponse extends BaseResponse {
    private DocumentDeliveryData data;
    
    @Data
    public static class DocumentDeliveryData {
        private List<DeliveryStatus> delivery;
    }
}