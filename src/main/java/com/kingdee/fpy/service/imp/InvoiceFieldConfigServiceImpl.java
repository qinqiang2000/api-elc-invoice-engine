package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.InvoiceFieldConfigMapper;
import com.kingdee.fpy.model.InvoiceFieldConfig;
import com.kingdee.fpy.service.InvoiceFieldConfigService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceFieldConfigServiceImpl implements InvoiceFieldConfigService {
    private final InvoiceFieldConfigMapper fieldConfigMapper;

    public InvoiceFieldConfigServiceImpl(InvoiceFieldConfigMapper fieldConfigMapper) {
        this.fieldConfigMapper = fieldConfigMapper;
    }

    @Override
    public List<InvoiceFieldConfig> getFieldConfigsByCountry(String countryCode) {
        return fieldConfigMapper.findByCountryCode(countryCode);
    }

    @Override
    public InvoiceFieldConfig getById(Long id) {
        return fieldConfigMapper.findById(id);
    }

    @Override
    public void addFieldConfig(InvoiceFieldConfig config) {
        fieldConfigMapper.insert(config);
    }

    @Override
    public void updateFieldConfig(InvoiceFieldConfig config) {
        fieldConfigMapper.update(config);
    }

    @Override
    public void deleteFieldConfig(Long id) {
        fieldConfigMapper.deleteById(id);
    }
} 