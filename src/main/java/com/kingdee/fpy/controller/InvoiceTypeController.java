package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.commom.ResultType;
import com.kingdee.fpy.model.InvoiceType;
import com.kingdee.fpy.service.InvoiceTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * InvoiceType控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/invoice-type")
public class InvoiceTypeController {

    @Autowired
    private InvoiceTypeService invoiceTypeService;

    /**
     * 插入一条记录
     * @param invoiceType InvoiceType实体
     * @return Result结果
     */
    @PostMapping
    public Result<InvoiceType> insert(@RequestBody InvoiceType invoiceType) {
        try {
            int result = invoiceTypeService.insert(invoiceType);
            if (result > 0) {
                return new Result<>(invoiceType);
            } else {
                return new Result<>(ResultType.SERVER_FAIL, "插入失败");
            }
        } catch (Exception e) {
            log.error("插入发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "插入失败：" + e.getMessage());
        }
    }

    /**
     * 根据ID更新记录
     * @param invoiceType InvoiceType实体
     * @return Result结果
     */
    @PutMapping
    public Result<Integer> updateById(@RequestBody InvoiceType invoiceType) {
        try {
            int result = invoiceTypeService.updateById(invoiceType);
            return new Result<>(result);
        } catch (Exception e) {
            log.error("更新发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "更新失败：" + e.getMessage());
        }
    }

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return Result结果
     */
    @DeleteMapping("/{id}")
    public Result<Integer> deleteById(@PathVariable Long id) {
        try {
            int result = invoiceTypeService.deleteById(id);
            return new Result<>(result);
        } catch (Exception e) {
            log.error("删除发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "删除失败：" + e.getMessage());
        }
    }

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return Result结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceType> selectById(@PathVariable Long id) {
        try {
            InvoiceType invoiceType = invoiceTypeService.selectById(id);
            return new Result<>(invoiceType);
        } catch (Exception e) {
            log.error("查询发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "查询失败：" + e.getMessage());
        }
    }

    /**
     * 查询所有记录
     * @return Result结果
     */
    @GetMapping
    public Result<List<InvoiceType>> selectAll() {
        try {
            List<InvoiceType> invoiceTypes = invoiceTypeService.selectAll();
            return new Result<>(invoiceTypes);
        } catch (Exception e) {
            log.error("查询所有发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "查询失败：" + e.getMessage());
        }
    }

    /**
     * 根据发票代码查询记录
     * @param invoiceCode 发票代码
     * @return Result结果
     */
    @GetMapping("/code/{invoiceCode}")
    public Result<InvoiceType> selectByInvoiceCode(@PathVariable String invoiceCode) {
        try {
            InvoiceType invoiceType = invoiceTypeService.selectByInvoiceCode(invoiceCode);
            return new Result<>(invoiceType);
        } catch (Exception e) {
            log.error("根据发票代码查询失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "查询失败：" + e.getMessage());
        }
    }

    /**
     * 根据国家和贸易区查询记录
     * @param country 国家二字码
     * @param tradeArea 贸易区
     * @return Result结果
     */
    @GetMapping("/search")
    public Result<List<InvoiceType>> selectByCountryAndTradeArea(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String tradeArea) {
        try {
            List<InvoiceType> invoiceTypes = invoiceTypeService.selectByCountryAndTradeArea(country, tradeArea);
            return new Result<>(invoiceTypes);
        } catch (Exception e) {
            log.error("根据条件查询发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "查询失败：" + e.getMessage());
        }
    }

    /**
     * 从Excel文件导入发票类型数据
     * @param file Excel文件
     * @return Result结果
     */
    @PostMapping("/import-excel")
    public Result<String> importFromExcel(@RequestParam("file") MultipartFile file) {
        try {
            if (file == null || file.isEmpty()) {
                return new Result<>(ResultType.PARAM_FAIL, "请选择要导入的Excel文件");
            }

            String originalFilename = file.getOriginalFilename();
            if (originalFilename == null || (!originalFilename.endsWith(".xlsx") && !originalFilename.endsWith(".xls"))) {
                return new Result<>(ResultType.PARAM_FAIL, "请上传Excel格式文件（.xlsx或.xls）");
            }

            String result = invoiceTypeService.importFromExcel(file);
            log.info("Excel导入结果：{}", result);
            return new Result<>(result);
            
        } catch (Exception e) {
            log.error("Excel导入失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "导入失败：" + e.getMessage());
        }
    }

    /**
     * 批量插入发票类型数据
     * @param invoiceTypes InvoiceType实体列表
     * @return Result结果
     */
    @PostMapping("/batch")
    public Result<Integer> batchInsert(@RequestBody List<InvoiceType> invoiceTypes) {
        try {
            int result = invoiceTypeService.batchInsert(invoiceTypes);
            return new Result<>(result);
        } catch (Exception e) {
            log.error("批量插入发票类型失败：{}", e.getMessage(), e);
            return new Result<>(ResultType.SERVER_FAIL, "批量插入失败：" + e.getMessage());
        }
    }
}