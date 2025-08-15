package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.dto.CodeGenerationRequest;
import com.kingdee.fpy.dto.RuleLogDetailDto;
import com.kingdee.fpy.dto.RuleMonthlyPublishDataDto;
import com.kingdee.fpy.dto.RuleMonthlyPublishItemDto;
import com.kingdee.fpy.dto.RuleMonthlyPublishStatisticsDto;
import com.kingdee.fpy.dto.RuleStatusStatisticsDto;
import com.kingdee.fpy.enums.RuleStatus;
import com.kingdee.fpy.mapper.InvoiceRulesMapper;
import com.kingdee.fpy.mapper.RuleLogMapper;
import com.kingdee.fpy.model.InvoiceRules;
import com.kingdee.fpy.model.InvoiceRulesQuery;
import com.kingdee.fpy.service.InvoiceRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * InvoiceRules服务实现类
 */
@Service
public class InvoiceRulesServiceImpl implements InvoiceRulesService {

    @Autowired
    private InvoiceRulesMapper invoiceRulesMapper;

    @Autowired
    private RuleLogMapper ruleLogMapper;

    @Override
    public int insert(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.insert(invoiceRules);
    }

    @Override
    public int updateById(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.updateById(invoiceRules);
    }

    @Override
    public int deleteById(Long id) {
        return invoiceRulesMapper.deleteById(id);
    }

    @Override
    public InvoiceRules selectById(Long id) {
        return invoiceRulesMapper.selectById(id);
    }

    @Override
    public List<InvoiceRules> selectAll() {
        return invoiceRulesMapper.selectAll();
    }

    @Override
    public List<InvoiceRules> selectByTenantIdOrCompanyId(String tenantId, String companyId, String country) {
       // String country = "CN";
        return invoiceRulesMapper.selectByTenantIdOrCompanyId(tenantId, companyId,country);
    }

    @Override
    public List<InvoiceRules> selectByCompanyIdAndRuleCode(String companyId, String ruleCode) {
        return invoiceRulesMapper.selectByCompanyIdAndRuleCode(companyId, ruleCode);
    }
    
    @Override
    public synchronized String generateCode(CodeGenerationRequest request) {
        // 参数校验
        if (request.getCountry() == null || request.getCountry().isEmpty()) {
            throw new IllegalArgumentException("国家参数不能为空");
        }
        if (request.getInvoiceType() == null || request.getInvoiceType().isEmpty()) {
            request.setInvoiceType("common");
        }
        if (request.getSubInvoiceType() == null || request.getSubInvoiceType().isEmpty()) {
            request.setSubInvoiceType("common");
        }
        
        // 查询当前最大序号
        Integer maxSequence = invoiceRulesMapper.selectMaxSequenceByCountryAndType(request);
        
        // 计算下一个序号
        int nextSequence = (maxSequence == null ? 0 : maxSequence) + 1;
        
        // 格式化为4位数字
        String sequenceStr = String.format("%04d", nextSequence);
        
        // 生成编码字符串
        return "custom-" + request.getCountry() + "-" + request.getInvoiceType() + "-"+request.getSubInvoiceType() + "-" + sequenceStr;
    }

    @Override
    public int updateStatus(String ruleCode, Integer status) {
        return invoiceRulesMapper.updateStatus(ruleCode, status);
    }
    
    @Override
    public int enableRule(String ruleCode) {
        return invoiceRulesMapper.updateStatus(ruleCode, RuleStatus.ENABLED.getCode());
    }
    
    @Override
    public int disableRule(String ruleCode) {
        return invoiceRulesMapper.updateStatus(ruleCode, RuleStatus.DISABLED.getCode());
    }

    @Override
    public List<InvoiceRules> selectSubscribedRulesByCompanyId(InvoiceRules invoiceRules) {
        return invoiceRulesMapper.selectSubscribedRulesByCompanyId(invoiceRules);
    }

