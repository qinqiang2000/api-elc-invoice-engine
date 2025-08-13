package com.kingdee.fpy.model;

/**
 * 发票申请单据综合状态枚举
 */
public enum InvoiceRequestStatus {
    
    DRAFT(1, "Draft", "草稿"),
    ENRICHING(2, "Enriching", "补全中"), 
    VALIDATED(3, "Validated", "已校验"),
    VALID_FAILED(4, "ValidFailed", "校验失败"),
    PENDING(5, "Pending", "待审核"),
    INVOICE_ISSUEING(6, "InvoiceIssueing", "开票中"),
    PART_INVOICED(7, "PartInvoiced", "部分开票"),
    FULLY_INVOICED(8, "FullyInvoiced", "完全开票"),
    DEBIT_APPLY(9, "DebitApply", "借记申请"),
    RE_ISSUED(10, "ReIssued", "重新签发");
    
    private final Integer code;
    private final String status;
    private final String description;
    
    InvoiceRequestStatus(Integer code, String status, String description) {
        this.code = code;
        this.status = status;
        this.description = description;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getDescription() {
        return description;
    }
    
    /**
     * 根据状态码获取枚举值
     * @param code 状态码
     * @return 枚举值
     */
    public static InvoiceRequestStatus fromCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (InvoiceRequestStatus status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown invoice request status code: " + code);
    }
    
    /**
     * 根据状态名称获取枚举值
     * @param status 状态名称
     * @return 枚举值
     */
    public static InvoiceRequestStatus fromStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            return null;
        }
        for (InvoiceRequestStatus requestStatus : values()) {
            if (requestStatus.getStatus().equalsIgnoreCase(status)) {
                return requestStatus;
            }
        }
        throw new IllegalArgumentException("Unknown invoice request status: " + status);
    }
}