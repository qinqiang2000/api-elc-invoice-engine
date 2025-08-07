package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceRequestHistory;
import com.kingdee.fpy.service.InvoiceRequestHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 发票申请历史记录控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/invoice-request-history")
@CrossOrigin(origins = "*")
public class InvoiceRequestHistoryController {

    @Autowired
    private InvoiceRequestHistoryService invoiceRequestHistoryService;

    /**
     * 创建发票申请历史记录
     * @param history 发票申请历史记录
     * @return 结果
     */
    @PostMapping
    public Result<InvoiceRequestHistory> create(@Valid @RequestBody InvoiceRequestHistory history) {
        try {
            log.info("创建发票申请历史记录: {}", history.getInvoiceId());
            InvoiceRequestHistory result = invoiceRequestHistoryService.create(history);
            return Result.success(result);
        } catch (Exception e) {
            log.error("创建发票申请历史记录失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID删除发票申请历史记录
     * @param id 主键ID
     * @return 结果
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Long id) {
        try {
            log.info("删除发票申请历史记录，ID: {}", id);
            boolean success = invoiceRequestHistoryService.deleteById(id);
            return Result.success(success);
        } catch (Exception e) {
            log.error("删除发票申请历史记录失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 批量删除发票申请历史记录
     * @param ids ID列表
     * @return 结果
     */
    @DeleteMapping("/batch")
    public Result<Boolean> deleteBatch(@RequestBody List<Long> ids) {
        try {
            log.info("批量删除发票申请历史记录，IDs: {}", ids);
            boolean success = invoiceRequestHistoryService.deleteBatch(ids);
            return Result.success(success);
        } catch (Exception e) {
            log.error("批量删除发票申请历史记录失败，IDs: {}", ids, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID删除发票申请历史记录
     * @param invoiceId 发票ID
     * @return 结果
     */
    @DeleteMapping("/by-invoice/{invoiceId}")
    public Result<Boolean> deleteByInvoiceId(@PathVariable String invoiceId) {
        try {
            log.info("根据发票ID删除发票申请历史记录，发票ID: {}", invoiceId);
            boolean success = invoiceRequestHistoryService.deleteByInvoiceId(invoiceId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据发票ID删除发票申请历史记录失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票行ID删除发票申请历史记录
     * @param invoiceLineId 发票行ID
     * @return 结果
     */
    @DeleteMapping("/by-line/{invoiceLineId}")
    public Result<Boolean> deleteByInvoiceLineId(@PathVariable String invoiceLineId) {
        try {
            log.info("根据发票行ID删除发票申请历史记录，发票行ID: {}", invoiceLineId);
            boolean success = invoiceRequestHistoryService.deleteByInvoiceLineId(invoiceLineId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据发票行ID删除发票申请历史记录失败，发票行ID: {}", invoiceLineId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 更新发票申请历史记录
     * @param history 发票申请历史记录
     * @return 结果
     */
    @PutMapping
    public Result<InvoiceRequestHistory> update(@Valid @RequestBody InvoiceRequestHistory history) {
        try {
            log.info("更新发票申请历史记录，ID: {}", history.getId());
            InvoiceRequestHistory result = invoiceRequestHistoryService.update(history);
            return Result.success(result);
        } catch (Exception e) {
            log.error("更新发票申请历史记录失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID查询发票申请历史记录
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceRequestHistory> getById(@PathVariable Long id) {
        try {
            log.info("查询发票申请历史记录，ID: {}", id);
            InvoiceRequestHistory result = invoiceRequestHistoryService.getById(id);
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询发票申请历史记录失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID查询发票申请历史记录列表
     * @param invoiceId 发票ID
     * @return 结果
     */
    @GetMapping("/by-invoice/{invoiceId}")
    public Result<List<InvoiceRequestHistory>> getByInvoiceId(@PathVariable String invoiceId) {
        try {
            log.info("根据发票ID查询发票申请历史记录列表，发票ID: {}", invoiceId);
            List<InvoiceRequestHistory> result = invoiceRequestHistoryService.getByInvoiceId(invoiceId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票ID查询发票申请历史记录失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票行ID查询发票申请历史记录列表
     * @param invoiceLineId 发票行ID
     * @return 结果
     */
    @GetMapping("/by-line/{invoiceLineId}")
    public Result<List<InvoiceRequestHistory>> getByInvoiceLineId(@PathVariable String invoiceLineId) {
        try {
            log.info("根据发票行ID查询发票申请历史记录列表，发票行ID: {}", invoiceLineId);
            List<InvoiceRequestHistory> result = invoiceRequestHistoryService.getByInvoiceLineId(invoiceLineId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票行ID查询发票申请历史记录失败，发票行ID: {}", invoiceLineId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询所有发票申请历史记录
     * @return 结果
     */
    @GetMapping
    public Result<List<InvoiceRequestHistory>> getAll() {
        try {
            log.info("查询所有发票申请历史记录");
            List<InvoiceRequestHistory> result = invoiceRequestHistoryService.getAll();
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询所有发票申请历史记录失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 分页查询发票申请历史记录
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 结果
     */
    @GetMapping("/page")
    public Result<List<InvoiceRequestHistory>> getPage(@RequestParam(defaultValue = "1") int pageNum,
                                                       @RequestParam(defaultValue = "10") int pageSize) {
        try {
            log.info("分页查询发票申请历史记录，页码: {}, 页大小: {}", pageNum, pageSize);
            List<InvoiceRequestHistory> result = invoiceRequestHistoryService.getPage(pageNum, pageSize);
            return Result.success(result);
        } catch (Exception e) {
            log.error("分页查询发票申请历史记录失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
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
            log.info("统计发票申请历史记录总数");
            long count = invoiceRequestHistoryService.count();
            return Result.success(count);
        } catch (Exception e) {
            log.error("统计发票申请历史记录总数失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据条件查询发票申请历史记录
     * @param history 查询条件
     * @return 结果
     */
    @PostMapping("/search")
    public Result<List<InvoiceRequestHistory>> search(@RequestBody InvoiceRequestHistory history) {
        try {
            log.info("根据条件查询发票申请历史记录");
            List<InvoiceRequestHistory> result = invoiceRequestHistoryService.getByCondition(history);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据条件查询发票申请历史记录失败", e);
            return Result.error(e.getMessage());
        }
    }
}