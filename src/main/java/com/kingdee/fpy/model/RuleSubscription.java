package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;

/**
 * 规则订阅实体类
 */
@Data
public class RuleSubscription {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 规则唯一编码
     */
    private String ruleCode;

    /**
     * 关联租户
     */
    private String tenantId;

    /**
     * 关联企业
     */
    private String companyId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}