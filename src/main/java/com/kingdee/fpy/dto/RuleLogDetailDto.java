package com.kingdee.fpy.dto;

import lombok.Data;
import java.util.Date;

/**
 * 规则日志详情DTO，包含规则日志和规则详细信息
 */
@Data
public class RuleLogDetailDto {
    // RuleLog 字段
    private Long id;
    private String billNo;
    private String invoiceNo;
    private String ruleCode;
    private Integer executionResult;
    private String errorMessage;
    private String inputData;
    private String outputData;
    private String companyId;
    private String requestId;
    private Date createTime;
    private Date updateTime;
    
    // InvoiceRules 详细信息字段
    private String ruleName;
    private Integer ruleType;
    private String fieldPath;
    private String ruleExpression;
    private String description;
    private String applyTo;
    private Integer priority;
    private Boolean active;
    private Integer status;
    private String country;
    private String invoiceType;
}