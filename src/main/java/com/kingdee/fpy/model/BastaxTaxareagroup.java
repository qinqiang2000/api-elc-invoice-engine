package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BastaxTaxareagroup实体类
 * 对应数据库表：t_bastax_taxareagroup
 *
 * @author CodeGenerator
 * @version 1.0
 * @since 2025-08-13
 * @description 自动生成的实体类，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BastaxTaxareagroup {

    private Long id;

    private String number;

    private String status;

    private Long creatorid;

    private Long modifierid;

    private String enable;

    private String createtime;

    private String modifytime;

    private Long masterid;

    private String issystem;

}
