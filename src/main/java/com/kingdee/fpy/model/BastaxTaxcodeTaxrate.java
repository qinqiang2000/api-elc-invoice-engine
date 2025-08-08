package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BastaxTaxcodeTaxrate实体类
 * 对应数据库表：t_bastax_taxcode_taxrate
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BastaxTaxcodeTaxrate {

    private Long id;

    private Long entryid;

    /**
     * 分录行号
     */
    private Long seq;

    /**
     * 税率
     */
    private Long taxrate;

}
