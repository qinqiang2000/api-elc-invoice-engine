package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceFieldConfig;
import java.util.List;

public interface InvoiceFieldConfigService {
    List<InvoiceFieldConfig> getFieldConfigsByCountry(String countryCode);
    InvoiceFieldConfig getById(Long id);
    void addFieldConfig(InvoiceFieldConfig config);
    void updateFieldConfig(InvoiceFieldConfig config);
    void deleteFieldConfig(Long id);
} 