package com.kingdee.fpy.model;

import lombok.Data;

/**
 * 按小时统计发票状态结果实体类
 */
@Data
public class HourlyStatusStats {
    
    /**
     * 小时时间（格式：YYYY-MM-DD HH:00:00）
     */
    private String hour;
    
    /**
     * 发票状态
     */
    private Integer status;
    
    /**
     * 统计数量
     */
    private Long count;
    
    public HourlyStatusStats() {}
    
    public HourlyStatusStats(String hour, Integer status, Long count) {
        this.hour = hour;
        this.status = status;
        this.count = count;
    }
}