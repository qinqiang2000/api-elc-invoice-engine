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
}