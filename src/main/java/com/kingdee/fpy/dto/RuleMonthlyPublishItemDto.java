package com.kingdee.fpy.dto;

import lombok.Data;

/**
 * 规则月度发布统计项DTO
 */
@Data
public class RuleMonthlyPublishItemDto {
    
    /**
     * 发布月份（格式：YYYY-MM）
     */
    private String publishMonth;
    
    /**
     * 该月已发布规则数量
     */
    private Long count;
    
    public RuleMonthlyPublishItemDto() {
    }
    
    public RuleMonthlyPublishItemDto(String publishMonth, Long count) {
        this.publishMonth = publishMonth;
        this.count = count;
    }
}