package com.kingdee.fpy.dto;

import lombok.Data;
import java.util.List;
import java.util.Map;

/**
 * 规则日志按类型分组响应DTO
 */
@Data
public class RuleLogGroupedResponseDto {
    /**
     * 按规则类型分组的日志详情
     * key: 规则类型名称 (1-校验, 2-补全)
     * value: 该类型下的规则日志详情列表
     */
    private Map<Integer, List<RuleLogDetailDto>> groupedByRuleType;
    
    /**
     * 统计信息
     */
    private Statistics statistics;
    
    @Data
    public static class Statistics {
        /**
         * 总记录数
         */
        private int totalCount;
        
        /**
         * 校验类规则数量
         */
        private int validationRuleCount;
        
        /**
         * 补全类规则数量
         */
        private int completionRuleCount;
        
        /**
         * 校验规则执行成功数量
         */
        private int validationSuccessCount;
        
        /**
         * 校验规则执行失败数量
         */
        private int validationFailureCount;
        
        /**
         * 补全规则执行成功数量
         */
        private int completionSuccessCount;
        
        /**
         * 补全规则执行失败数量
         */
        private int completionFailureCount;
        
        /**
         * 总执行成功数量
         */
        private int totalSuccessCount;
        
        /**
         * 总执行失败数量
         */
        private int totalFailureCount;
    }
}