package com.kingdee.fpy.model;

import lombok.Data;

/**
 * 规则查询参数
 */
@Data
public class InvoiceRulesQuery {
    
    /**
     * 页码，从1开始
     */
    private Integer pageNum = 1;
    
    /**
     * 页大小
     */
    private Integer pageSize = 10;
    
    /**
     * 规则类型（1=校验，2=补全）
     */
    private Integer ruleType;
    
    /**
     * 规则状态（1=草稿，2=测试通过，3=已发布，4=启用，5=停用）
     */
    private Integer status;
    
    /**
     * 规则代码（支持模糊匹配）
     */
    private String ruleCode;
    
    /**
     * 计算偏移量
     * @return 偏移量
     */
    public int getOffset() {
        return (pageNum - 1) * pageSize;
    }
}