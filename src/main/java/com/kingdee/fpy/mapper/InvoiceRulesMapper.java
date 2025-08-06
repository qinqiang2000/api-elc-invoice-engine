package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceRules;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * InvoiceRules Mapper接口
 */
@Mapper
public interface InvoiceRulesMapper {

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
    List<InvoiceRules> selectByTenantIdOrCompanyId(@Param("tenantId") String tenantId,
            @Param("companyId") String companyId,@Param("country") String country);
}