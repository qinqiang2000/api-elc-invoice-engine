package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceRequestHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 发票申请历史记录Mapper接口
 */
@Mapper
public interface InvoiceRequestHistoryMapper {
    
    /**
     * 插入历史记录
     * @param history 历史记录
     * @return 影响行数
     */
    int insert(InvoiceRequestHistory history);
    
    /**
     * 根据ID删除历史记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除历史记录
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据ID更新历史记录
     * @param history 历史记录
     * @return 影响行数
     */
    int updateById(InvoiceRequestHistory history);
    
    /**
     * 根据ID查询历史记录
     * @param id 主键ID
     * @return 历史记录
     */
    InvoiceRequestHistory selectById(@Param("id") Long id);
    
    /**
     * 根据发票ID查询历史记录列表
     * @param invoiceId 发票ID
     * @return 历史记录列表
     */
    List<InvoiceRequestHistory> selectByInvoiceId(@Param("invoiceId") String invoiceId);
    
    /**
     * 查询所有历史记录
     * @return 历史记录列表
     */
    List<InvoiceRequestHistory> selectAll();
    
    /**
     * 分页查询历史记录
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 历史记录列表
     */
    List<InvoiceRequestHistory> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询历史记录
     * @param history 查询条件
     * @return 历史记录列表
     */
    List<InvoiceRequestHistory> selectByCondition(InvoiceRequestHistory history);
}