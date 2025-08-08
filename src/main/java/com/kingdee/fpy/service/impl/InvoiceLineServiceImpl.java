package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceLineMapper;
import com.kingdee.fpy.model.InvoiceLine;
import com.kingdee.fpy.service.InvoiceLineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 发票行服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class InvoiceLineServiceImpl implements InvoiceLineService {

    @Autowired
    private InvoiceLineMapper invoiceLineMapper;

    @Override
    public InvoiceLine create(InvoiceLine invoiceLine) {
        try {
            invoiceLine.setCreateTime(LocalDateTime.now());
            invoiceLine.setUpdateTime(LocalDateTime.now());
            int result = invoiceLineMapper.insert(invoiceLine);
            if (result > 0) {
                log.info("创建发票行成功，ID: {}", invoiceLine.getId());
                return invoiceLine;
            }
            throw new RuntimeException("创建发票行失败");
        } catch (Exception e) {
            log.error("创建发票行失败", e);
            throw new RuntimeException("创建发票行失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = invoiceLineMapper.deleteById(id);
            log.info("删除发票行 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除发票行失败，ID: {}", id, e);
            throw new RuntimeException("删除发票行失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = invoiceLineMapper.deleteBatch(ids);
            log.info("批量删除发票行，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除发票行失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除发票行失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByInvoiceRequestId(Long invoiceRequestId) {
        try {
            int result = invoiceLineMapper.deleteByInvoiceRequestId(invoiceRequestId);
            log.info("根据申请单ID删除发票行，申请单ID: {}, 结果: {}", invoiceRequestId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据申请单ID删除发票行失败，申请单ID: {}", invoiceRequestId, e);
            throw new RuntimeException("根据申请单ID删除发票行失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceLine update(InvoiceLine invoiceLine) {
        try {
            invoiceLine.setUpdateTime(LocalDateTime.now());
            int result = invoiceLineMapper.updateById(invoiceLine);
            if (result > 0) {
                log.info("更新发票行成功，ID: {}", invoiceLine.getId());
                return invoiceLineMapper.selectById(invoiceLine.getId());
            }
            throw new RuntimeException("更新发票行失败");
        } catch (Exception e) {
            log.error("更新发票行失败", e);
            throw new RuntimeException("更新发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceLine getById(Long id) {
        try {
            return invoiceLineMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询发票行失败，ID: {}", id, e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceLine> getByInvoiceRequestId(Long invoiceRequestId) {
        try {
            return invoiceLineMapper.selectByInvoiceRequestId(invoiceRequestId);
        } catch (Exception e) {
            log.error("根据申请单ID查询发票行失败，申请单ID: {}", invoiceRequestId, e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceLine> getByInvoiceId(Long invoiceId) {
        try {
            return invoiceLineMapper.selectByInvoiceId(invoiceId);
        } catch (Exception e) {
            log.error("根据发票ID查询发票行失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceLine> getAll() {
        try {
            return invoiceLineMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有发票行失败", e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceLine> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return invoiceLineMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询发票行失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return invoiceLineMapper.count();
        } catch (Exception e) {
            log.error("统计发票行总数失败", e);
            throw new RuntimeException("统计发票行失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceLine> getByCondition(InvoiceLine invoiceLine) {
        try {
            return invoiceLineMapper.selectByCondition(invoiceLine);
        } catch (Exception e) {
            log.error("根据条件查询发票行失败", e);
            throw new RuntimeException("查询发票行失败: " + e.getMessage());
        }
    }

    public void batchInsert(List<InvoiceLine> items) {
        invoiceLineMapper.insertBatch(items);
    }
}