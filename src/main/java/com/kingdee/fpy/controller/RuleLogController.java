package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.dto.RuleLogDetailDto;
import com.kingdee.fpy.dto.RuleLogGroupedResponseDto;
import com.kingdee.fpy.model.RuleLog;
import com.kingdee.fpy.service.imp.InvoiceRulesServiceImpl;
import com.kingdee.fpy.service.imp.RuleLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * RuleLog控制器
 */
@RestController
@RequestMapping("/rule-log")
public class RuleLogController {

    @Autowired
    private RuleLogServiceImpl ruleLogService;

    @Autowired
    private InvoiceRulesServiceImpl invoiceRulesService;

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

    /**
     * 根据请求ID和单据编码查询规则日志详情
     * @param requestId 请求ID
     * @param billNo 单据编码
     * @return Result结果
     */
    @GetMapping("/details")
    public Result<RuleLogGroupedResponseDto> getRuleLogsWithDetails(
            @RequestParam(required = true) String requestId,
            @RequestParam(required = false) String billNo) {
        try {
            // 参数校验：至少需要提供一个参数
            if ((requestId == null || requestId.trim().isEmpty()) && 
                (billNo == null || billNo.trim().isEmpty())) {
                return Result.error("请求ID和单据编码至少需要提供一个");
            }
            
            // 查询规则日志详情
            List<RuleLogDetailDto> ruleLogDetails = invoiceRulesService.getRuleLogsWithDetailsByRequestIdAndBillNo(requestId, billNo);
            ruleLogDetails =
                    ruleLogDetails.stream().filter(log -> null != log.getRuleType()).collect(Collectors.toList());
            // 按规则类型分组
            Map<Integer, List<RuleLogDetailDto>> groupedByRuleType = ruleLogDetails.stream()
                .collect(Collectors.groupingBy(
                    log -> log.getRuleType(),
                    LinkedHashMap::new,
                    Collectors.toList()
                ));
            
            // 创建统计信息
            RuleLogGroupedResponseDto.Statistics statistics = new RuleLogGroupedResponseDto.Statistics();
            statistics.setTotalCount(ruleLogDetails.size());
            
            // 统计各规则类型数量
            statistics.setValidationRuleCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 1)
                .count());
            statistics.setCompletionRuleCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 2)
                .count());
            
            // 统计校验规则的成功失败数量
            statistics.setValidationSuccessCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 1 
                    && log.getExecutionResult() != null && log.getExecutionResult() == 1)
                .count());
            statistics.setValidationFailureCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 1 
                    && log.getExecutionResult() != null && log.getExecutionResult() == 2)
                .count());
            
            // 统计补全规则的成功失败数量
            statistics.setCompletionSuccessCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 2 
                    && log.getExecutionResult() != null && log.getExecutionResult() == 1)
                .count());
            statistics.setCompletionFailureCount((int) ruleLogDetails.stream()
                .filter(log -> log.getRuleType() != null && log.getRuleType() == 2 
                    && log.getExecutionResult() != null && log.getExecutionResult() == 2)
                .count());
            
            // 统计总的成功失败数量
            statistics.setTotalSuccessCount((int) ruleLogDetails.stream()
                .filter(log -> log.getExecutionResult() != null && log.getExecutionResult() == 1)
                .count());
            statistics.setTotalFailureCount((int) ruleLogDetails.stream()
                .filter(log -> log.getExecutionResult() != null && log.getExecutionResult() == 2)
                .count());
            
            // 构建响应对象
            RuleLogGroupedResponseDto response = new RuleLogGroupedResponseDto();
            response.setGroupedByRuleType(groupedByRuleType);
            response.setStatistics(statistics);
            
            return new Result<>(response);
        } catch (Exception e) {
            return Result.error("查询规则日志详情失败：" + e.getMessage());
        }
    }
    
    /**
     * 获取规则类型名称
     * @param ruleType 规则类型编码
     * @return 规则类型名称
     */
    private String getRuleTypeName(Integer ruleType) {
        if (ruleType == null) {
            return "未知类型";
        }
        switch (ruleType) {
            case 1:
                return "校验规则";
            case 2:
                return "补全规则";
            default:
                return "其他类型(" + ruleType + ")";
        }
    }
}