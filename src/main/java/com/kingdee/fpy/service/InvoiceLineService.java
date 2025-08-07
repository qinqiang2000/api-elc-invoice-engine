package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceLine;
import java.util.List;

/**
 * 发票行服务接口
 */
public interface InvoiceLineService {
    
    /**
     * 创建发票行
     * @param invoiceLine 发票行
     * @return 发票行
     */
    InvoiceLine create(InvoiceLine invoiceLine);
    
    /**
     * 根据ID删除发票行
     * @param id 主键ID
     * @return 是否成功
     */
    boolean deleteById(Long id);
    
    /**
     * 批量删除发票行
     * @param ids ID列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Long> ids);
    
    /**
     * 根据申请单ID删除发票行
     * @param invoiceRequestId 申请单ID
     * @return 是否成功
     */
    boolean deleteByInvoiceRequestId(Long invoiceRequestId);
    
    /**
     * 更新发票行
     * @param invoiceLine 发票行
     * @return 发票行
     */
    InvoiceLine update(InvoiceLine invoiceLine);
    
    /**
     * 根据ID查询发票行
     * @param id 主键ID
     * @return 发票行
     */
    InvoiceLine getById(Long id);
    
    /**
     * 根据申请单ID查询发票行列表
     * @param invoiceRequestId 申请单ID
     * @return 发票行列表
     */
    List<InvoiceLine> getByInvoiceRequestId(Long invoiceRequestId);
    
    /**
     * 根据发票ID查询发票行列表
     * @param invoiceId 发票ID
     * @return 发票行列表
     */
    List<InvoiceLine> getByInvoiceId(Long invoiceId);
    
    /**
     * 查询所有发票行
     * @return 发票行列表
     */
    List<InvoiceLine> getAll();
    
    /**
     * 分页查询发票行
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 发票行列表
     */
    List<InvoiceLine> getPage(int pageNum, int pageSize);
    
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
    List<InvoiceLine> getByCondition(InvoiceLine invoiceLine);
}