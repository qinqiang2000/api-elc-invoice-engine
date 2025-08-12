package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceRules;
import java.util.List;

/**
 * InvoiceRules服务接口
 */
public interface InvoiceRulesService {

    /**
     * 插入一条记录
     * @param invoiceRules InvoiceRules实体
     * @return 影响行数
     */
    int insert(InvoiceRules invoiceRules);

    /**
     * 根据ID更新记录
     * @param invoiceRules InvoiceRules实体
     * @return 影响行数
     */
    int updateById(InvoiceRules invoiceRules);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return InvoiceRules实体
     */
    InvoiceRules selectById(Long id);

    /**
     * 查询所有记录
     * @return InvoiceRules实体列表
     */
    List<InvoiceRules> selectAll();

    List<InvoiceRules> selectByTenantIdOrCompanyId(String tenantId, String companyId, String country);

    /**
     * 根据企业编码和规则编码查询规则
     * @param companyId 企业编码
     * @param ruleCode 规则编码
     * @return InvoiceRules实体列表
     */
    List<InvoiceRules> selectByCompanyIdAndRuleCode(String companyId, String ruleCode);
    
    /**
     * 生成编码字符串
     *
     * @param country     国家或税辖区
     * @param invoiceType 票种类型
     * @param companyId
     * @return 生成的编码字符串，格式：custom-国家-票种-序号
     */
    String generateCode(String country, String invoiceType, String companyId);
}