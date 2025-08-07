package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 发票申请Mapper接口
 */
@Mapper
public interface InvoiceRequestMapper {
    
    /**
     * 插入发票申请
     * @param invoiceRequest 发票申请
     * @return 影响行数
     */
    int insert(InvoiceRequest invoiceRequest);
    
    /**
     * 根据ID删除发票申请
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除发票申请
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据ID更新发票申请
     * @param invoiceRequest 发票申请
     * @return 影响行数
     */
    int updateById(InvoiceRequest invoiceRequest);
    
    /**
     * 根据ID查询发票申请
     * @param id 主键ID
     * @return 发票申请
     */
    InvoiceRequest selectById(@Param("id") Long id);
    
    /**
     * 根据发票号查询发票申请
     * @param invoiceNo 发票号
     * @return 发票申请
     */
    InvoiceRequest selectByInvoiceNo(@Param("invoiceNo") String invoiceNo);
    
    /**
     * 根据租户ID查询发票申请列表
     * @param tenantId 租户ID
     * @return 发票申请列表
     */
    List<InvoiceRequest> selectByTenantId(@Param("tenantId") String tenantId);
    
    /**
     * 查询所有发票申请
     * @return 发票申请列表
     */
    List<InvoiceRequest> selectAll();
    
    /**
     * 分页查询发票申请
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 发票申请列表
     */
    List<InvoiceRequest> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询发票申请
     * @param invoiceRequest 查询条件
     * @return 发票申请列表
     */
    List<InvoiceRequest> selectByCondition(InvoiceRequest invoiceRequest);
}