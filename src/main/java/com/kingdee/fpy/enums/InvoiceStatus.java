package com.kingdee.fpy.enums;

/**
 * 发票综合状态枚举
 */
public enum InvoiceStatus {
    
    /**
     * 发票就绪
     */
    INVOICE_READY(1, "InvoiceReady", "发票就绪"),
    
    /**
     * 税局上报中
     */
    REPORTING(2, "Reporting", "税局上报中"),
    
    /**
     * 已上报税局
     */
    REPORTED(3, "Reported", "已上报税局"),
    
    /**
     * 上报税局失败
     */
    REPORT_FAILED(4, "ReportFailed", "上报税局失败"),
    
    /**
     * 交付中
     */
    DELIVERING(5, "Delivering", "交付中"),
    
    /**
     * 已交付
     */
    DELIVERED(6, "Delivered", "已交付"),
    
    /**
     * 交付失败
     */
    DELIVER_FAILED(7, "DeliverFailed", "交付失败");

    private final int code;
    private final String value;
    private final String description;

    InvoiceStatus(int code, String value, String description) {
        this.code = code;
        this.value = value;
        this.description = description;
    }

    /**
     * 获取状态码
     * @return 状态码
     */
    public int getCode() {
        return code;
    }

    /**
     * 获取状态值
     * @return 状态值
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取状态描述
     * @return 状态描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 根据状态码获取枚举实例
     * @param code 状态码
     * @return 枚举实例
     */
    public static InvoiceStatus fromCode(int code) {
        for (InvoiceStatus status : values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown invoice status code: " + code);
    }

    /**
     * 根据状态值获取枚举实例
     * @param value 状态值
     * @return 枚举实例
     */
    public static InvoiceStatus fromValue(String value) {
        for (InvoiceStatus status : values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown invoice status value: " + value);
    }

    @Override
    public String toString() {
        return String.format("InvoiceStatus{code=%d, value='%s', description='%s'}", 
                           code, value, description);
    }
}