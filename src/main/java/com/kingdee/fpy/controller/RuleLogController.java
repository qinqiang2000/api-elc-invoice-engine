package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.RuleLog;
import com.kingdee.fpy.service.imp.RuleLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RuleLog控制器
 */
@RestController
@RequestMapping("/rule-log")
public class RuleLogController {

    @Autowired
    private RuleLogServiceImpl ruleLogService;

    /**
     * 插入一条记录
     * @param ruleLog RuleLog实体
     * @return Result结果
     */
    @PostMapping
    public Result<Integer> insert(@RequestBody RuleLog ruleLog) {
        int result = ruleLogService.insert(ruleLog);
        return new Result<>(result);
    }

    /**
     * 根据ID更新记录
     * @param ruleLog RuleLog实体
     * @return Result结果
     */
    @PutMapping
    public Result<Integer> updateById(@RequestBody RuleLog ruleLog) {
        int result = ruleLogService.updateById(ruleLog);
        return new Result<>(result);
    }

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return Result结果
     */
    @DeleteMapping("/{id}")
    public Result<Integer> deleteById(@PathVariable Long id) {
        int result = ruleLogService.deleteById(id);
        return new Result<>(result);
    }

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return Result结果
     */
    @GetMapping("/{id}")
    public Result<RuleLog> selectById(@PathVariable Long id) {
        RuleLog result = ruleLogService.selectById(id);
        return new Result<>(result);
    }

    /**
     * 查询所有记录
     * @return Result结果
     */
    @GetMapping
    public Result<List<RuleLog>> selectAll() {
        List<RuleLog> result = ruleLogService.selectAll();
        return new Result<>(result);
    }
}