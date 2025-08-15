package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.dto.CodeGenerationRequest;
import com.kingdee.fpy.dto.RuleMonthlyPublishStatisticsDto;
import com.kingdee.fpy.dto.RulePublishRequest;
import com.kingdee.fpy.dto.RuleStatusStatisticsDto;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.model.InvoiceRulesQuery;
import com.kingdee.fpy.service.imp.InvoiceRulesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * InvoiceRules控制器
 */
@RestController
@RequestMapping("/invoice-rules")
public class
InvoiceRulesController {

    @Autowired
    private InvoiceRulesServiceImpl invoiceRulesService;

    /**
     * 插入一条记录
     * @param invoiceRules InvoiceRules实体
     * @return Result结果
     */
    @PostMapping
    public Result<InvoiceRules> insert(@RequestBody InvoiceRules invoiceRules) {
        int result = invoiceRulesService.insert(invoiceRules);
        return new Result<>(invoiceRules);
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
    
    /**
     * 生成编码字符串
     * @param request 编码生成请求
     * @return Result结果
     */
    @PostMapping("/generate-code")
    public Result<String> generateCode(@RequestBody CodeGenerationRequest request) {
        try {
            String code = invoiceRulesService.generateCode(request);
            return new Result<>(code);
        } catch (IllegalArgumentException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            return Result.error("生成编码失败：" + e.getMessage());
        }
    }

    /**
     * 批量发布规则
     * @param request 发布请求，包含规则编码列表和版本号
     * @return Result结果
     */
    @PostMapping("/publish")
    public Result<String> publishRules(@RequestBody RulePublishRequest request) {
        try {
            String result = invoiceRulesService.publishRules(request.getRuleCodes(), request.getVersion());
            return Result.success(result);
        } catch (Exception e) {
            return Result.error("发布规则失败：" + e.getMessage());
        }
    }

    /**
     * 根据企业ID查询订阅的规则
     * @param invoiceRules 查询条件，包含企业ID等信息
     * @return Result结果
     */
    @PostMapping("/subscribed-rules")
    public Result<List<InvoiceRules>> getSubscribedRules(@RequestBody InvoiceRules invoiceRules) {
        try {
            List<InvoiceRules> result = invoiceRulesService.selectSubscribedRulesByCompanyId(invoiceRules);
            return new Result<>(result);
        } catch (Exception e) {
            return Result.error("查询订阅规则失败：" + e.getMessage());
        }
    }

    /**
     * 查询规则状态统计
     * @return Result结果
     */
    @GetMapping("/status-statistics")
    public Result<List<RuleStatusStatisticsDto>> getRuleStatusStatistics() {
        try {
            List<RuleStatusStatisticsDto> result = invoiceRulesService.getRuleStatusStatistics();
            return new Result<>(result);
        } catch (Exception e) {
            return Result.error("查询规则状态统计失败：" + e.getMessage());
        }
    }

    /**
     * 查询规则月度发布统计
     * @return Result结果
     */
    @GetMapping("/monthly-publish-statistics")
    public Result<List<RuleMonthlyPublishStatisticsDto>> getRuleMonthlyPublishStatistics() {
        try {
            List<RuleMonthlyPublishStatisticsDto> result = invoiceRulesService.getRuleMonthlyPublishStatistics();
            return new Result<>(result);
        } catch (Exception e) {
            return Result.error("查询规则月度发布统计失败：" + e.getMessage());
        }
    }

    /**
     * 分页查询规则列表
     * @param query 查询条件
     * @return ResultPage结果
     */
    @PostMapping("/page")
    public ResultPage queryRulesByPage(@RequestBody InvoiceRulesQuery query) {
        try {
            return invoiceRulesService.queryRulesByPage(query);
        } catch (Exception e) {
            return new ResultPage("500", "查询规则列表失败：" + e.getMessage());
        }
    }
}