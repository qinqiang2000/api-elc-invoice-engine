package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BdExratetable实体类
 * 对应数据库表：t_bd_exratetable
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdExratetable {

    private Long id;

    /**
     * 编码
     */
    private String number;

    /**
     * 基准货币
     */
    private Long curid;

    /**
     * 允许可逆汇率计算
     */
    private String isallowrev;

    /**
     * 启用外汇牌价
     */
    private String isenableexc;

    /**
     * 汇率创建组织维护
     */
    private String iscreateorg;

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
     * 主数据内码
     */
    private Long masterid;

    /**
     * 不允许修改汇率
     */
    private String forbidmodifyrate;

    /**
     * 汇率失效日期
     */
    private String expirydate;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

}
