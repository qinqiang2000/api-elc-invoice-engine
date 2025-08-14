package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceType;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * InvoiceType服务接口
 */
public interface InvoiceTypeService {

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
    int batchInsert(List<InvoiceType> invoiceTypes);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

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
    InvoiceType selectById(Long id);

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
    InvoiceType selectByInvoiceCode(String invoiceCode);

    /**
     * 根据国家和贸易区查询记录
     * @param country 国家二字码
     * @param tradeArea 贸易区
     * @return InvoiceType实体列表
     */
    List<InvoiceType> selectByCountryAndTradeArea(String country, String tradeArea);

    /**
     * 从Excel文件导入发票类型数据
     * @param file Excel文件
     * @return 导入结果消息
     * @throws Exception 处理异常
     */
    String importFromExcel(MultipartFile file) throws Exception;
}