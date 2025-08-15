package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 验证规则实体类
 */
@Data
public class InvoiceRules {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 国家二字码
     */
    private String country;

    /**
     * 贸易区
     */
    private String tradeArea;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 行业
     */
    private String tags;

    /**
     * 发票类型
     */
    private String invoiceType;

    /**
     * 发票子类型
     */
    private String subInvoiceType;

    /**
     * 规则唯一编码，三段式，洲-sys/user-流水号
     */
    private String ruleCode;

    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 1校验，2补全
     */
    private int ruleType;

    /**
     * 是否启用1启用2停用
     */
    private Boolean active;

    /**
     * 规则状态：1草稿 2测试通过 3已发布,4启用，5停用
     */
    private Integer status;

    /**
     * 规则应用条件
     */
    private String applyTo;

    /**
     * 错误提示信息
     */
    private String errorMessage;

    /**
     * 字段路径
     */
    private String fieldPath;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 规则表达式
     */
    private String ruleExpression;

    /**
     * 规则描述
     */
    private String description;

    /**
     * 规则版本号
     */
    private String ruleVersion;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date publishTime;

    /**
     * 规则生效开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    /**
     * 规则生效结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}