package com.kingdee.fpy.model;

import lombok.Data;

/**
 * 发票查询参数
 */
@Data
public class InvoiceQuery {
    
    /**
     * 页码，从1开始
     */
    private int pageNum = 1;
    
    /**
     * 页大小
     */
    private int pageSize = 10;
    
    /**
     * 企业ID
     */
    private String companyId;
    
    /**
     * 发票类型
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
     * 发票号码
     */
    private String invoiceNo;
    
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
     * 发票综合状态
     */
    private Integer status;
    
    /**
     * 计算偏移量
     * @return 偏移量
     */
    public int getOffset() {
        return (pageNum - 1) * pageSize;
    }
}