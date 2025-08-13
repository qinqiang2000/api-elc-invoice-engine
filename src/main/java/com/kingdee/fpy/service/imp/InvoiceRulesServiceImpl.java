package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.InvoiceRulesMapper;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.service.InvoiceRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * InvoiceRules服务实现类
 */
@Service
public class InvoiceRulesServiceImpl implements InvoiceRulesService {

    @Autowired
    private InvoiceRulesMapper invoiceRulesMapper;

    @Override
    public int insert(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.insert(invoiceRules);
    }

    @Override
    public int updateById(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.updateById(invoiceRules);
    }

    @Override
    public int deleteById(Long id) {
        return invoiceRulesMapper.deleteById(id);
    }

    @Override
    public InvoiceRules selectById(Long id) {
        return invoiceRulesMapper.selectById(id);
    }

    @Override
    public List<InvoiceRules> selectAll() {
        return invoiceRulesMapper.selectAll();
    }

    @Override
    public List<InvoiceRules> selectByTenantIdOrCompanyId(String tenantId, String companyId, String country) {
       // String country = "CN";
        return invoiceRulesMapper.selectByTenantIdOrCompanyId(tenantId, companyId,country);
    }

    @Override
    public List<InvoiceRules> selectByCompanyIdAndRuleCode(String companyId, String ruleCode) {
        return invoiceRulesMapper.selectByCompanyIdAndRuleCode(companyId, ruleCode);
    }
    
    @Override
    public synchronized String generateCode(String country, String invoiceType, String companyId) {
        // 参数校验
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("国家参数不能为空");
        }
        if (invoiceType == null || invoiceType.trim().isEmpty()) {
            throw new IllegalArgumentException("票种类型参数不能为空");
        }
        
        // 查询当前最大序号
        Integer maxSequence = invoiceRulesMapper.selectMaxSequenceByCountryAndType(country, invoiceType,companyId);
        
        // 计算下一个序号
        int nextSequence = (maxSequence == null ? 0 : maxSequence) + 1;
        
        // 格式化为4位数字
        String sequenceStr = String.format("%04d", nextSequence);
        
        // 生成编码字符串
        return "custom-" + country + "-" + invoiceType + "-" + sequenceStr;
    }

    @Override
    public int updateStatus(String ruleCode, Integer status) {
        return invoiceRulesMapper.updateStatus(ruleCode, status);
    }

    @Override
    public List<InvoiceRules> selectSubscribedRulesByCompanyId(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.selectSubscribedRulesByCompanyId(invoiceRules);
    }
}