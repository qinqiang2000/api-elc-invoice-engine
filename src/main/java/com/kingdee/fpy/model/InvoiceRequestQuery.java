package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;

/**
 * 发票申请查询参数
 */
@Data
public class InvoiceRequestQuery {
    
    /**
     * 页码，从1开始
     */
    private int pageNum = 1;
    
    /**
     * 页大小
     */
    private int pageSize = 10;


    /**
     * 唯一请求ID
     */
    private String requestId;
    
    /**
     * 租户ID
     */
    private String tenantId;
    
    /**
     * 状态
     */
    private Integer status;
    
    /**
     * 发票号
     */
    private String invoiceNo;
    
    /**
     * 企业ID
     */
    private String companyId;
    
    /**
     * 创建时间开始（用于时间范围查询）
     */
    private Date startTime;
    
    /**
     * 创建时间结束（用于时间范围查询）
     */
    private Date endTime;
    
    /**
     * 计算偏移量
     * @return 偏移量
     */
    public int getOffset() {
        return (pageNum - 1) * pageSize;
    }
}