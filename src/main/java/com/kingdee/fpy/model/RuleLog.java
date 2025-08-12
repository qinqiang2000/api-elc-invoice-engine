package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;

/**
 * 规则执行日志实体类
 */
@Data
public class RuleLog {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 执行结果
     */
    private String billNo;

    /**
     * 执行结果
     */
    private String invoiceNo;

    /**
     * 执行结果
     */
    private String ruleCode;

    /**
     * 执行结果状态1成功2失败
     */
    private Integer executionResult;

    /**
     * 执行结果描述
     */
    private String errorMessage;

    /**
     * 输入
     */
    private String inputData;

    /**
     * 输出
     */
    private String outputData;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 请求ID
     */
    private String requestId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}