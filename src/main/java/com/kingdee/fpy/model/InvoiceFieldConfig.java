package com.kingdee.fpy.model;

public class InvoiceFieldConfig {
    private Long id;
    private String countryCode;
    private String fieldName;
    private String fieldLabel;
    private String fieldType;
    private Boolean isRequired;
    private Integer fieldOrder;
    private String fieldGroup;
    private String fieldRelation; // JSON格式，字段间关联
    private String attributes;    // JSON格式，字段属性

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