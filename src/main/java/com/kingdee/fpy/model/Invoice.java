package com.kingdee.fpy.model;

import java.util.Date;

public class Invoice {
    private Long id;
    private String countryCode;
    private String mainFieldsJson; // 必填字段内容
    private String extFieldsJson;  // 扩展字段内容
    private Date createdAt;
    private Date updatedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public String getMainFieldsJson() { return mainFieldsJson; }
    public void setMainFieldsJson(String mainFieldsJson) { this.mainFieldsJson = mainFieldsJson; }
    public String getExtFieldsJson() { return extFieldsJson; }
    public void setExtFieldsJson(String extFieldsJson) { this.extFieldsJson = extFieldsJson; }
    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
} 