package com.kingdee.fpy.service;

import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.model.InvoiceRequestQuery;
import com.kingdee.fpy.commom.ResultPage;
import java.util.List;
import java.util.Map;

/**
 * 发票申请服务接口
 */
public interface InvoiceRequestService {
    
    /**
     * 创建发票申请
     * @param invoiceRequest 发票申请
     * @return 发票申请
     */
    InvoiceRequest create(InvoiceRequest invoiceRequest);
    
    /**
     * 根据ID删除发票申请
     * @param id 主键ID
     * @return 是否成功
     */
    boolean deleteById(Long id);
    
    /**
     * 批量删除发票申请
     * @param ids ID列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Long> ids);
    
    /**
     * 更新发票申请
     * @param invoiceRequest 发票申请
     * @return 发票申请
     */
    InvoiceRequest update(InvoiceRequest invoiceRequest);
    
    /**
     * 根据ID查询发票申请
     * @param id 主键ID
     * @return 发票申请
     */
    InvoiceRequest getById(Long id);
    
    /**
     * 根据发票号查询发票申请
     * @param invoiceNo 发票号
     * @return 发票申请
     */
    InvoiceRequest getByInvoiceNo(String invoiceNo);
    
    /**
     * 根据租户ID查询发票申请列表
     * @param tenantId 租户ID
     * @return 发票申请列表
     */
    List<InvoiceRequest> getByTenantId(String tenantId);
    
    /**
     * 查询所有发票申请
     * @return 发票申请列表
     */
    List<InvoiceRequest> getAll();
    
    /**
     * 分页查询发票申请
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 发票申请列表
     */
    List<InvoiceRequest> getPage(int pageNum, int pageSize);
    
    /**
     * 分页查询发票申请（支持过滤条件）
     * @param query 查询参数
     * @return 分页结果
     */
    ResultPage getPageWithFilter(InvoiceRequestQuery query);
    
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
    List<InvoiceRequest> getByCondition(InvoiceRequest invoiceRequest);
    
    /**
     * 统计各单据综合状态的开票请求数量
     * @param companyId 企业ID
     * @return 以状态名称为key，数量为value的Map
     */
    Map<String, Long> getStatusStatistics(String companyId);
    
    /**
     * 统计企业最近24小时按小时维度的各状态开票请求数量
     * @param companyId 企业ID
     * @return 按小时分组的状态统计，格式为[{hour, statuses: {status1: count1, status2: count2}}]
     */
    List<Map<String, Object>> getHourlyStatusStatistics(String companyId);
    
    /**
     * 批量提交开票申请
     * @param ids 开票申请单ID列表
     * @return 提交结果，包含成功/失败统计和失败详情
     */
    Map<String, Object> submitInvoiceRequests(List<Long> ids);
}