package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * SecUserU实体类
 * 对应数据库表：t_sec_user_u
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SecUserU {

    private Long id;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 是否锁定
     */
    private String islocked;

    /**
     * 用户禁用
     */
    private String isforbidden;

    /**
     * 授权状态
     */
    private String authorstatus;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册状态
     */
    private String isregisted;

    /**
     * 激活状态
     */
    private String isactived;

    /**
     * 用户名
     */
    private String username;

    /**
     * 历史密码
     */
    private String pswhisstr;

    /**
     * 密码策略
     */
    private Long pswstrategyid;

    /**
     * 密码生效日期
     */
    private String psweffectivedate;

    /**
     * 密码错误次数
     */
    private Long errcount;

    /**
     * 锁定日期
     */
    private String lockedtime;

    /**
     * 外部id
     */
    private String externaluuid;

    /**
     * 上次登录ip
     */
    private String lastloginip;

    /**
     * 上次登录时间
     */
    private String lastlogintime;

    /**
     * 用户禁用人
     */
    private Long userdisablerid;

    /**
     * 用户禁用时间
     */
    private String userdisabletime;

    /**
     * 使用系统结束日期
     */
    private String useenddate;

}
