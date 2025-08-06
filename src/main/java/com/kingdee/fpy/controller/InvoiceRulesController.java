package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.service.imp.InvoiceRulesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * InvoiceRules控制器
 */
@RestController
@RequestMapping("/invoice-rules")
public class InvoiceRulesController {

    @Autowired
    private InvoiceRulesServiceImpl invoiceRulesService;

    /**
     * 插入一条记录
     * @param invoiceRules InvoiceRules实体
     * @return Result结果
     */
    @PostMapping
    public Result<Integer> insert(@RequestBody InvoiceRules invoiceRules) {
        int result = invoiceRulesService.insert(invoiceRules);
        return new Result<>(result);
    }

    /**
     * 根据ID更新记录
     * @param invoiceRules InvoiceRules实体
     * @return Result结果
     */
    @PutMapping
    public Result<Integer> updateById(@RequestBody InvoiceRules invoiceRules) {
        int result = invoiceRulesService.updateById(invoiceRules);
        return new Result<>(result);
    }

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return Result结果
     */
    @DeleteMapping("/{id}")
    public Result<Integer> deleteById(@PathVariable Long id) {
        int result = invoiceRulesService.deleteById(id);
        return new Result<>(result);
    }

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return Result结果
     */
    @GetMapping("/{id}")
    public Result<InvoiceRules> selectById(@PathVariable Long id) {
        InvoiceRules result = invoiceRulesService.selectById(id);
        return new Result<>(result);
    }

    /**
     * 查询所有记录
     * @return Result结果
     */
    @GetMapping
    public Result<List<InvoiceRules>> selectAll() {
        List<InvoiceRules> result = invoiceRulesService.selectAll();
        return new Result<>(result);
    }
}