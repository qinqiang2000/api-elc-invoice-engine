package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceRequestHistory;
import java.util.List;

/**
 * 发票申请历史记录服务接口
 */
public interface InvoiceRequestHistoryService {
    
    /**
     * 创建发票申请历史记录
     * @param history 发票申请历史记录
     * @return 发票申请历史记录
     */
    InvoiceRequestHistory create(InvoiceRequestHistory history);
    
    /**
     * 根据ID删除发票申请历史记录
     * @param id 主键ID
     * @return 是否成功
     */
    boolean deleteById(Long id);
    
    /**
     * 批量删除发票申请历史记录
     * @param ids ID列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Long> ids);
    
    /**
     * 根据发票ID删除发票申请历史记录
     * @param invoiceId 发票ID
     * @return 是否成功
     */
    boolean deleteByInvoiceId(String invoiceId);
    
    /**
     * 根据发票行ID删除发票申请历史记录
     * @param invoiceLineId 发票行ID
     * @return 是否成功
     */
    boolean deleteByInvoiceLineId(String invoiceLineId);
    
    /**
     * 更新发票申请历史记录
     * @param history 发票申请历史记录
     * @return 发票申请历史记录
     */
    InvoiceRequestHistory update(InvoiceRequestHistory history);
    
    /**
     * 根据ID查询发票申请历史记录
     * @param id 主键ID
     * @return 发票申请历史记录
     */
    InvoiceRequestHistory getById(Long id);
    
    /**
     * 根据发票ID查询发票申请历史记录列表
     * @param invoiceId 发票ID
     * @return 发票申请历史记录列表
     */
    List<InvoiceRequestHistory> getByInvoiceId(String invoiceId);
    
    /**
     * 根据发票行ID查询发票申请历史记录列表
     * @param invoiceLineId 发票行ID
     * @return 发票申请历史记录列表
     */
    List<InvoiceRequestHistory> getByInvoiceLineId(String invoiceLineId);
    
    /**
     * 查询所有发票申请历史记录
     * @return 发票申请历史记录列表
     */
    List<InvoiceRequestHistory> getAll();
    
    /**
     * 分页查询发票申请历史记录
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 发票申请历史记录列表
     */
    List<InvoiceRequestHistory> getPage(int pageNum, int pageSize);
    
    /**
     * 统计总数
     * @return 总数
     */
    long count();
    
    /**
     * 根据条件查询发票申请历史记录
     * @param history 查询条件
     * @return 发票申请历史记录列表
     */
    List<InvoiceRequestHistory> getByCondition(InvoiceRequestHistory history);
}