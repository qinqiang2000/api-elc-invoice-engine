package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.Delivery;
import com.kingdee.fpy.service.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 交付信息控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/delivery")
@CrossOrigin(origins = "*")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    /**
     * 创建交付信息
     * @param delivery 交付信息
     * @return 结果
     */
    @PostMapping
    public Result<Delivery> create(@Valid @RequestBody Delivery delivery) {
        try {
            log.info("创建交付信息: {}", delivery.getInvoiceId());
            Delivery result = deliveryService.create(delivery);
            return Result.success(result);
        } catch (Exception e) {
            log.error("创建交付信息失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID删除交付信息
     * @param id 主键ID
     * @return 结果
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Long id) {
        try {
            log.info("删除交付信息，ID: {}", id);
            boolean success = deliveryService.deleteById(id);
            return Result.success(success);
        } catch (Exception e) {
            log.error("删除交付信息失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 批量删除交付信息
     * @param ids ID列表
     * @return 结果
     */
    @DeleteMapping("/batch")
    public Result<Boolean> deleteBatch(@RequestBody List<Long> ids) {
        try {
            log.info("批量删除交付信息，IDs: {}", ids);
            boolean success = deliveryService.deleteBatch(ids);
            return Result.success(success);
        } catch (Exception e) {
            log.error("批量删除交付信息失败，IDs: {}", ids, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID删除交付信息
     * @param invoiceId 发票ID
     * @return 结果
     */
    @DeleteMapping("/by-invoice/{invoiceId}")
    public Result<Boolean> deleteByInvoiceId(@PathVariable String invoiceId) {
        try {
            log.info("根据发票ID删除交付信息，发票ID: {}", invoiceId);
            boolean success = deliveryService.deleteByInvoiceId(invoiceId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据发票ID删除交付信息失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 更新交付信息
     * @param delivery 交付信息
     * @return 结果
     */
    @PutMapping
    public Result<Delivery> update(@Valid @RequestBody Delivery delivery) {
        try {
            log.info("更新交付信息，ID: {}", delivery.getId());
            Delivery result = deliveryService.update(delivery);
            return Result.success(result);
        } catch (Exception e) {
            log.error("更新交付信息失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID查询交付信息
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public Result<Delivery> getById(@PathVariable Long id) {
        try {
            log.info("查询交付信息，ID: {}", id);
            Delivery result = deliveryService.getById(id);
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询交付信息失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID查询交付信息
     * @param invoiceId 发票ID
     * @return 结果
     */
    @GetMapping("/by-invoice/{invoiceId}")
    public Result<Delivery> getByInvoiceId(@PathVariable String invoiceId) {
        try {
            log.info("根据发票ID查询交付信息，发票ID: {}", invoiceId);
            Delivery result = deliveryService.getByInvoiceId(invoiceId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票ID查询交付信息失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID查询交付信息列表
     * @param invoiceId 发票ID
     * @return 结果
     */
    @GetMapping("/list-by-invoice/{invoiceId}")
    public Result<List<Delivery>> getListByInvoiceId(@PathVariable String invoiceId) {
        try {
            log.info("根据发票ID查询交付信息列表，发票ID: {}", invoiceId);
            List<Delivery> result = deliveryService.getListByInvoiceId(invoiceId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票ID查询交付信息列表失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询所有交付信息
     * @return 结果
     */
    @GetMapping
    public Result<List<Delivery>> getAll() {
        try {
            log.info("查询所有交付信息");
            List<Delivery> result = deliveryService.getAll();
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询所有交付信息失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 分页查询交付信息
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 结果
     */
    @GetMapping("/page")
    public Result<List<Delivery>> getPage(@RequestParam(defaultValue = "1") int pageNum,
                                          @RequestParam(defaultValue = "10") int pageSize) {
        try {
            log.info("分页查询交付信息，页码: {}, 页大小: {}", pageNum, pageSize);
            List<Delivery> result = deliveryService.getPage(pageNum, pageSize);
            return Result.success(result);
        } catch (Exception e) {
            log.error("分页查询交付信息失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 统计总数
     * @return 结果
     */
    @GetMapping("/count")
    public Result<Long> count() {
        try {
            log.info("统计交付信息总数");
            long count = deliveryService.count();
            return Result.success(count);
        } catch (Exception e) {
            log.error("统计交付信息总数失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据条件查询交付信息
     * @param delivery 查询条件
     * @return 结果
     */
    @PostMapping("/search")
    public Result<List<Delivery>> search(@RequestBody Delivery delivery) {
        try {
            log.info("根据条件查询交付信息");
            List<Delivery> result = deliveryService.getByCondition(delivery);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据条件查询交付信息失败", e);
            return Result.error(e.getMessage());
        }
    }
}