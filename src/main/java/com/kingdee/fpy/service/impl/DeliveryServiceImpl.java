package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.DeliveryMapper;
import com.kingdee.fpy.model.Delivery;
import com.kingdee.fpy.service.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 交付信息服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Override
    public Delivery create(Delivery delivery) {
        try {
            delivery.setCreateTime(LocalDateTime.now());
            delivery.setUpdateTime(LocalDateTime.now());
            int result = deliveryMapper.insert(delivery);
            if (result > 0) {
                log.info("创建交付信息成功，ID: {}", delivery.getId());
                return delivery;
            }
            throw new RuntimeException("创建交付信息失败");
        } catch (Exception e) {
            log.error("创建交付信息失败", e);
            throw new RuntimeException("创建交付信息失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = deliveryMapper.deleteById(id);
            log.info("删除交付信息 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除交付信息失败，ID: {}", id, e);
            throw new RuntimeException("删除交付信息失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = deliveryMapper.deleteBatch(ids);
            log.info("批量删除交付信息，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除交付信息失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除交付信息失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteByInvoiceId(String invoiceId) {
        try {
            int result = deliveryMapper.deleteById(Long.valueOf(invoiceId));
            log.info("根据发票ID删除交付信息，发票ID: {}, 结果: {}", invoiceId, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("根据发票ID删除交付信息失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("根据发票ID删除交付信息失败: " + e.getMessage());
        }
    }

    @Override
    public Delivery update(Delivery delivery) {
        try {
            delivery.setUpdateTime(LocalDateTime.now());
            int result = deliveryMapper.updateById(delivery);
            if (result > 0) {
                log.info("更新交付信息成功，ID: {}", delivery.getId());
                return deliveryMapper.selectById(delivery.getId());
            }
            throw new RuntimeException("更新交付信息失败");
        } catch (Exception e) {
            log.error("更新交付信息失败", e);
            throw new RuntimeException("更新交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Delivery getById(Long id) {
        try {
            return deliveryMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询交付信息失败，ID: {}", id, e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Delivery getByInvoiceId(String invoiceId) {
        try {
            List<Delivery> deliveries = deliveryMapper.selectByInvoiceId(invoiceId);
            return deliveries.size() > 0 ? deliveries.get(0) : null;
        } catch (Exception e) {
            log.error("根据发票ID查询交付信息失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Delivery> getListByInvoiceId(String invoiceId) {
        try {
            return deliveryMapper.selectByInvoiceId(invoiceId);
        } catch (Exception e) {
            log.error("根据发票ID查询交付信息列表失败，发票ID: {}", invoiceId, e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Delivery> getAll() {
        try {
            return deliveryMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有交付信息失败", e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Delivery> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return deliveryMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询交付信息失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return deliveryMapper.count();
        } catch (Exception e) {
            log.error("统计交付信息总数失败", e);
            throw new RuntimeException("统计交付信息失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Delivery> getByCondition(Delivery delivery) {
        try {
            return deliveryMapper.selectByCondition(delivery);
        } catch (Exception e) {
            log.error("根据条件查询交付信息失败", e);
            throw new RuntimeException("查询交付信息失败: " + e.getMessage());
        }
    }
}