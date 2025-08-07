package com.kingdee.fpy.model;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 发票行实体类
 * 对应表：t_invoice_line
 */
@Data
public class InvoiceLine {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 申请单ID
     */
    private Long invoiceRequestId;
    
    /**
     * 行序列号
     */
    private Integer seq;
    
    /**
     * 行金额
     */
    private BigDecimal invoiceLineAmount;
    
    /**
     * 开具状态
     */
    private Integer status;
    
    /**
     * 是否多开
     */
    private Integer hasMultiline;
    
    /**
     * 关联发票ID
     */
    private Long invoiceId;
    
    /**
     * 行金额
     */
    private BigDecimal amount;
    
    /**
     * 行类型。 0正常行，1折扣2收费
     */
    private Integer type;
    
    /**
     * 商品名称
     */
    private String itemName;
    
    /**
     * 单位
     */
    private String unit;
    
    /**
     * 数量
     */
    private BigDecimal quantity;
    
    /**
     * 单价
     */
    private BigDecimal price;
    
    /**
     * 税码
     */
    private String categoryCode;
    
    /**
     * 税率
     */
    private BigDecimal taxRate;
    
    /**
     * JSON扩展字段
     */
    private String extField;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}