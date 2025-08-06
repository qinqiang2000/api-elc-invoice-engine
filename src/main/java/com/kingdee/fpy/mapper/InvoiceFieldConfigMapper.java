package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceFieldConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface InvoiceFieldConfigMapper {
    List<InvoiceFieldConfig> findByCountryCode(@Param("countryCode") String countryCode);
    int insert(InvoiceFieldConfig config);
    int update(InvoiceFieldConfig config);
    int deleteById(@Param("id") Long id);
    InvoiceFieldConfig findById(@Param("id") Long id);
} 