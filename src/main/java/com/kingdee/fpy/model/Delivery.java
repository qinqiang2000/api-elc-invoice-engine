package com.kingdee.fpy.model;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 交付信息实体类
 * 对应表：t_delivery
 */
@Data
public class Delivery {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 关联发票ID
     */
    private String invoiceId;
    
    /**
     * 交付方式
     */
    private String deliveryMethod;
    
    /**
     * 状态
     */
    private String status;
    
    /**
     * 错误信息
     */
    private String errorMessage;
    
    /**
     * 内容
     */
    private String content;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}