    @Override
    public String publishRules(List<String> ruleCodes, String version) {
        if (ruleCodes == null || ruleCodes.isEmpty()) {
            throw new IllegalArgumentException("规则编码列表不能为空");
        }
        
        if (version == null || version.trim().isEmpty()) {
            throw new IllegalArgumentException("版本号不能为空");
        }
        
        List<String> notFoundRules = new ArrayList<>();
        List<String> invalidStatusRules = new ArrayList<>();
        
        // 1. 检查规则是否存在并验证状态
        for (String ruleCode : ruleCodes) {
            List<InvoiceRules> rules = invoiceRulesMapper.selectByCompanyIdAndRuleCode("", ruleCode);
            if (rules.isEmpty()) {
                notFoundRules.add(ruleCode);
            } else {
                InvoiceRules rule = rules.get(0);
                // 检查规则状态是否为测试通过 (status = 2)
                if (rule.getStatus() == null || rule.getStatus() != 2) {
                    invalidStatusRules.add(ruleCode);
                }
            }
        }
        
        // 如果有不存在的规则，返回错误
        if (!notFoundRules.isEmpty()) {
            throw new IllegalArgumentException("以下规则不存在：" + String.join(", ", notFoundRules));
        }
        
        // 如果有状态不正确的规则，返回错误
        if (!invalidStatusRules.isEmpty()) {
            throw new IllegalArgumentException("以下规则状态不是测试通过，无法发布：" + String.join(", ", invalidStatusRules));
        }
        
        // 2. 批量更新规则状态、版本和发布时间
        Date publishTime = new Date();
        int updateCount = 0;
        for (String ruleCode : ruleCodes) {
            int result = invoiceRulesMapper.updateStatusVersionAndPublishTime(ruleCode, 3, version, publishTime);
            updateCount += result;
        }
        
        if (updateCount == ruleCodes.size()) {
            return String.format("成功发布 %d 个规则，版本：%s", updateCount, version);
        } else {
            throw new RuntimeException(String.format("批量发布失败，期望更新 %d 个规则，实际更新 %d 个", ruleCodes.size(), updateCount));
        }
    }

    @Override
    public List<RuleLogDetailDto> getRuleLogsWithDetailsByRequestIdAndBillNo(String requestId, String billNo) {
        return ruleLogMapper.selectRuleLogsWithDetailsByRequestIdAndBillNo(requestId, billNo);
    }

    @Override
    public List<RuleStatusStatisticsDto> getRuleStatusStatistics() {
        return invoiceRulesMapper.selectRuleStatusStatistics();
    }

    @Override
    public List<RuleMonthlyPublishStatisticsDto> getRuleMonthlyPublishStatistics() {
        // 获取原始数据
        List<RuleMonthlyPublishDataDto> rawData = invoiceRulesMapper.selectRuleMonthlyPublishData();
        
        // 按规则类型分组
        Map<Integer, List<RuleMonthlyPublishDataDto>> groupedByRuleType = rawData.stream()
                .collect(Collectors.groupingBy(RuleMonthlyPublishDataDto::getRuleType));
        
        // 转换为最终结果
        List<RuleMonthlyPublishStatisticsDto> result = new ArrayList<>();
        
        for (Map.Entry<Integer, List<RuleMonthlyPublishDataDto>> entry : groupedByRuleType.entrySet()) {
            Integer ruleType = entry.getKey();
            List<RuleMonthlyPublishDataDto> monthlyDataList = entry.getValue();
            
            // 转换为 RuleMonthlyPublishItemDto 列表
            List<RuleMonthlyPublishItemDto> monthlyItems = monthlyDataList.stream()
                    .map(data -> new RuleMonthlyPublishItemDto(data.getPublishMonth(), data.getCount()))
                    .collect(Collectors.toList());
            
            // 确定规则类型名称
            String ruleTypeName = getRuleTypeName(ruleType);
            
            // 创建统计结果
            RuleMonthlyPublishStatisticsDto statisticsDto = new RuleMonthlyPublishStatisticsDto(
                    ruleType, ruleTypeName, monthlyItems);
            
            result.add(statisticsDto);
        }
        
        // 按规则类型排序
        result.sort((a, b) -> a.getRuleType().compareTo(b.getRuleType()));
        
        return result;
    }
    
    /**
     * 获取规则类型名称
     * @param ruleType 规则类型代码
     * @return 规则类型名称
     */
    private String getRuleTypeName(Integer ruleType) {
        if (ruleType == null) {
            return "未知";
        }
        switch (ruleType) {
            case 1:
                return "校验";
            case 2:
                return "补全";
            default:
                return "未知";
        }
    }

    @Override
    public ResultPage queryRulesByPage(InvoiceRulesQuery query) {
        // 查询数据列表
        List<InvoiceRules> rules = invoiceRulesMapper.selectRulesByPage(query);
        
        // 查询总数
        int totalCount = invoiceRulesMapper.countRulesByQuery(query);
        
        // 构造分页结果
        return new ResultPage(rules, query.getPageNum(), query.getPageSize(), totalCount);
    }
}