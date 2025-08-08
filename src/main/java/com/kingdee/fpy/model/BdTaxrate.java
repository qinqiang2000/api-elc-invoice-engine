package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.math.BigDecimal;

/**
 * BdTaxrate实体类
 * 对应数据库表：t_bd_taxrate
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdTaxrate {

    private Long id;

    /**
     * 主数据内码
     */
    private Long masterid;

    /**
     * 编码
     */
    private String number;

    /**
     * 值
     */
    private BigDecimal taxrate;

    /**
     * 税种
     */
    private Long taxcategoryid;

    /**
     * 生效日期
     */
    private String activedate;

    /**
     * 失效日期
     */
    private String expdate;

    /**
     * 系统预设
     */
    private String issystem;

    /**
     * 使用状态
     */
    private String enable;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 创建人
     */
    private Long creatorid;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 修改人
     */
    private Long modifierid;

    /**
     * 修改时间
     */
    private String modifytime;

    /**
     * 禁用人
     */
    private Long disablerid;

    /**
     * 禁用时间
     */
    private String disabledate;

    /**
     * 用户选择组织
     */
    private Long orgid;

    /**
     * 创建组织
     */
    private Long createorgid;

    /**
     * 组织
     */
    private Long userorg;

    /**
     * 控制策略
     */
    private String ctrlstrategy;

    /**
     * 国家或地区
     */
    private Long country;

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
     * 值类型
     */
    private String valuetype;

    /**
     * 计税单位
     */
    private Long taxunit;

    /**
     * 税率类型
     */
    private Long taxratetype;

    /**
     * 税收辖区
     */
    private Long taxarea;

    /**
     * 原创建组织
     */
    private Long srccreateorgid;

}
