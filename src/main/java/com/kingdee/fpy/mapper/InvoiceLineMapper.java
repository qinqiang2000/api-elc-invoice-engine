package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceLine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 发票行Mapper接口
 */
@Mapper
public interface InvoiceLineMapper {
    
    /**
     * 插入发票行
     * @param invoiceLine 发票行
     * @return 影响行数
     */
    int insert(InvoiceLine invoiceLine);
    
    /**
     * 根据ID删除发票行
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除发票行
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据申请单ID删除发票行
     * @param invoiceRequestId 申请单ID
     * @return 影响行数
     */
    int deleteByInvoiceRequestId(@Param("invoiceRequestId") Long invoiceRequestId);
    
    /**
     * 根据ID更新发票行
     * @param invoiceLine 发票行
     * @return 影响行数
     */
    int updateById(InvoiceLine invoiceLine);
    
    /**
     * 根据ID查询发票行
     * @param id 主键ID
     * @return 发票行
     */
    InvoiceLine selectById(@Param("id") Long id);
    
    /**
     * 根据申请单ID查询发票行列表
     * @param invoiceRequestId 申请单ID
     * @return 发票行列表
     */
    List<InvoiceLine> selectByInvoiceRequestId(@Param("invoiceRequestId") Long invoiceRequestId);
    
    /**
     * 根据发票ID查询发票行列表
     * @param invoiceId 发票ID
     * @return 发票行列表
     */
    List<InvoiceLine> selectByInvoiceId(@Param("invoiceId") Long invoiceId);
    
    /**
     * 查询所有发票行
     * @return 发票行列表
     */
    List<InvoiceLine> selectAll();
    
    /**
     * 分页查询发票行
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 发票行列表
     */
    List<InvoiceLine> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询发票行
     * @param invoiceLine 查询条件
     * @return 发票行列表
     */
    List<InvoiceLine> selectByCondition(InvoiceLine invoiceLine);
}