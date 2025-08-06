package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.RuleSubscription;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * RuleSubscription Mapper接口
 */
@Mapper
public interface RuleSubscriptionMapper {

    /**
     * 插入一条记录
     * @param ruleSubscription RuleSubscription实体
     * @return 影响行数
     */
    int insert(RuleSubscription ruleSubscription);

    /**
     * 根据ID更新记录
     * @param ruleSubscription RuleSubscription实体
     * @return 影响行数
     */
    int updateById(RuleSubscription ruleSubscription);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return RuleSubscription实体
     */
    RuleSubscription selectById(Long id);

    /**
     * 查询所有记录
     * @return RuleSubscription实体列表
     */
    List<RuleSubscription> selectAll();
    
    /**
     * 根据租户ID或企业ID查询订阅规则
     * @param tenantId 租户ID
     * @param companyId 企业ID
     * @param country 国家
     * @return 订阅规则列表
     */
    List<RuleSubscription> selectByTenantIdOrCompanyId(@Param("tenantId") String tenantId,
            @Param("companyId") String companyId,@Param("country") String country);
}