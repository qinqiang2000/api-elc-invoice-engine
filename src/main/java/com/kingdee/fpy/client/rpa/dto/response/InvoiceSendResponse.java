package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import com.kingdee.fpy.client.rpa.dto.common.DeliveryStatus;
import com.kingdee.fpy.client.rpa.dto.common.ValidationError;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 发票发送响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceSendResponse extends BaseResponse {
    
    /**
     * 响应数据
     */
    private InvoiceSendData data;
    
    @Data
    public static class InvoiceSendData {
        
        /**
         * 状态
         * In-progress - 进行中
         * Completed - 已完成
         * Pending - 等待中
         */
        private String status;
        
        /**
         * 结果列表
         */
        private List<InvoiceResult> result;
    }
    
    @Data
    public static class InvoiceResult {
        
        /**
         * 文档ID
         */
        private String documentId;
        
        /**
         * 签发状态
         * in-progress - 进行中
         * success - 成功
         * failure - 失败
         */
        private String issueStatus;
        
        /**
         * 投递状态列表
         */
        private List<DeliveryStatus> deliveryStatus;
        
        /**
         * 文件名
         */
        private String filename;
        
        /**
         * 提交ID（提交给清算系统的ID）
         */
        private String submissionId;
        
        /**
         * 确认ID（从清算系统返回的ID）
         */
        private String ackId;
        
        /**
         * 验证错误列表
         */
        private List<ValidationError> validationErrors;
    }
}