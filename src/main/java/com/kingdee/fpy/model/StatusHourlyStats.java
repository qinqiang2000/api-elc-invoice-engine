package com.kingdee.fpy.model;

import lombok.Data;
import java.util.List;
import java.util.Map;

/**
 * 按状态分组的24小时统计结果实体类
 */
@Data
public class StatusHourlyStats {
    
    /**
     * 发票状态
     */
    private Integer status;
    
    /**
     * 状态名称
     */
    private String statusName;
    
    /**
     * 24小时数据（小时->数量的映射）
     * 格式：{"2024-01-15 00:00:00": 5, "2024-01-15 01:00:00": 3, ...}
     */
    private Map<String, Long> hourlyData;
    
    public StatusHourlyStats() {}
    
    public StatusHourlyStats(Integer status, String statusName, Map<String, Long> hourlyData) {
        this.status = status;
        this.statusName = statusName;
        this.hourlyData = hourlyData;
    }
}