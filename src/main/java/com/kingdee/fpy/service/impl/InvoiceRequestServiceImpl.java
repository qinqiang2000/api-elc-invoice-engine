package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceRequestMapper;
import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.service.InvoiceRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 发票申请服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class InvoiceRequestServiceImpl implements InvoiceRequestService {

    @Autowired
    private InvoiceRequestMapper invoiceRequestMapper;

    @Override
    public InvoiceRequest create(InvoiceRequest invoiceRequest) {
        try {
            invoiceRequest.setCreateTime(LocalDateTime.now());
            invoiceRequest.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestMapper.insert(invoiceRequest);
            if (result > 0) {
                log.info("创建发票申请成功，ID: {}", invoiceRequest.getId());
                return invoiceRequest;
            }
            throw new RuntimeException("创建发票申请失败");
        } catch (Exception e) {
            log.error("创建发票申请失败", e);
            throw new RuntimeException("创建发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = invoiceRequestMapper.deleteById(id);
            log.info("删除发票申请 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除发票申请失败，ID: {}", id, e);
            throw new RuntimeException("删除发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = invoiceRequestMapper.deleteBatch(ids);
            log.info("批量删除发票申请，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除发票申请失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceRequest update(InvoiceRequest invoiceRequest) {
        try {
            invoiceRequest.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestMapper.updateById(invoiceRequest);
            if (result > 0) {
                log.info("更新发票申请成功，ID: {}", invoiceRequest.getId());
                return invoiceRequestMapper.selectById(invoiceRequest.getId());
            }
            throw new RuntimeException("更新发票申请失败");
        } catch (Exception e) {
            log.error("更新发票申请失败", e);
            throw new RuntimeException("更新发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceRequest getById(Long id) {
        try {
            return invoiceRequestMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询发票申请失败，ID: {}", id, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceRequest getByInvoiceNo(String invoiceNo) {
        try {
            return invoiceRequestMapper.selectByInvoiceNo(invoiceNo);
        } catch (Exception e) {
            log.error("根据发票号查询发票申请失败，发票号: {}", invoiceNo, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getByTenantId(String tenantId) {
        try {
            return invoiceRequestMapper.selectByTenantId(tenantId);
        } catch (Exception e) {
            log.error("根据租户ID查询发票申请失败，租户ID: {}", tenantId, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getAll() {
        try {
            return invoiceRequestMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有发票申请失败", e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return invoiceRequestMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询发票申请失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return invoiceRequestMapper.count();
        } catch (Exception e) {
            log.error("统计发票申请总数失败", e);
            throw new RuntimeException("统计发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getByCondition(InvoiceRequest invoiceRequest) {
        try {
            return invoiceRequestMapper.selectByCondition(invoiceRequest);
        } catch (Exception e) {
            log.error("根据条件查询发票申请失败", e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    public InvoiceRequest queryByInvoiceNo(String invoiceNo) {
        return invoiceRequestMapper.selectByInvoiceNo(invoiceNo);
    }
}