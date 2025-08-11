package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * SecUserposition实体类
 * 对应数据库表：t_sec_userposition
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SecUserposition {

    private Long entryid;

    private Long id;

    /**
     * 分录行号
     */
    private Long seq;

    /**
     * 部门
     */
    private Long dptid;

    /**
     * 岗位
     */
    private Long positionid;

    /**
     * 兼职
     */
    private String ispartjob;

    /**
     * 负责人
     */
    private String isincharge;

    private String postid;

    private String source;

    private String maintain;

    private String enable;

    private String startdate;

    private String enddate;

    /**
     * 直接上级
     */
    private Long superiorid;

    /**
     * 组织结构
     */
    private Long orgstructureid;

    /**
     * 职位
     */
    private String position;

}
