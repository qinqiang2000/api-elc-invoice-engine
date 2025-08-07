package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceFile;
import java.util.List;

/**
 * 发票文件服务接口
 */
public interface InvoiceFileService {
    
    /**
     * 创建发票文件
     * @param invoiceFile 发票文件
     * @return 发票文件
     */
    InvoiceFile create(InvoiceFile invoiceFile);
    
    /**
     * 根据ID删除发票文件
     * @param id 主键ID
     * @return 是否成功
     */
    boolean deleteById(Long id);
    
    /**
     * 批量删除发票文件
     * @param ids ID列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Long> ids);
    
    /**
     * 根据租户ID删除发票文件
     * @param tenantId 租户ID
     * @return 是否成功
     */
    boolean deleteByTenantId(String tenantId);
    
    /**
     * 根据关联ID删除发票文件
     * @param relationId 关联ID
     * @return 是否成功
     */
    boolean deleteByRelationId(String relationId);
    
    /**
     * 更新发票文件
     * @param invoiceFile 发票文件
     * @return 发票文件
     */
    InvoiceFile update(InvoiceFile invoiceFile);
    
    /**
     * 根据ID查询发票文件
     * @param id 主键ID
     * @return 发票文件
     */
    InvoiceFile getById(Long id);
    
    /**
     * 根据租户ID查询发票文件列表
     * @param tenantId 租户ID
     * @return 发票文件列表
     */
    List<InvoiceFile> getByTenantId(String tenantId);
    
    /**
     * 根据关联ID查询发票文件列表
     * @param relationId 关联ID
     * @return 发票文件列表
     */
    List<InvoiceFile> getByRelationId(String relationId);
    
    /**
     * 根据文件ID查询发票文件
     * @param fileId 文件ID
     * @return 发票文件
     */
    InvoiceFile getByFileId(String fileId);
    
    /**
     * 查询所有发票文件
     * @return 发票文件列表
     */
    List<InvoiceFile> getAll();
    
    /**
     * 分页查询发票文件
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 发票文件列表
     */
    List<InvoiceFile> getPage(int pageNum, int pageSize);
    
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
    List<InvoiceFile> getByCondition(InvoiceFile invoiceFile);
}