package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BdCurrency实体类
 * 对应数据库表：t_bd_currency
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdCurrency {

    private Long id;

    /**
     * 货币代码
     */
    private String number;

    /**
     * 金额精度
     */
    private Long amtprecision;

    /**
     * 单价精度
     */
    private Long priceprecision;

    /**
     * 显示货币符号
     */
    private String isshowsign;

    /**
     * 币种符号
     */
    private String sign;

    /**
     * 显示格式
     */
    private String format;

    /**
     * 是否系统预置
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
     * logo
     */
    private String logo;

    /**
     * 主数据内码
     */
    private Long masterid;

    private String positiveformat;

    private String negativeformat;

    private String separator;

    private String groupformat;

    /**
     * 排序码
     */
    private String sortcode;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

}
