package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * BdInvoicetype实体类
 * 对应数据库表：t_bd_invoicetype
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BdInvoicetype {

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
     * 发票类型分组
     */
    private Long groupid;

    /**
     * 系统预设
     */
    private String issystem;

    private String fullname;

    /**
     * 名称
     */
    private String name;

    /**
     * 备注
     */
    private String desc;

    /**
     * 发票税控编码
     */
    private String taxcontrolcode;

    /**
     * 是否为电票
     */
    private String isEleInvoice;

}
