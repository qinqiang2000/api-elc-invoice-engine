package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.model.InvoiceRequestQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

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
     * 分页查询发票申请（支持过滤条件）
     * @param query 查询参数
     * @return 发票申请列表
     */
    List<InvoiceRequest> selectPageWithFilter(InvoiceRequestQuery query);
    
    /**
     * 统计符合条件的记录总数
     * @param query 查询参数
     * @return 总数
     */
    long countWithFilter(InvoiceRequestQuery query);
    
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
    
    /**
     * 统计各单据综合状态的开票请求数量
     * @param companyId 企业ID
     * @return 以状态码为key，数量为value的Map列表
     */
    List<Map<String, Object>> selectStatusStatistics(@Param("companyId") String companyId);
    
    /**
     * 统计企业最近24小时按小时维度的各状态开票请求数量
     * @param companyId 企业ID
     * @return 包含小时和各状态统计的Map列表
     */
    List<Map<String, Object>> selectHourlyStatusStatistics(@Param("companyId") String companyId);
}