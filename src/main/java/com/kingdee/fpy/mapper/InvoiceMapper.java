package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.model.CurrencyStats;
import com.kingdee.fpy.model.HourlyStatusStats;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 发票Mapper接口
 */
@Mapper
public interface InvoiceMapper {
    
    /**
     * 插入发票
     * @param invoice 发票
     * @return 影响行数
     */
    int insert(Invoice invoice);
    
    /**
     * 根据ID删除发票
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除发票
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据ID更新发票
     * @param invoice 发票
     * @return 影响行数
     */
    int updateById(Invoice invoice);
    
    /**
     * 根据ID查询发票
     * @param id 主键ID
     * @return 发票
     */
    Invoice selectById(@Param("id") Long id);
    
    /**
     * 根据发票号查询发票
     * @param invoiceNo 发票号
     * @return 发票
     */
    Invoice selectByInvoiceNo(@Param("invoiceNo") String invoiceNo);
    
    /**
     * 根据租户ID查询发票列表
     * @param tenantId 租户ID
     * @return 发票列表
     */
    List<Invoice> selectByTenantId(@Param("tenantId") String tenantId);
    
    /**
     * 查询所有发票
     * @return 发票列表
     */
    List<Invoice> selectAll();
    
    /**
     * 分页查询发票
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 发票列表
     */
    List<Invoice> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询发票
     * @param invoice 查询条件
     * @return 发票列表
     */
    List<Invoice> selectByCondition(Invoice invoice);
    
    /**
     * 根据条件分页查询发票
     * @param query 查询条件
     * @return 发票列表
     */
    List<Invoice> selectByQuery(InvoiceQuery query);
    
    /**
     * 根据条件统计总数
     * @param query 查询条件
     * @return 总数
     */
    long countByQuery(InvoiceQuery query);
    
    // 兼容性方法
    @Deprecated
    Invoice findById(@Param("id") Long id);
    
    @Deprecated
    Invoice findByInvoiceNo(@Param("invoiceNo") String invoiceNo);
    
    @Deprecated
    int update(Invoice invoice);
    
    /**
     * 按状态统计发票数量
     * @return 状态和数量的映射
     */
    List<Map<String, Object>> countByStatus();
    
    /**
     * 按企业ID和币种统计总金额和税额
     * @param companyId 企业ID
     * @return 币种统计列表
     */
    List<CurrencyStats> getCurrencyStatsByCompany(@Param("companyId") String companyId);
    
    /**
     * 最近24小时按小时分组统计各状态的发票数
     * @return 按小时和状态统计的列表
     */
    List<HourlyStatusStats> getHourlyStatusStats();
} 