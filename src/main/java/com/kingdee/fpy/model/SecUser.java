package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * SecUser实体类
 * 对应数据库表：t_sec_user
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SecUser {

    private Long id;

    /**
     * 工作圈eid
     */
    private Long eid;

    /**
     * 团队id
     */
    private Long tid;

    /**
     * 云之家账号内码
     */
    private Long uid;

    /**
     * 用户云之家openid
     */
    private String openid;

    /**
     * 工号
     */
    private String number;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 证件号码
     */
    private String idcard;

    /**
     * 人员头像
     */
    private String avatar;

    /**
     * 类型（过时）
     */
    private String usertype;

    private String nickname;

    /**
     * 姓名全拼
     */
    private String fullpinyin;

    /**
     * 姓名简拼
     */
    private String simplepinyin;

    private Long dptid;

    private Long positionid;

    private String sortcode;

    private String billssatusfield;

    private String hiredate;

    /**
     * 使用状态
     */
    private String enable;

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
     * 数据来源
     */
    private String source;

    private String maintain;

    /**
     * 开始日期
     */
    private String startdate;

    /**
     * 结束日期
     */
    private String enddate;

    /**
     * 主数据内码
     */
    private Long masterid;

    /**
     * 人员头像
     */
    private String headsculpture;

    /**
     * 姓名
     */
    private String truename;

    /**
     * 国家/地区
     */
    private Long countryid;

    /**
     * 排序码
     */
    private Long sortnumber;

    /**
     * 证件类型
     */
    private Long idtype;

    /**
     * 国家或地区
     */
    private Long nsCountry;

    /**
     * 姓名格式
     */
    private Long nsNamestyle;

    /**
     * first name
     */
    private String nsFirstname;

    /**
     * middle name
     */
    private String nsMiddlename;

    /**
     * last name
     */
    private String nsLastname;

    /**
     * title
     */
    private String nsTitle;

    /**
     * 缩写
     */
    private String nsAbbr;

    /**
     * nick name
     */
    private String nsNickname;

    /**
     * 职称
     */
    private String nsPosttitle;

    /**
     * second name
     */
    private String nsCustomfield1;

    /**
     * initials
     */
    private String nsCustomfield2;

    /**
     * suffix
     */
    private String nsCustomfield3;

    /**
     * 自定义字段4
     */
    private String nsCustomfield4;

}
