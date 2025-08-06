package com.kingdee.fpy.dto;

import javax.validation.constraints.NotBlank;

public class InvoiceDTO {
    private Long id;

    @NotBlank(message = "国家编码不能为空")
    private String countryCode;

    @NotBlank(message = "主字段内容不能为空")
    private String mainFieldsJson;

    private String extFieldsJson;

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public String getMainFieldsJson() { return mainFieldsJson; }
    public void setMainFieldsJson(String mainFieldsJson) { this.mainFieldsJson = mainFieldsJson; }
    public String getExtFieldsJson() { return extFieldsJson; }
    public void setExtFieldsJson(String extFieldsJson) { this.extFieldsJson = extFieldsJson; }
} 