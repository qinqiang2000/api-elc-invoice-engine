package com.kingdee.fpy.dto;

import lombok.Data;

/**
 * 代码生成请求DTO
 * 用于生成发票规则编码
 */
@Data
public class CodeGenerationRequest {
    
    /**
     * 国家或税辖区
     */
    private String country;
    
    /**
     * 票种类型
     */
    private String invoiceType;
    /**
     * 票种子类型
     */
    private String subInvoiceType;
    /**
     * 组织编码
     */
    private String companyId;

}