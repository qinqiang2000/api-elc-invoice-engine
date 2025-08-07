package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.InvoiceFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 发票文件Mapper接口
 */
@Mapper
public interface InvoiceFileMapper {
    
    /**
     * 插入发票文件
     * @param invoiceFile 发票文件
     * @return 影响行数
     */
    int insert(InvoiceFile invoiceFile);
    
    /**
     * 根据ID删除发票文件
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
    
    /**
     * 批量删除发票文件
     * @param ids ID列表
     * @return 影响行数
     */
    int deleteBatch(@Param("ids") List<Long> ids);
    
    /**
     * 根据ID更新发票文件
     * @param invoiceFile 发票文件
     * @return 影响行数
     */
    int updateById(InvoiceFile invoiceFile);
    
    /**
     * 根据ID查询发票文件
     * @param id 主键ID
     * @return 发票文件
     */
    InvoiceFile selectById(@Param("id") Long id);
    
    /**
     * 根据租户ID查询发票文件列表
     * @param tenantId 租户ID
     * @return 发票文件列表
     */
    List<InvoiceFile> selectByTenantId(@Param("tenantId") String tenantId);
    
    /**
     * 根据关联ID查询发票文件列表
     * @param relationId 关联ID
     * @return 发票文件列表
     */
    List<InvoiceFile> selectByRelationId(@Param("relationId") String relationId);
    
    /**
     * 查询所有发票文件
     * @return 发票文件列表
     */
    List<InvoiceFile> selectAll();
    
    /**
     * 分页查询发票文件
     * @param offset 偏移量
     * @param limit 限制条数
     * @return 发票文件列表
     */
    List<InvoiceFile> selectPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询发票文件
     * @param invoiceFile 查询条件
     * @return 发票文件列表
     */
    List<InvoiceFile> selectByCondition(InvoiceFile invoiceFile);

    int deleteByTenantId(@Param("tenantId") String tenantId);

    int deleteByRelationId(@Param("relationId") String relationId);
}