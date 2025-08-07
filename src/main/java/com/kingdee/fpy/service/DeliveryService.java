package com.kingdee.fpy.service;

import com.kingdee.fpy.model.Delivery;
import java.util.List;

/**
 * 交付信息服务接口
 */
public interface DeliveryService {
    
    /**
     * 创建交付信息
     * @param delivery 交付信息
     * @return 交付信息
     */
    Delivery create(Delivery delivery);
    
    /**
     * 根据ID删除交付信息
     * @param id 主键ID
     * @return 是否成功
     */
    boolean deleteById(Long id);
    
    /**
     * 批量删除交付信息
     * @param ids ID列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Long> ids);
    
    /**
     * 根据发票ID删除交付信息
     * @param invoiceId 发票ID
     * @return 是否成功
     */
    boolean deleteByInvoiceId(String invoiceId);
    
    /**
     * 更新交付信息
     * @param delivery 交付信息
     * @return 交付信息
     */
    Delivery update(Delivery delivery);
    
    /**
     * 根据ID查询交付信息
     * @param id 主键ID
     * @return 交付信息
     */
    Delivery getById(Long id);
    
    /**
     * 根据发票ID查询交付信息
     * @param invoiceId 发票ID
     * @return 交付信息
     */
    Delivery getByInvoiceId(String invoiceId);
    
    /**
     * 根据发票ID查询交付信息列表
     * @param invoiceId 发票ID
     * @return 交付信息列表
     */
    List<Delivery> getListByInvoiceId(String invoiceId);
    
    /**
     * 查询所有交付信息
     * @return 交付信息列表
     */
    List<Delivery> getAll();
    
    /**
     * 分页查询交付信息
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 交付信息列表
     */
    List<Delivery> getPage(int pageNum, int pageSize);
    
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
    List<Delivery> getByCondition(Delivery delivery);
}