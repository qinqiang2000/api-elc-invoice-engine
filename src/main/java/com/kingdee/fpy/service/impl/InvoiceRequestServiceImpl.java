package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceRequestMapper;
import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.model.InvoiceRequestQuery;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.enums.InvoiceRequestStatus;
import com.kingdee.fpy.service.InvoiceRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 发票申请服务实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class InvoiceRequestServiceImpl implements InvoiceRequestService {

    @Autowired
    private InvoiceRequestMapper invoiceRequestMapper;

    @Override
    public InvoiceRequest create(InvoiceRequest invoiceRequest) {
        try {
            invoiceRequest.setCreateTime(LocalDateTime.now());
            invoiceRequest.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestMapper.insert(invoiceRequest);
            if (result > 0) {
                log.info("创建发票申请成功，ID: {}", invoiceRequest.getId());
                return invoiceRequest;
            }
            throw new RuntimeException("创建发票申请失败");
        } catch (Exception e) {
            log.error("创建发票申请失败", e);
            throw new RuntimeException("创建发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            int result = invoiceRequestMapper.deleteById(id);
            log.info("删除发票申请 ID: {}, 结果: {}", id, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("删除发票申请失败，ID: {}", id, e);
            throw new RuntimeException("删除发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public boolean deleteBatch(List<Long> ids) {
        try {
            int result = invoiceRequestMapper.deleteBatch(ids);
            log.info("批量删除发票申请，IDs: {}, 结果: {}", ids, result > 0 ? "成功" : "失败");
            return result > 0;
        } catch (Exception e) {
            log.error("批量删除发票申请失败，IDs: {}", ids, e);
            throw new RuntimeException("批量删除发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceRequest update(InvoiceRequest invoiceRequest) {
        try {
            invoiceRequest.setUpdateTime(LocalDateTime.now());
            int result = invoiceRequestMapper.updateById(invoiceRequest);
            if (result > 0) {
                log.info("更新发票申请成功，ID: {}", invoiceRequest.getId());
                return invoiceRequestMapper.selectById(invoiceRequest.getId());
            }
            throw new RuntimeException("更新发票申请失败");
        } catch (Exception e) {
            log.error("更新发票申请失败", e);
            throw new RuntimeException("更新发票申请失败: " + e.getMessage());
        }
    }

    @Override
    public InvoiceRequest getById(Long id) {
        try {
            return invoiceRequestMapper.selectById(id);
        } catch (Exception e) {
            log.error("根据ID查询发票申请失败，ID: {}", id, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public InvoiceRequest getByInvoiceNo(String invoiceNo) {
        try {
            return invoiceRequestMapper.selectByInvoiceNo(invoiceNo);
        } catch (Exception e) {
            log.error("根据发票号查询发票申请失败，发票号: {}", invoiceNo, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getByTenantId(String tenantId) {
        try {
            return invoiceRequestMapper.selectByTenantId(tenantId);
        } catch (Exception e) {
            log.error("根据租户ID查询发票申请失败，租户ID: {}", tenantId, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getAll() {
        try {
            return invoiceRequestMapper.selectAll();
        } catch (Exception e) {
            log.error("查询所有发票申请失败", e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getPage(int pageNum, int pageSize) {
        try {
            int offset = (pageNum - 1) * pageSize;
            return invoiceRequestMapper.selectPage(offset, pageSize);
        } catch (Exception e) {
            log.error("分页查询发票申请失败，页码: {}, 页大小: {}", pageNum, pageSize, e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        try {
            return invoiceRequestMapper.count();
        } catch (Exception e) {
            log.error("统计发票申请总数失败", e);
            throw new RuntimeException("统计发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ResultPage getPageWithFilter(InvoiceRequestQuery query) {
        try {
            log.info("分页查询发票申请，查询参数: 页码={}, 页大小={}, 租户ID={}, 状态={}, 发票号={}", 
                    query.getPageNum(), query.getPageSize(), query.getTenantId(), query.getStatus(), query.getInvoiceNo());
            // 查询总数
            List<InvoiceRequest> data =new ArrayList<>();
            long totalElement = invoiceRequestMapper.countWithFilter(query);
            if(totalElement>0){
                // 查询数据列表
                data = invoiceRequestMapper.selectPageWithFilter(query);
            }
            // 创建分页结果
            ResultPage resultPage = new ResultPage(data, query.getPageNum(), query.getPageSize(), (int) totalElement);
            
            log.info("分页查询发票申请完成，总记录数: {}, 当前页记录数: {}", totalElement, data.size());
            return resultPage;
        } catch (Exception e) {
            log.error("分页查询发票申请失败", e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvoiceRequest> getByCondition(InvoiceRequest invoiceRequest) {
        try {
            return invoiceRequestMapper.selectByCondition(invoiceRequest);
        } catch (Exception e) {
            log.error("根据条件查询发票申请失败", e);
            throw new RuntimeException("查询发票申请失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Map<String, Long> getStatusStatistics(String companyId) {
        try {
            List<Map<String, Object>> statusList = invoiceRequestMapper.selectStatusStatistics(companyId);
            Map<Integer, Long> statusCountMap = new HashMap<>();
            
            // 将查询结果转换为Map
            for (Map<String, Object> item : statusList) {
                Integer status = (Integer) item.get("key");
                Long count = ((Number) item.get("value")).longValue();
                statusCountMap.put(status, count);
            }
            
            Map<String, Long> result = new HashMap<>();
            
            // 遍历所有状态枚举，确保所有状态都有对应的统计结果
            for (InvoiceRequestStatus status : InvoiceRequestStatus.values()) {
                Long count = statusCountMap.getOrDefault(status.getCode(), 0L);
                result.put(status.getStatus(), count);
            }
            
            log.info("统计各单据综合状态的开票请求数量完成，企业ID: {}, 结果: {}", companyId, result);
            return result;
        } catch (Exception e) {
            log.error("统计各单据综合状态的开票请求数量失败，企业ID: {}", companyId, e);
            throw new RuntimeException("统计失败: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> getHourlyStatusStatistics(String companyId) {
        try {
            List<Map<String, Object>> hourlyData = invoiceRequestMapper.selectHourlyStatusStatistics(companyId);
            Map<String, Map<String, Long>> hourlyMap = new HashMap<>();
            
            // 将查询结果按小时分组
            for (Map<String, Object> item : hourlyData) {
                String hourTime = (String) item.get("hour_time");
                Integer statusCode = (Integer) item.get("fstatus");
                Long count = ((Number) item.get("count")).longValue();
                
                hourlyMap.computeIfAbsent(hourTime, k -> new HashMap<>());
                
                // 将状态码转换为状态名称
                try {
                    InvoiceRequestStatus status = InvoiceRequestStatus.fromCode(statusCode);
                    hourlyMap.get(hourTime).put(status.getStatus(), count);
                } catch (IllegalArgumentException e) {
                    log.warn("未知状态码: {}, 跳过该记录", statusCode);
                }
            }
            
            // 生成完整的24小时时间列表
            List<String> complete24Hours = new ArrayList<>();
            LocalDateTime now = LocalDateTime.now();
            for (int i = 23; i >= 0; i--) {
                LocalDateTime hourTime = now.minusHours(i).withMinute(0).withSecond(0).withNano(0);
                String formattedTime = hourTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00"));
                complete24Hours.add(formattedTime);
            }
            
            // 构建完整的返回结果，确保每个小时都包含所有状态
            List<Map<String, Object>> result = new ArrayList<>();
            for (String hourTime : complete24Hours) {
                Map<String, Object> hourlyStats = new HashMap<>();
                hourlyStats.put("hour", hourTime);
                
                // 为每个小时构建完整的状态统计，确保所有状态都有值
                Map<String, Long> statusCounts = new HashMap<>();
                for (InvoiceRequestStatus status : InvoiceRequestStatus.values()) {
                    Long count = 0L;
                    // 如果该小时有数据，且包含该状态，则使用实际数量
                    if (hourlyMap.containsKey(hourTime) && hourlyMap.get(hourTime).containsKey(status.getStatus())) {
                        count = hourlyMap.get(hourTime).get(status.getStatus());
                    }
                    statusCounts.put(status.getStatus(), count);
                }
                hourlyStats.put("statuses", statusCounts);
                result.add(hourlyStats);
            }
            
            log.info("统计企业最近24小时按小时维度的各状态开票请求数量完成，企业ID: {}, 返回24小时完整数据", companyId);
            return result;
        } catch (Exception e) {
            log.error("统计企业最近24小时按小时维度的各状态开票请求数量失败，企业ID: {}", companyId, e);
            throw new RuntimeException("统计失败: " + e.getMessage());
        }
    }

    public InvoiceRequest queryByInvoiceNo(String invoiceNo) {
        return invoiceRequestMapper.selectByInvoiceNo(invoiceNo);
    }
}