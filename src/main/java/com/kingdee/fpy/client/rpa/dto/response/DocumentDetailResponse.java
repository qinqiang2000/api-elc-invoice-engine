package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.DeliveryStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文档详情响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentDetailResponse extends BaseResponse {
    private DocumentDetailData data;
    private Object xml;
    
    @Data
    public static class DocumentDetailData {
        private String documentId;
        private String documentType;
        private String invoiceTypeCode;
        private String invoiceSubType;
        private Boolean selfbilled;
        private String NO;
        private String issueDate;
        private String customerName;
        private String customerID;
        private String supplierName;
        private String supplierID;
        private String documentCurrency;
        private String taxExclusiveAmount;
        private String taxAmount;
        private String totalAmount;
        private String orderRefId;
        private String invoiceRefId;
        private String invoiceStatus;
        private String issueStatus;
        private List<DeliveryStatus> deliveryStatus;
        private String createdTime;
        private String updatedTime;
    }
}