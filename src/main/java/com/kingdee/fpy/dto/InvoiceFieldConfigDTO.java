package com.kingdee.fpy.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InvoiceFieldConfigDTO {
    private Long id;

    @NotBlank(message = "国家编码不能为空")
    private String countryCode;

    @NotBlank(message = "字段名不能为空")
    private String fieldName;

    @NotBlank(message = "字段标签不能为空")
    private String fieldLabel;

    @NotBlank(message = "字段类型不能为空")
    private String fieldType;

    @NotNull(message = "是否必填不能为空")
    private Boolean isRequired;

    @NotNull(message = "字段顺序不能为空")
    private Integer fieldOrder;

    private String fieldGroup;
    private String fieldRelation;
    private String attributes;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public String getFieldName() { return fieldName; }
    public void setFieldName(String fieldName) { this.fieldName = fieldName; }
    public String getFieldLabel() { return fieldLabel; }
    public void setFieldLabel(String fieldLabel) { this.fieldLabel = fieldLabel; }
    public String getFieldType() { return fieldType; }
    public void setFieldType(String fieldType) { this.fieldType = fieldType; }
    public Boolean getIsRequired() { return isRequired; }
    public void setIsRequired(Boolean isRequired) { this.isRequired = isRequired; }
    public Integer getFieldOrder() { return fieldOrder; }
    public void setFieldOrder(Integer fieldOrder) { this.fieldOrder = fieldOrder; }
    public String getFieldGroup() { return fieldGroup; }
    public void setFieldGroup(String fieldGroup) { this.fieldGroup = fieldGroup; }
    public String getFieldRelation() { return fieldRelation; }
    public void setFieldRelation(String fieldRelation) { this.fieldRelation = fieldRelation; }
    public String getAttributes() { return attributes; }
    public void setAttributes(String attributes) { this.attributes = attributes; }
} 