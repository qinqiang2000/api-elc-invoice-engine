package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.Invoice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InvoiceMapper {
    int insert(Invoice invoice);
    Invoice findById(@Param("id") Long id);
    int update(Invoice invoice);
    int deleteById(@Param("id") Long id);
} 