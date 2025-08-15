package com.kingdee.fpy.dto;

import lombok.Data;

/**
 * 规则月度发布原始数据DTO（用于Mapper查询结果）
 */
@Data
public class RuleMonthlyPublishDataDto {
    
    /**
     * 规则类型
     */
    private Integer ruleType;
    
    /**
     * 发布月份（格式：YYYY-MM）
     */
    private String publishMonth;
    
    /**
     * 该月该类型已发布规则数量
     */
    private Long count;
    
    public RuleMonthlyPublishDataDto() {
    }
    
    public RuleMonthlyPublishDataDto(Integer ruleType, String publishMonth, Long count) {
        this.ruleType = ruleType;
        this.publishMonth = publishMonth;
        this.count = count;
    }
}