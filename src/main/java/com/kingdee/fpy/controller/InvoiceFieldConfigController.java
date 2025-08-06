package com.kingdee.fpy.controller;

import com.kingdee.fpy.dto.InvoiceFieldConfigDTO;
import com.kingdee.fpy.model.InvoiceFieldConfig;
import com.kingdee.fpy.service.imp.InvoiceFieldConfigServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/field-config")
public class InvoiceFieldConfigController {

    @Autowired
    InvoiceFieldConfigServiceImpl fieldConfigService;


    @GetMapping("/{countryCode}")
    public List<InvoiceFieldConfig> getFieldConfigs(@PathVariable String countryCode) {
        return fieldConfigService.getFieldConfigsByCountry(countryCode);
    }

    @GetMapping("/id/{id}")
    public InvoiceFieldConfig getById(@PathVariable Long id) {
        return fieldConfigService.getById(id);
    }

    @PostMapping
    public void addFieldConfig(@RequestBody @Valid InvoiceFieldConfigDTO configDTO) {
        InvoiceFieldConfig config = new InvoiceFieldConfig();
        BeanUtils.copyProperties(configDTO, config);
        fieldConfigService.addFieldConfig(config);
    }

    @PutMapping
    public void updateFieldConfig(@RequestBody @Valid InvoiceFieldConfigDTO configDTO) {
        InvoiceFieldConfig config = new InvoiceFieldConfig();
        BeanUtils.copyProperties(configDTO, config);
        fieldConfigService.updateFieldConfig(config);
    }

    @DeleteMapping("/{id}")
    public void deleteFieldConfig(@PathVariable Long id) {
        fieldConfigService.deleteFieldConfig(id);
    }
} 