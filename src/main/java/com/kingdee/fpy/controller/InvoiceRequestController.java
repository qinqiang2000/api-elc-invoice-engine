package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.service.InvoiceRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 发票申请控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/invoice-request")
@CrossOrigin(origins = "*")
public class InvoiceRequestController {

    @Autowired
    private InvoiceRequestService invoiceRequestService;

    /**
     * 创建发票申请
     * @param invoiceRequest 发票申请
     * @return 结果
     */
    @PostMapping
    public Result<InvoiceRequest> create(@Valid @RequestBody InvoiceRequest invoiceRequest) {
        try {
            log.info("创建发票申请: {}", invoiceRequest.getInvoiceNo());
            InvoiceRequest result = invoiceRequestService.create(invoiceRequest);
            return Result.success(result);
        } catch (Exception e) {
            log.error("创建发票申请失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID删除发票申请
     * @param id 主键ID
     * @return 结果
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Long id) {
        try {
            log.info("删除发票申请，ID: {}", id);
            boolean success = invoiceRequestService.deleteById(id);
            return Result.success(success);
        } catch (Exception e) {
            log.error("删除发票申请失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 批量删除发票申请
     * @param ids ID列表
     * @return 结果
     */
    @DeleteMapping("/batch")
    public Result<Boolean> deleteBatch(@RequestBody List<Long> ids) {
        try {
            log.info("批量删除发票申请，IDs: {}", ids);
            boolean success = invoiceRequestService.deleteBatch(ids);
            return Result.success(success);
        } catch (Exception e) {
            log.error("批量删除发票申请失败，IDs: {}", ids, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 更新发票申请
     * @param invoiceRequest 发票申请
     * @return 结果
     */
    @PutMapping
    public Result<InvoiceRequest> update(@Valid @RequestBody InvoiceRequest invoiceRequest) {
        try {
            log.info("更新发票申请，ID: {}", invoiceRequest.getId());
            InvoiceRequest result = invoiceRequestService.update(invoiceRequest);
            return Result.success(result);
        } catch (Exception e) {
            log.error("更新发票申请失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID查询发票申请
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceRequest> getById(@PathVariable Long id) {
        try {
            log.info("查询发票申请，ID: {}", id);
            InvoiceRequest result = invoiceRequestService.getById(id);
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询发票申请失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据发票号查询发票申请
     * @param invoiceNo 发票号
     * @return 结果
     */
    @GetMapping("/by-invoice-no/{invoiceNo}")
    public Result<InvoiceRequest> getByInvoiceNo(@PathVariable String invoiceNo) {
        try {
            log.info("根据发票号查询发票申请，发票号: {}", invoiceNo);
            InvoiceRequest result = invoiceRequestService.getByInvoiceNo(invoiceNo);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据发票号查询发票申请失败，发票号: {}", invoiceNo, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据租户ID查询发票申请列表
     * @param tenantId 租户ID
     * @return 结果
     */
    @GetMapping("/by-tenant/{tenantId}")
    public Result<List<InvoiceRequest>> getByTenantId(@PathVariable String tenantId) {
        try {
            log.info("根据租户ID查询发票申请列表，租户ID: {}", tenantId);
            List<InvoiceRequest> result = invoiceRequestService.getByTenantId(tenantId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据租户ID查询发票申请失败，租户ID: {}", tenantId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询所有发票申请
     * @return 结果
     */
    @GetMapping
    public Result<List<InvoiceRequest>> getAll() {
        try {
            log.info("查询所有发票申请");
            List<InvoiceRequest> result = invoiceRequestService.getAll();
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询所有发票申请失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 分页查询发票申请
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 结果
     */
    @GetMapping("/page")
    public Result<List<InvoiceRequest>> getPage(@RequestParam(defaultValue = "1") int pageNum,
                                                @RequestParam(defaultValue = "10") int pageSize) {
        try {
            log.info("分页查询发票申请，页码: {}, 页大小: {}", pageNum, pageSize);
            List<InvoiceRequest> result = invoiceRequestService.getPage(pageNum, pageSize);
            return Result.success(result);
        } catch (Exception e) {
            log.error("分页查询发票申请失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
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
            log.info("统计发票申请总数");
            long count = invoiceRequestService.count();
            return Result.success(count);
        } catch (Exception e) {
            log.error("统计发票申请总数失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据条件查询发票申请
     * @param invoiceRequest 查询条件
     * @return 结果
     */
    @PostMapping("/search")
    public Result<List<InvoiceRequest>> search(@RequestBody InvoiceRequest invoiceRequest) {
        try {
            log.info("根据条件查询发票申请");
            List<InvoiceRequest> result = invoiceRequestService.getByCondition(invoiceRequest);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据条件查询发票申请失败", e);
            return Result.error(e.getMessage());
        }
    }
}