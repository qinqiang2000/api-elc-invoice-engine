package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.dto.CodeGenerationRequest;
import com.kingdee.fpy.dto.RuleLogDetailDto;
import com.kingdee.fpy.enums.RuleStatus;
import com.kingdee.fpy.mapper.InvoiceRulesMapper;
import com.kingdee.fpy.mapper.RuleLogMapper;
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

    @Autowired
    private RuleLogMapper ruleLogMapper;

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
    public synchronized String generateCode(CodeGenerationRequest request) {
        // 参数校验
        if (request.getCountry() == null || request.getCountry().isEmpty()) {
            throw new IllegalArgumentException("国家参数不能为空");
        }
        if (request.getInvoiceType() == null || request.getInvoiceType().isEmpty()) {
            request.setInvoiceType("common");
        }
        if (request.getSubInvoiceType() == null || request.getSubInvoiceType().isEmpty()) {
            request.setSubInvoiceType("common");
        }
        
        // 查询当前最大序号
        Integer maxSequence = invoiceRulesMapper.selectMaxSequenceByCountryAndType(request);
        
        // 计算下一个序号
        int nextSequence = (maxSequence == null ? 0 : maxSequence) + 1;
        
        // 格式化为4位数字
        String sequenceStr = String.format("%04d", nextSequence);
        
        // 生成编码字符串
        return "custom-" + request.getCountry() + "-" + request.getInvoiceType() + "-"+request.getSubInvoiceType() + "-" + sequenceStr;
    }

    @Override
    public int updateStatus(String ruleCode, Integer status) {
        return invoiceRulesMapper.updateStatus(ruleCode, status);
    }
    
    @Override
    public int enableRule(String ruleCode) {
        return invoiceRulesMapper.updateStatus(ruleCode, RuleStatus.ENABLED.getCode());
    }
    
    @Override
    public int disableRule(String ruleCode) {
        return invoiceRulesMapper.updateStatus(ruleCode, RuleStatus.DISABLED.getCode());
    }

    @Override
    public List<InvoiceRules> selectSubscribedRulesByCompanyId(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.selectSubscribedRulesByCompanyId(invoiceRules);
    }

    @Override
    public List<RuleLogDetailDto> getRuleLogsWithDetailsByRequestIdAndBillNo(String requestId, String billNo) {
        return ruleLogMapper.selectRuleLogsWithDetailsByRequestIdAndBillNo(requestId, billNo);
    }
}