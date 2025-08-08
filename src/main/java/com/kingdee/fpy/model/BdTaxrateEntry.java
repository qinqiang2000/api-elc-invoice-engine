package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.math.BigDecimal;

/**
 * BdTaxrateEntry实体类
 * 对应数据库表：t_bd_taxrate_entry
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdTaxrateEntry {

    private Long id;

    private Long entryid;

    /**
     * 分录行号
     */
    private Integer seq;

    /**
     * 区间
     */
    private String extent;

    /**
     * 值
     */
    private BigDecimal minimumtax;

    /**
     * 区间json
     */
    private String extentjson;

    /**
     * 区间json_详情
     */
    private String extentjsonTag;

}
