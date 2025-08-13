package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.dto.CodeGenerationRequest;
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
    
    /**
     * 生成编码字符串
     * @param request 编码生成请求
     * @return Result结果
     */
    @PostMapping("/generate-code")
    public Result<String> generateCode(@RequestBody CodeGenerationRequest request) {
        try {
            String code = invoiceRulesService.generateCode(request.getCountry(), request.getInvoiceType(),
                    request.getCompanyId());
            return new Result<>(code);
        } catch (IllegalArgumentException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            return Result.error("生成编码失败：" + e.getMessage());
        }
    }

    /**
     * 发布规则
     * @param ruleCode 规则编码
     * @return Result结果
     */
    @PostMapping("/publish/{ruleCode}")
    public Result<String> publishRule(@PathVariable String ruleCode) {
        try {
            // 检查规则是否存在
            List<InvoiceRules> rules = invoiceRulesService.selectByCompanyIdAndRuleCode("", ruleCode);
            if (rules.isEmpty()) {
                return Result.error("规则不存在");
            }
            
            InvoiceRules rule = rules.get(0);
            
            // 检查规则状态是否为测试通过
            if (rule.getStatus() == null || rule.getStatus() != 2) {
                return Result.error("只有测试通过的规则才能发布");
            }
            
            // 更新状态为已发布
            int result = invoiceRulesService.updateStatus(ruleCode, 3);
            if (result > 0) {
                return Result.success("规则发布成功");
            } else {
                return Result.error("规则发布失败");
            }
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
}