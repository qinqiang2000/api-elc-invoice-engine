package com.kingdee.fpy.dto;

import lombok.Data;

/**
 * 规则状态统计DTO
 */
@Data
public class RuleStatusStatisticsDto {
    
    /**
     * 状态key（枚举英文名称）
     */
    private String statusKey;
    
    /**
     * 状态名称（中文）
     */
    private String statusName;
    
    /**
     * 数量
     */
    private Long count;
    
    public RuleStatusStatisticsDto() {
    }
    
    public RuleStatusStatisticsDto(String statusKey, String statusName, Long count) {
        this.statusKey = statusKey;
        this.statusName = statusName;
        this.count = count;
    }
}