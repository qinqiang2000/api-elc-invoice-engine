package com.kingdee.fpy.model;

import java.util.Date;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 发票申请实体类
 * 对应表：t_invoice_request
 */
@Data
public class InvoiceRequest {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 唯一请求ID
     */
    private String requestId;
    
    /**
     * 关联租户
     */
    private String tenantId;
    
    /**
     * 关联企业
     */
    private String companyId;
    
    /**
     * 发票类型，380,381..
     */
    private String invoiceType;
    
    /**
     * 发票子类型
     */
    private String invoiceSubType;
    
    /**
     * 业务类型
     */
    private String submissionType;
    
    /**
     * 是否反向开票
     */
    private String sellBilled;
    
    /**
     * 发票号码
     */
    private String invoiceNo;
    
    /**
     * 开票日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date issueDate;
    
    /**
     * 销方企业ID
     */
    private String sendCompanyId;
    
    /**
     * 购方企业ID
     */
    private String receiveCompanyId;
    
    /**
     * 销方企业名称
     */
    private String sendCompanyName;
    
    /**
     * 销方国家
     */
    private String country;
    
    /**
     * 购方企业名称
     */
    private String receiverCompanyName;
    
    /**
     * 总金额
     */
    private BigDecimal totalAmount;
    
    /**
     * 税额
     */
    private BigDecimal taxAmount;
    
    /**
     * 币种代码
     */
    private String currency;
    
    /**
     * 订单ID
     */
    private String orderRefid;
    
    /**
     * 单据ID
     */
    private String billingRefid;
    
    /**
     * JSON扩展字段
     */
    private String extField;
    
    /**
     * 源单据类型
     */
    private String sourceDocumentType;
    
    /**
     * 源单据ID
     */
    private String sourceDocumentId;
    
    /**
     * 目标单据ID
     */
    private String targetDocumentId;
    
    /**
     * 单据综合状态
     * 1-Draft（草稿）
     * 2-Enriching（补全中）
     * 3-Validated（已校验）
     * 4-ValidFailed（校验失败）
     * 5-Pending（待审核）
     * 6-InvoiceIssueing（开票中）
     * 7-PartInvoiced（部分开票）
     * 8-FullyInvoiced（完全开票）
     * 9-DebitApply（借记申请）
     * 10-ReIssued（重新签发）
     */
    private Integer status;
    
    /**
     * 错误信息
     */
    private String errorMessage;
    
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;
}