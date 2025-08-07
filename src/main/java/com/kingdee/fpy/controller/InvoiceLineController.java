package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceLine;
import com.kingdee.fpy.service.InvoiceLineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 发票行控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/invoice-line")
@CrossOrigin(origins = "*")
public class InvoiceLineController {

    @Autowired
    private InvoiceLineService invoiceLineService;

    /**
     * 创建发票行
     * @param invoiceLine 发票行
     * @return 结果
     */
    @PostMapping
    public Result<InvoiceLine> create(@Valid @RequestBody InvoiceLine invoiceLine) {
        try {
            log.info("创建发票行: {}", invoiceLine.getItemName());
            InvoiceLine result = invoiceLineService.create(invoiceLine);
            return Result.success(result);
        } catch (Exception e) {
            log.error("创建发票行失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID删除发票行
     * @param id 主键ID
     * @return 结果
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Long id) {
        try {
            log.info("删除发票行，ID: {}", id);
            boolean success = invoiceLineService.deleteById(id);
            return Result.success(success);
        } catch (Exception e) {
            log.error("删除发票行失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 批量删除发票行
     * @param ids ID列表
     * @return 结果
     */
    @DeleteMapping("/batch")
    public Result<Boolean> deleteBatch(@RequestBody List<Long> ids) {
        try {
            log.info("批量删除发票行，IDs: {}", ids);
            boolean success = invoiceLineService.deleteBatch(ids);
            return Result.success(success);
        } catch (Exception e) {
            log.error("批量删除发票行失败，IDs: {}", ids, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据申请单ID删除发票行
     * @param invoiceRequestId 申请单ID
     * @return 结果
     */
    @DeleteMapping("/by-request/{invoiceRequestId}")
    public Result<Boolean> deleteByInvoiceRequestId(@PathVariable Long invoiceRequestId) {
        try {
            log.info("根据申请单ID删除发票行，申请单ID: {}", invoiceRequestId);
            boolean success = invoiceLineService.deleteByInvoiceRequestId(invoiceRequestId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据申请单ID删除发票行失败，申请单ID: {}", invoiceRequestId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 更新发票行
     * @param invoiceLine 发票行
     * @return 结果
     */
    @PutMapping
    public Result<InvoiceLine> update(@Valid @RequestBody InvoiceLine invoiceLine) {
        try {
            log.info("更新发票行，ID: {}", invoiceLine.getId());
            InvoiceLine result = invoiceLineService.update(invoiceLine);
            return Result.success(result);
        } catch (Exception e) {
            log.error("更新发票行失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID查询发票行
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceLine> getById(@PathVariable Long id) {
        try {
            log.info("查询发票行，ID: {}", id);
            InvoiceLine result = invoiceLineService.getById(id);
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询发票行失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据申请单ID查询发票行列表
     * @param invoiceRequestId 申请单ID
     * @return 结果
     */
    @GetMapping("/by-request/{invoiceRequestId}")
    public Result<List<InvoiceLine>> getByInvoiceRequestId(@PathVariable Long invoiceRequestId) {
        try {
            log.info("根据申请单ID查询发票行列表，申请单ID: {}", invoiceRequestId);
            List<InvoiceLine> result = invoiceLineService.getByInvoiceRequestId(invoiceRequestId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据申请单ID查询发票行失败，申请单ID: {}", invoiceRequestId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票ID查询发票行列表
     * @param invoiceId 发票ID
     * @return 结果
     */
    @GetMapping("/by-invoice/{invoiceId}")
    public Result<List<InvoiceLine>> getByInvoiceId(@PathVariable Long invoiceId) {
        try {
            log.info("根据发票ID查询发票行列表，发票ID: {}", invoiceId);
            List<InvoiceLine> result = invoiceLineService.getByInvoiceId(invoiceId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票ID查询发票行失败，发票ID: {}", invoiceId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询所有发票行
     * @return 结果
     */
    @GetMapping
    public Result<List<InvoiceLine>> getAll() {
        try {
            log.info("查询所有发票行");
            List<InvoiceLine> result = invoiceLineService.getAll();
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询所有发票行失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 分页查询发票行
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 结果
     */
    @GetMapping("/page")
    public Result<List<InvoiceLine>> getPage(@RequestParam(defaultValue = "1") int pageNum,
                                             @RequestParam(defaultValue = "10") int pageSize) {
        try {
            log.info("分页查询发票行，页码: {}, 页大小: {}", pageNum, pageSize);
            List<InvoiceLine> result = invoiceLineService.getPage(pageNum, pageSize);
            return Result.success(result);
        } catch (Exception e) {
            log.error("分页查询发票行失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
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
            log.info("统计发票行总数");
            long count = invoiceLineService.count();
            return Result.success(count);
        } catch (Exception e) {
            log.error("统计发票行总数失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据条件查询发票行
     * @param invoiceLine 查询条件
     * @return 结果
     */
    @PostMapping("/search")
    public Result<List<InvoiceLine>> search(@RequestBody InvoiceLine invoiceLine) {
        try {
            log.info("根据条件查询发票行");
            List<InvoiceLine> result = invoiceLineService.getByCondition(invoiceLine);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据条件查询发票行失败", e);
            return Result.error(e.getMessage());
        }
    }
}