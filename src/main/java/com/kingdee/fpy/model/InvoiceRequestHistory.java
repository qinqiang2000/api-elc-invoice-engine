package com.kingdee.fpy.model;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 发票申请历史记录实体类
 * 对应表：t_invoice_request_history
 */
@Data
public class InvoiceRequestHistory {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 发票ID
     */
    private String invoiceId;
    
    /**
     * 发票行ID
     */
    private String invoiceLineId;
    
    /**
     * 状态
     */
    private String status;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}