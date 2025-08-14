package com.kingdee.fpy.model;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 发票实体类
 * 对应表：t_invoice
 */
@Data
public class Invoice {
    
    /**
     * 主键ID
     */
    private Long id;
    
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
    private LocalDateTime issueDate;
    
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
     * 开具状态
     */
    private Integer issueStatus;
    
    /**
     * 税局确认ID
     */
    private String auditId;
    
    /**
     * 税局传输ID
     */
    private String submissionId;
    
    /**
     * 发票综合状态
     * 1-InvoiceReady(发票就绪)
     * 2-Reporting(税局上报中)
     * 3-Reported(已上报税局)
     * 4-ReportFailed(上报税局失败)
     * 5-Delivering(交付中)
     * 6-Delivered(已交付)
     * 7-DeliverFailed(交付失败)
     */
    private Integer status;
    
    /**
     * 错误信息
     */
    private String errorMessage;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
} 