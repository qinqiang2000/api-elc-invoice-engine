package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * OrgOrg实体类
 * 对应数据库表：t_org_org
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrgOrg {

    private Long id;

    /**
     * 云之家组织内码
     */
    private String yzjorgid;

    /**
     * 编码
     */
    private String number;

    /**
     * 是否云之家同步
     */
    private String yzjimorted;

    private String orgpattern;

    /**
     * 形态
     */
    private Long orgpatternid;

    /**
     * 行政组织
     */
    private String isadministrative;

    /**
     * 采购组织
     */
    private String ispurchase;

    /**
     * 销售组织
     */
    private String issale;

    /**
     * 生产组织
     */
    private String isproduce;

    /**
     * 库存组织
     */
    private String isinventory;

    /**
     * 质检组织
     */
    private String isqc;

    /**
     * 结算组织
     */
    private String issettlement;

    /**
     * 资金组织
     */
    private String isbankroll;

    /**
     * 资产组织
     */
    private String isasset;

    /**
     * 核算组织
     */
    private String isaccounting;

    /**
     * hr组织
     */
    private String ishr;

    /**
     * 共享中心
     */
    private String isscc;

    /**
     * 预算组织
     */
    private String isbudget;

    /**
     * 控制单元
     */
    private String iscontrolunit;

    /**
     * 纳税识别号
     */
    private String taxregnum;

    /**
     * 电话
     */
    private String phone;

    /**
     * 银行账户
     */
    private String bankaccount;

    /**
     * 数据状态
     */
    private String status;

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
     * 修改时间
     */
    private String modifytime;

    /**
     * 修改人
     */
    private Long modifierid;

    /**
     * 禁用人
     */
    private Long disablerid;

    /**
     * 禁用时间
     */
    private String disabledate;

    private String uniformsocialcreditcode;

    /**
     * 注册资本
     */
    private Long registeredcapital;

    /**
     * 成立日期
     */
    private String establishmentdate;

    /**
     * 营业期限
     */
    private String businessterm;

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
     * 国家/地区
     */
    private Long countryid;

    /**
     * 城市
     */
    private Long cityid;

    /**
     * 时区
     */
    private Long timezoneid;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 联系电话
     */
    private String contactphone;

    /**
     * 计划组织
     */
    private String isplan;

    /**
     * 项目管理
     */
    private String isproject;

    /**
     * 预置职能1
     */
    private String ispresetbiz1;

    /**
     * 预置职能2
     */
    private String ispresetbiz2;

    /**
     * 预置职能3
     */
    private String ispresetbiz3;

    /**
     * 预置职能4
     */
    private String ispresetbiz4;

    /**
     * 预置职能5
     */
    private String ispresetbiz5;

    /**
     * 预置职能6
     */
    private String ispresetbiz6;

    /**
     * 预置职能7
     */
    private String ispresetbiz7;

    /**
     * 预置职能8
     */
    private String ispresetbiz8;

    /**
     * 预置职能9
     */
    private String ispresetbiz9;

    /**
     * 预置职能10
     */
    private String ispresetbiz10;

    /**
     * 业务组织
     */
    private String isbizorg;

    /**
     * 名称
     */
    private String name;

    /**
     * 组织规划责任单位
     */
    private String ishrod;

    /**
     * 组织绩效中心
     */
    private String ishrop;

    /**
     * 编制/预算组织
     */
    private String ishrbg;

    /**
     * 人才招聘组织
     */
    private String ishrtr;

    /**
     * 人事组织
     */
    private String ishrpa;

    /**
     * 考勤组织
     */
    private String ishrwt;

    /**
     * 薪酬管理组织
     */
    private String ishrcmp;

    /**
     * 定调薪组织
     */
    private String ishrbs;

    /**
     * 算发薪组织
     */
    private String ishrpay;

    /**
     * 个税组织
     */
    private String ishrtax;

    /**
     * 社保公积金组织
     */
    private String ishrsi;

    /**
     * 长期激励组织
     */
    private String ishrlti;

    /**
     * 奖金组织
     */
    private String ishrbm;

    /**
     * 人才管理组织
     */
    private String ishrtd;

    /**
     * 培训学习组织
     */
    private String ishrtl;

    /**
     * 个人绩效组织
     */
    private String ishrip;

    /**
     * hr共享服务组织
     */
    private String ishrssc;

    /**
     * 人力成本组织
     */
    private String ishrlc;

    /**
     * 假期组织
     */
    private String ishrab;

    /**
     * 税务组织
     */
    private String istax;

    /**
     * 纳税人类型
     */
    private String taxpayertype;

    /**
     * 关联企业
     */
    private String companyid;

}
