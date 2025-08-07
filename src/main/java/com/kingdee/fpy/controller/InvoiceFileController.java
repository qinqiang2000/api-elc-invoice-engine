package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceFile;
import com.kingdee.fpy.service.InvoiceFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 发票文件控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/invoice-file")
@CrossOrigin(origins = "*")
public class InvoiceFileController {

    @Autowired
    private InvoiceFileService invoiceFileService;

    /**
     * 创建发票文件
     * @param invoiceFile 发票文件
     * @return 结果
     */
    @PostMapping
    public Result<InvoiceFile> create(@Valid @RequestBody InvoiceFile invoiceFile) {
        try {
            log.info("创建发票文件: {}", invoiceFile.getFileId());
            InvoiceFile result = invoiceFileService.create(invoiceFile);
            return Result.success(result);
        } catch (Exception e) {
            log.error("创建发票文件失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID删除发票文件
     * @param id 主键ID
     * @return 结果
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Long id) {
        try {
            log.info("删除发票文件，ID: {}", id);
            boolean success = invoiceFileService.deleteById(id);
            return Result.success(success);
        } catch (Exception e) {
            log.error("删除发票文件失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 批量删除发票文件
     * @param ids ID列表
     * @return 结果
     */
    @DeleteMapping("/batch")
    public Result<Boolean> deleteBatch(@RequestBody List<Long> ids) {
        try {
            log.info("批量删除发票文件，IDs: {}", ids);
            boolean success = invoiceFileService.deleteBatch(ids);
            return Result.success(success);
        } catch (Exception e) {
            log.error("批量删除发票文件失败，IDs: {}", ids, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据租户ID删除发票文件
     * @param tenantId 租户ID
     * @return 结果
     */
    @DeleteMapping("/by-tenant/{tenantId}")
    public Result<Boolean> deleteByTenantId(@PathVariable String tenantId) {
        try {
            log.info("根据租户ID删除发票文件，租户ID: {}", tenantId);
            boolean success = invoiceFileService.deleteByTenantId(tenantId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据租户ID删除发票文件失败，租户ID: {}", tenantId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据关联ID删除发票文件
     * @param relationId 关联ID
     * @return 结果
     */
    @DeleteMapping("/by-relation/{relationId}")
    public Result<Boolean> deleteByRelationId(@PathVariable String relationId) {
        try {
            log.info("根据关联ID删除发票文件，关联ID: {}", relationId);
            boolean success = invoiceFileService.deleteByRelationId(relationId);
            return Result.success(success);
        } catch (Exception e) {
            log.error("根据关联ID删除发票文件失败，关联ID: {}", relationId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 更新发票文件
     * @param invoiceFile 发票文件
     * @return 结果
     */
    @PutMapping
    public Result<InvoiceFile> update(@Valid @RequestBody InvoiceFile invoiceFile) {
        try {
            log.info("更新发票文件，ID: {}", invoiceFile.getId());
            InvoiceFile result = invoiceFileService.update(invoiceFile);
            return Result.success(result);
        } catch (Exception e) {
            log.error("更新发票文件失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据ID查询发票文件
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceFile> getById(@PathVariable Long id) {
        try {
            log.info("查询发票文件，ID: {}", id);
            InvoiceFile result = invoiceFileService.getById(id);
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询发票文件失败，ID: {}", id, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据租户ID查询发票文件列表
     * @param tenantId 租户ID
     * @return 结果
     */
    @GetMapping("/by-tenant/{tenantId}")
    public Result<List<InvoiceFile>> getByTenantId(@PathVariable String tenantId) {
        try {
            log.info("根据租户ID查询发票文件列表，租户ID: {}", tenantId);
            List<InvoiceFile> result = invoiceFileService.getByTenantId(tenantId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据租户ID查询发票文件失败，租户ID: {}", tenantId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据关联ID查询发票文件列表
     * @param relationId 关联ID
     * @return 结果
     */
    @GetMapping("/by-relation/{relationId}")
    public Result<List<InvoiceFile>> getByRelationId(@PathVariable String relationId) {
        try {
            log.info("根据关联ID查询发票文件列表，关联ID: {}", relationId);
            List<InvoiceFile> result = invoiceFileService.getByRelationId(relationId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据关联ID查询发票文件失败，关联ID: {}", relationId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据文件ID查询发票文件
     * @param fileId 文件ID
     * @return 结果
     */
    @GetMapping("/by-file/{fileId}")
    public Result<InvoiceFile> getByFileId(@PathVariable String fileId) {
        try {
            log.info("根据文件ID查询发票文件，文件ID: {}", fileId);
            InvoiceFile result = invoiceFileService.getByFileId(fileId);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据文件ID查询发票文件失败，文件ID: {}", fileId, e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询所有发票文件
     * @return 结果
     */
    @GetMapping
    public Result<List<InvoiceFile>> getAll() {
        try {
            log.info("查询所有发票文件");
            List<InvoiceFile> result = invoiceFileService.getAll();
            return Result.success(result);
        } catch (Exception e) {
            log.error("查询所有发票文件失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 分页查询发票文件
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 结果
     */
    @GetMapping("/page")
    public Result<List<InvoiceFile>> getPage(@RequestParam(defaultValue = "1") int pageNum,
                                             @RequestParam(defaultValue = "10") int pageSize) {
        try {
            log.info("分页查询发票文件，页码: {}, 页大小: {}", pageNum, pageSize);
            List<InvoiceFile> result = invoiceFileService.getPage(pageNum, pageSize);
            return Result.success(result);
        } catch (Exception e) {
            log.error("分页查询发票文件失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
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
            log.info("统计发票文件总数");
            long count = invoiceFileService.count();
            return Result.success(count);
        } catch (Exception e) {
            log.error("统计发票文件总数失败", e);
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据条件查询发票文件
     * @param invoiceFile 查询条件
     * @return 结果
     */
    @PostMapping("/search")
    public Result<List<InvoiceFile>> search(@RequestBody InvoiceFile invoiceFile) {
        try {
            log.info("根据条件查询发票文件");
            List<InvoiceFile> result = invoiceFileService.getByCondition(invoiceFile);
            return Result.success(result);
        } catch (Exception e) {
            log.error("根据条件查询发票文件失败", e);
            return Result.error(e.getMessage());
        }
    }
}