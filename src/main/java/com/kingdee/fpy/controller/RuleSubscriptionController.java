package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.RuleSubscription;
import com.kingdee.fpy.service.imp.RuleSubscriptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RuleSubscription控制器
 */
@RestController
@RequestMapping("/rule-subscription")
public class RuleSubscriptionController {

    @Autowired
    private RuleSubscriptionServiceImpl ruleSubscriptionService;

    /**
     * 插入一条记录
     * @param ruleSubscription RuleSubscription实体
     * @return Result结果
     */
    @PostMapping
    public Result<Integer> insert(@RequestBody RuleSubscription ruleSubscription) {
        int result = ruleSubscriptionService.insert(ruleSubscription);
        return new Result<>(result);
    }

    /**
     * 根据ID更新记录
     * @param ruleSubscription RuleSubscription实体
     * @return Result结果
     */
    @PutMapping
    public Result<Integer> updateById(@RequestBody RuleSubscription ruleSubscription) {
        int result = ruleSubscriptionService.updateById(ruleSubscription);
        return new Result<>(result);
    }

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return Result结果
     */
    @DeleteMapping("/{id}")
    public Result<Integer> deleteById(@PathVariable Long id) {
        int result = ruleSubscriptionService.deleteById(id);
        return new Result<>(result);
    }

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return Result结果
     */
    @GetMapping("/{id}")
    public Result<RuleSubscription> selectById(@PathVariable Long id) {
        RuleSubscription result = ruleSubscriptionService.selectById(id);
        return new Result<>(result);
    }

    /**
     * 查询所有记录
     * @return Result结果
     */
    @GetMapping
    public Result<List<RuleSubscription>> selectAll() {
        List<RuleSubscription> result = ruleSubscriptionService.selectAll();
        return new Result<>(result);
    }
    
    /**
     * 根据租户ID或企业ID查询订阅规则
     * @param tenantId 租户ID
     * @param companyId 企业ID（可选）
     * @return 订阅规则列表
     */
    @GetMapping("/by-tenant-or-company")
    public Result<List<RuleSubscription>> selectByTenantIdOrCompanyId(
            @RequestParam String tenantId,
            @RequestParam(required = false) String companyId) {
        List<RuleSubscription> result = ruleSubscriptionService.selectByTenantIdOrCompanyId(tenantId, companyId);
        return new Result<>(result);
    }
}