package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BastaxTaxcodeL实体类
 * 对应数据库表：t_bastax_taxcode_l
 *
 * @author CodeGenerator
 * @version 1.0
 * @since 2025-08-11
 * @description 自动生成的实体类，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BastaxTaxcodeL {

    private String pkid;

    private Long id;

    private String localeid;

    private String name;

}
