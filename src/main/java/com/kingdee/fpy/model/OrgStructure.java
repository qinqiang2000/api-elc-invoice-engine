package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * OrgStructure实体类
 * 对应数据库表：t_org_structure
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrgStructure {

    private Long id;

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
     * 组织视图
     */
    private Long viewid;

    /**
     * 组织
     */
    private Long orgid;

    /**
     * 云之家组织内码
     */
    private String yzjorgid;

    /**
     * 上级组织
     */
    private Long parentid;

    /**
     * 上级云之家组织内码
     */
    private String yzjparentorgid;

    /**
     * 叶子节点
     */
    private String isleaf;

    /**
     * 长编码
     */
    private String longnumber;

    /**
     * 级次
     */
    private Long level;

    /**
     * 统计汇总
     */
    private String isstatsum;

    /**
     * 封存状态
     */
    private String isfreeze;

    /**
     * 封存日期
     */
    private String sealuptime;

    /**
     * 字符串排序码
     */
    private String sortcode;

    /**
     * 管控单元
     */
    private String isctrlunit;

    /**
     * 是否启用hr
     */
    private String ishr;

    /**
     * 生效日期
     */
    private String startdate;

    /**
     * 失效日期
     */
    private String enddate;

    /**
     * 主数据内码
     */
    private Long masterid;

    /**
     * 业务实体
     */
    private String isbizunit;

    /**
     * 长名称
     */
    private String fullname;

    /**
     * 分录行号
     */
    private Integer seq;

    /**
     * 排序码
     */
    private Long sortnumber;

}
