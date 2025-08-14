package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * InvoiceType Mapper接口
 */
@Mapper
public interface InvoiceTypeMapper {

    /**
     * 插入一条记录
     * @param invoiceType InvoiceType实体
     * @return 影响行数
     */
    int insert(InvoiceType invoiceType);

    /**
     * 批量插入记录
     * @param invoiceTypes InvoiceType实体列表
     * @return 影响行数
     */
    int batchInsert(@Param("list") List<InvoiceType> invoiceTypes);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);

    /**
     * 根据ID更新记录
     * @param invoiceType InvoiceType实体
     * @return 影响行数
     */
    int updateById(InvoiceType invoiceType);

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return InvoiceType实体
     */
    InvoiceType selectById(@Param("id") Long id);

    /**
     * 查询所有记录
     * @return InvoiceType实体列表
     */
    List<InvoiceType> selectAll();

    /**
     * 根据发票代码查询记录
     * @param invoiceCode 发票代码
     * @return InvoiceType实体
     */
    InvoiceType selectByInvoiceCode(@Param("invoiceCode") String invoiceCode);

    /**
     * 根据国家和贸易区查询记录
     * @param country 国家二字码
     * @param tradeArea 贸易区
     * @return InvoiceType实体列表
     */
    List<InvoiceType> selectByCountryAndTradeArea(@Param("country") String country, @Param("tradeArea") String tradeArea);
}