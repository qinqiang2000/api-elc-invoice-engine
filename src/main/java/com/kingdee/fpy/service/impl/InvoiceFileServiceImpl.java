package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceFileMapper;
import com.kingdee.fpy.model.InvoiceFile;
import com.kingdee.fpy.service.InvoiceFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 发票文件服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class InvoiceFileServiceImpl implements InvoiceFileService {

    @Autowired
    private InvoiceFileMapper invoiceFileMapper;

    @Override
    public InvoiceFile create(InvoiceFile invoiceFile) {
        try {
            invoiceFile.setCreateTime(LocalDateTime.now());
            invoiceFile.setUpdateTime(LocalDateTime.now());
            int result = invoiceFileMapper.insert(invoiceFile);
            if (result > 0) {
                log.info("创建发票文件成功，ID: {}", invoiceFile.getId());
                return invoiceFile;
            }
            throw new RuntimeException("创建发票文件失败");
        } catch (Exception e) {
            log.error("创建发票文件失败", e);
            throw new RuntimeException("创建发票文件失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = invoiceFileMapper.deleteById(id);
            log.info("删除发票文件 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除发票文件失败，ID: {}", id, e);
            throw new RuntimeException("删除发票文件失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = invoiceFileMapper.deleteBatch(ids);
            log.info("批量删除发票文件，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除发票文件失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除发票文件失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByTenantId(String tenantId) {
        try {
            int result = invoiceFileMapper.deleteByTenantId(tenantId);
            log.info("根据租户ID删除发票文件，租户ID: {}, 结果: {}", tenantId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据租户ID删除发票文件失败，租户ID: {}", tenantId, e);
            throw new RuntimeException("根据租户ID删除发票文件失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByRelationId(String relationId) {
        try {
            int result = invoiceFileMapper.deleteByRelationId(relationId);
            log.info("根据关联ID删除发票文件，关联ID: {}, 结果: {}", relationId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据关联ID删除发票文件失败，关联ID: {}", relationId, e);
            throw new RuntimeException("根据关联ID删除发票文件失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceFile update(InvoiceFile invoiceFile) {
        try {
            invoiceFile.setUpdateTime(LocalDateTime.now());
            int result = invoiceFileMapper.updateById(invoiceFile);
            if (result > 0) {
                log.info("更新发票文件成功，ID: {}", invoiceFile.getId());
                return invoiceFileMapper.selectById(invoiceFile.getId());
            }
            throw new RuntimeException("更新发票文件失败");
        } catch (Exception e) {
            log.error("更新发票文件失败", e);
            throw new RuntimeException("更新发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceFile getById(Long id) {
        try {
            return invoiceFileMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询发票文件失败，ID: {}", id, e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceFile> getByTenantId(String tenantId) {
        try {
            return invoiceFileMapper.selectByTenantId(tenantId);
        } catch (Exception e) {
            log.error("根据租户ID查询发票文件失败，租户ID: {}", tenantId, e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceFile> getByRelationId(String relationId) {
        try {
            return invoiceFileMapper.selectByRelationId(relationId);
        } catch (Exception e) {
            log.error("根据关联ID查询发票文件失败，关联ID: {}", relationId, e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceFile getByFileId(String fileId) {
        try {
            return invoiceFileMapper.selectById(Long.valueOf(fileId));
        } catch (Exception e) {
            log.error("根据文件ID查询发票文件失败，文件ID: {}", fileId, e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceFile> getAll() {
        try {
            return invoiceFileMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有发票文件失败", e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceFile> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return invoiceFileMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询发票文件失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return invoiceFileMapper.count();
        } catch (Exception e) {
            log.error("统计发票文件总数失败", e);
            throw new RuntimeException("统计发票文件失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceFile> getByCondition(InvoiceFile invoiceFile) {
        try {
            return invoiceFileMapper.selectByCondition(invoiceFile);
        } catch (Exception e) {
            log.error("根据条件查询发票文件失败", e);
            throw new RuntimeException("查询发票文件失败: " + e.getMessage());
        }
    }
}