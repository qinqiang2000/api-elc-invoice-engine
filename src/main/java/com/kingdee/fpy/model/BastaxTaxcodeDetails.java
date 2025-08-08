package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.math.BigDecimal;

/**
 * BastaxTaxcodeDetails实体类
 * 对应数据库表：t_bastax_taxcode_details
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BastaxTaxcodeDetails {

    private Long id;

    private Long entryid;

    /**
     * 分录行号
     */
    private Integer seq;

    /**
     * 税码明细类型
     */
    private Long result;

    /**
     * 值类型
     */
    private String valuetype;

    /**
     * 值来源
     */
    private String valuesource;

    /**
     * 小数精度(废弃)
     */
    private Long decimalprecision;

    /**
     * 值小数(废弃)
     */
    private BigDecimal valuedecimal;

    /**
     * 值
     */
    private String valuenumber;

    /**
     * 值id
     */
    private String valueid;

}
