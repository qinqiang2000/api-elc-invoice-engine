package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;

/**
 * 发票类型实体类
 */
@Data
public class InvoiceType {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 发票 Code
     */
    private String invoiceCode;

    /**
     * UBL Code
     */
    private String ublCode;

    /**
     * Description - EN（Default）
     */
    private String descriptionEn;

    /**
     * 描述 - 中文
     */
    private String descriptionCn;

    /**
     * Level等级
     */
    private Integer level;

    /**
     * Parent上级发票类型
     */
    private String parentCode;

    /**
     * Selfbilled是否自开发票 0-否 1-是
     */
    private Boolean selfbilled;

    /**
     * SubmissionType
     */
    private String submissionType;

    /**
     * 税种 TaxType
     */
    private String taxType;

    /**
     * 国家简码（国家模块）
     */
    private String countryName;

    /**
     * Country Code
     */
    private String countryCode;

    /**
     * 是否启用1启用2停用
     */
    private Boolean active;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}