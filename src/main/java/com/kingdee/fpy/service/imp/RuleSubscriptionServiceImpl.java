package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.RuleSubscriptionMapper;
import com.kingdee.fpy.model.RuleSubscription;
import com.kingdee.fpy.service.RuleSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RuleSubscription服务实现类
 */
@Service
public class RuleSubscriptionServiceImpl implements RuleSubscriptionService {

    @Autowired
    private RuleSubscriptionMapper ruleSubscriptionMapper;

    @Override
    public int insert(RuleSubscription ruleSubscription) {
        return ruleSubscriptionMapper.insert(ruleSubscription);
    }

    @Override
    public int updateById(RuleSubscription ruleSubscription) {
        return ruleSubscriptionMapper.updateById(ruleSubscription);
    }

    @Override
    public int deleteById(Long id) {
        return ruleSubscriptionMapper.deleteById(id);
    }

    @Override
    public RuleSubscription selectById(Long id) {
        return ruleSubscriptionMapper.selectById(id);
    }

    @Override
    public List<RuleSubscription> selectAll() {
        return ruleSubscriptionMapper.selectAll();
    }
    
    @Override
    public List<RuleSubscription> selectByTenantIdOrCompanyId(String tenantId, String companyId) {
        String country = "CN";
        return ruleSubscriptionMapper.selectByTenantIdOrCompanyId(tenantId, companyId,country);
    }
}