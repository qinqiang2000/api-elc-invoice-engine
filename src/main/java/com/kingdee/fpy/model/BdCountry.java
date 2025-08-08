package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BdCountry实体类
 * 对应数据库表：t_bd_country
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdCountry {

    private Long id;

    /**
     * 编码
     */
    private String number;

    /**
     * 使用状态
     */
    private String enable;

    /**
     * 数据状态
     */
    private String status;

    private Long createorgid;

    private Long orgid;

    /**
     * 创建人
     */
    private Long creatorid;

    /**
     * 创建时间
     */
    private String createtime;

    private Long modifyorgid;

    /**
     * 修改人
     */
    private Long modifierid;

    /**
     * 修改时间
     */
    private String modifytime;

    /**
     * 图片
     */
    private String logo;

    /**
     * 禁用人
     */
    private Long disablerid;

    /**
     * 禁用时间
     */
    private String disabledate;

    /**
     * 主数据内码
     */
    private Long masterid;

    /**
     * 英文简称
     */
    private String simplespell;

    /**
     * 二字码
     */
    private String twocountrycode;

    /**
     * 三字码
     */
    private String threecountrycode;

    /**
     * 区域格式
     */
    private Long formatplanid;

    /**
     * 国际电话区号
     */
    private String areacode;

    /**
     * 名称
     */
    private String name;

    /**
     * 全称
     */
    private String fullname;

    /**
     * 英文全称
     */
    private String description;

    /**
     * 是否系统预置
     */
    private String issystem;

    /**
     * 数字编码
     */
    private String numericcode;

    /**
     * 时区
     */
    private Long timezone;

    /**
     * 区域格式
     */
    private Long regionalformat;

}
