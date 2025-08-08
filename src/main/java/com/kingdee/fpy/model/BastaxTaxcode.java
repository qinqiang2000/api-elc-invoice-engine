package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BastaxTaxcode实体类
 * 对应数据库表：t_bastax_taxcode
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BastaxTaxcode {

    private Long id;

    /**
     * 编码
     */
    private String number;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 创建人
     */
    private Long creatorid;

    /**
     * 修改人
     */
    private Long modifierid;

    /**
     * 使用状态
     */
    private String enable;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 修改时间
     */
    private String modifytime;

    /**
     * 主数据内码
     */
    private Long masterid;

    /**
     * 创建组织
     */
    private Long createorgid;

    /**
     * 组织
     */
    private Long orgid;

    /**
     * 使用组织
     */
    private Long useorg;

    /**
     * 控制策略
     */
    private String ctrlstrategy;

    /**
     * 税码分类
     */
    private Long taxcodetype;

    /**
     * 国家或地区
     */
    private Long country;

    /**
     * 税码属性
     */
    private String taxcodeproperty;

    /**
     * 税种
     */
    private Long taxtype;

    /**
     * 含税标识
     */
    private String containstax;

    /**
     * 生效日期
     */
    private String startdate;

    /**
     * 失效日期
     */
    private String enddate;

    /**
     * 扣减结算
     */
    private String offsetlogo;

    /**
     * 原资料id
     */
    private Long sourcedataid;

    /**
     * 位图
     */
    private Integer bitindex;

    /**
     * 原资料位图
     */
    private Integer sourcebitindex;

    /**
     * 税收制度
     */
    private Long taxationsys;

    /**
     * 税收辖区
     */
    private Long taxareagroup;

    /**
     * 是否流转税
     */
    private String offsettax;

    /**
     * 影响成本
     */
    private String impactcost;

    /**
     * 可抵扣
     */
    private String deductible;

    /**
     * 原创建组织
     */
    private Long srccreateorgid;

}
