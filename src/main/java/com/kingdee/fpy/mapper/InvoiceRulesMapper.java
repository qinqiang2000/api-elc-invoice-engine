package com.kingdee.fpy.mapper;

import com.kingdee.fpy.dto.CodeGenerationRequest;
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
    
    /**
     * 根据企业编码和规则编码查询规则
     * @param companyId 企业编码
     * @param ruleCode 规则编码
     * @return InvoiceRules实体列表
     */
    List<InvoiceRules> selectByCompanyIdAndRuleCode(@Param("companyId") String companyId, @Param("ruleCode") String ruleCode);

    /**
     * 查询指定国家和票种的最大序号
     *
     * @return 最大序号
     */
    Integer selectMaxSequenceByCountryAndType(CodeGenerationRequest request);

    /**
     * 更新规则状态
     * @param ruleCode 规则编码
     * @param status 状态：1草稿 2测试通过 3已发布
     * @return 更新结果
     */
    int updateStatus(@Param("ruleCode") String ruleCode, @Param("status") Integer status);

    /**
     * 根据企业ID查询订阅的规则
     * 包括系统预制规则和企业订阅的规则
     * @param invoiceRules 查询条件
     * @return 规则列表
     */
    List<InvoiceRules> selectSubscribedRulesByCompanyId(InvoiceRules invoiceRules);
}