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
}