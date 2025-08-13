package com.kingdee.fpy.model;

/**
 * 发票申请查询参数
 */
public class
InvoiceRequestQuery {
    
    /**
     * 页码，从1开始
     */
    private int pageNum = 1;
    
    /**
     * 页大小
     */
    private int pageSize = 10;
    
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
    
    public InvoiceRequestQuery() {
    }
    
    public InvoiceRequestQuery(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
    
    public int getPageNum() {
        return pageNum;
    }
    
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public String getTenantId() {
        return tenantId;
    }
    
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getInvoiceNo() {
        return invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    
    public String getCompanyId() {
        return companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    /**
     * 计算偏移量
     * @return 偏移量
     */
    public int getOffset() {
        return (pageNum - 1) * pageSize;
    }
}