package com.kingdee.fpy.dto;

import lombok.Data;
import java.util.List;

/**
 * 规则月度发布统计DTO
 */
@Data
public class RuleMonthlyPublishStatisticsDto {
    
    /**
     * 规则类型
     */
    private Integer ruleType;
    
    /**
     * 规则类型名称
     */
    private String ruleTypeName;
    
    /**
     * 该类型各月统计数据
     */
    private List<RuleMonthlyPublishItemDto> monthlyData;
    
    public RuleMonthlyPublishStatisticsDto() {
    }
    
    public RuleMonthlyPublishStatisticsDto(Integer ruleType, String ruleTypeName, List<RuleMonthlyPublishItemDto> monthlyData) {
        this.ruleType = ruleType;
        this.ruleTypeName = ruleTypeName;
        this.monthlyData = monthlyData;
    }
}