package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceRequestHistoryMapper;
import com.kingdee.fpy.model.InvoiceRequestHistory;
import com.kingdee.fpy.service.InvoiceRequestHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 发票申请历史记录服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class InvoiceRequestHistoryServiceImpl implements InvoiceRequestHistoryService {

    @Autowired
    private InvoiceRequestHistoryMapper invoiceRequestHistoryMapper;

    @Override
    public InvoiceRequestHistory create(InvoiceRequestHistory history) {
        try {
            history.setCreateTime(LocalDateTime.now());
            history.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestHistoryMapper.insert(history);
            if (result > 0) {
                log.info("创建发票申请历史记录成功，ID: {}", history.getId());
                return history;
            }
            throw new RuntimeException("创建发票申请历史记录失败");
        } catch (Exception e) {
            log.error("创建发票申请历史记录失败", e);
            throw new RuntimeException("创建发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = invoiceRequestHistoryMapper.deleteById(id);
            log.info("删除发票申请历史记录 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除发票申请历史记录失败，ID: {}", id, e);
            throw new RuntimeException("删除发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = invoiceRequestHistoryMapper.deleteBatch(ids);
            log.info("批量删除发票申请历史记录，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除发票申请历史记录失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByInvoiceId(String invoiceId) {
        try {
            int result = invoiceRequestHistoryMapper.deleteById(Long.valueOf(invoiceId));
            log.info("根据发票ID删除发票申请历史记录，发票ID: {}, 结果: {}", invoiceId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据发票ID删除发票申请历史记录失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("根据发票ID删除发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByInvoiceLineId(String invoiceLineId) {
        try {
            int result = invoiceRequestHistoryMapper.deleteById(Long.valueOf(invoiceLineId));
            log.info("根据发票行ID删除发票申请历史记录，发票行ID: {}, 结果: {}", invoiceLineId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据发票行ID删除发票申请历史记录失败，发票行ID: {}", invoiceLineId, e);
            throw new RuntimeException("根据发票行ID删除发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceRequestHistory update(InvoiceRequestHistory history) {
        try {
            history.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestHistoryMapper.updateById(history);
            if (result > 0) {
                log.info("更新发票申请历史记录成功，ID: {}", history.getId());
                return invoiceRequestHistoryMapper.selectById(history.getId());
            }
            throw new RuntimeException("更新发票申请历史记录失败");
        } catch (Exception e) {
            log.error("更新发票申请历史记录失败", e);
            throw new RuntimeException("更新发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceRequestHistory getById(Long id) {
        try {
            return invoiceRequestHistoryMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询发票申请历史记录失败，ID: {}", id, e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequestHistory> getByInvoiceId(String invoiceId) {
        try {
            return invoiceRequestHistoryMapper.selectByInvoiceId(invoiceId);
        } catch (Exception e) {
            log.error("根据发票ID查询发票申请历史记录失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequestHistory> getByInvoiceLineId(String invoiceLineId) {
        try {
            return invoiceRequestHistoryMapper.selectByInvoiceId(invoiceLineId);
        } catch (Exception e) {
            log.error("根据发票行ID查询发票申请历史记录失败，发票行ID: {}", invoiceLineId, e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequestHistory> getAll() {
        try {
            return invoiceRequestHistoryMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有发票申请历史记录失败", e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequestHistory> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return invoiceRequestHistoryMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询发票申请历史记录失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return invoiceRequestHistoryMapper.count();
        } catch (Exception e) {
            log.error("统计发票申请历史记录总数失败", e);
            throw new RuntimeException("统计发票申请历史记录失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequestHistory> getByCondition(InvoiceRequestHistory history) {
        try {
            return invoiceRequestHistoryMapper.selectByCondition(history);
        } catch (Exception e) {
            log.error("根据条件查询发票申请历史记录失败", e);
            throw new RuntimeException("查询发票申请历史记录失败: " + e.getMessage());
        }
    }
}