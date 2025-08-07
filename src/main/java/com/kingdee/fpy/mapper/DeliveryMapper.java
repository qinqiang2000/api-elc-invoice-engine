package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.Delivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 交付信息Mapper接口
 */
@Mapper
public interface DeliveryMapper {
    
    /**
     * 插入交付信息
     * @param delivery 交付信息
     * @return 影响行数
     */
    int insert(Delivery delivery);
    
    /**
     * 根据ID删除交付信息
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除交付信息
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据ID更新交付信息
     * @param delivery 交付信息
     * @return 影响行数
     */
    int updateById(Delivery delivery);
    
    /**
     * 根据ID查询交付信息
     * @param id 主键ID
     * @return 交付信息
     */
    Delivery selectById(@Param("id") Long id);
    
    /**
     * 根据发票ID查询交付信息列表
     * @param invoiceId 发票ID
     * @return 交付信息列表
     */
    List<Delivery> selectByInvoiceId(@Param("invoiceId") String invoiceId);
    
    /**
     * 查询所有交付信息
     * @return 交付信息列表
     */
    List<Delivery> selectAll();
    
    /**
     * 分页查询交付信息
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 交付信息列表
     */
    List<Delivery> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询交付信息
     * @param delivery 查询条件
     * @return 交付信息列表
     */
    List<Delivery> selectByCondition(Delivery delivery);
}