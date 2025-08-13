package com.kingdee.fpy.service;

import com.kingdee.fpy.dto.RuleLogDetailDto;
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

    /**
     * 更新规则状态
     * @param ruleCode 规则编码
     * @param status 状态：1草稿 2测试通过 3已发布
     * @return 更新结果
     */
    int updateStatus(String ruleCode, Integer status);
    
    /**
     * 启用规则
     * @param ruleCode 规则编码
     * @return 更新结果
     */
    int enableRule(String ruleCode);
    
    /**
     * 停用规则
     * @param ruleCode 规则编码
     * @return 更新结果
     */
    int disableRule(String ruleCode);

    /**
     * 根据企业ID查询订阅的规则
     * 包括系统预制规则和企业订阅的规则
     * @param invoiceRules 查询条件，主要使用其中的企业ID字段
     * @return 规则列表
     */
    List<InvoiceRules> selectSubscribedRulesByCompanyId(InvoiceRules invoiceRules);

    /**
     * 根据请求ID和单据编码查询规则日志详情
     * @param requestId 请求ID
     * @param billNo 单据编码
     * @return 规则日志详情列表
     */
    List<RuleLogDetailDto> getRuleLogsWithDetailsByRequestIdAndBillNo(String requestId, String billNo);
}