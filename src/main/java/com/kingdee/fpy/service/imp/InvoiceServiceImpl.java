package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.InvoiceMapper;
import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.model.CurrencyStats;
import com.kingdee.fpy.model.HourlyStatusStats;
import com.kingdee.fpy.model.StatusHourlyStats;
import com.kingdee.fpy.service.InvoiceService;
import com.kingdee.fpy.enums.InvoiceStatus;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceMapper invoiceMapper;

    public InvoiceServiceImpl(InvoiceMapper invoiceMapper) {
        this.invoiceMapper = invoiceMapper;
    }

    @Override
    public void saveInvoice(Invoice invoice) {
        invoiceMapper.insert(invoice);
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        return invoiceMapper.findById(id);
    }

    @Override
    public Invoice queryByInvoiceNo(String invoiceNo) {
        return invoiceMapper.findByInvoiceNo(invoiceNo);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        invoiceMapper.update(invoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceMapper.deleteById(id);
    }

    @Override
    public ResultPage queryInvoiceByPage(InvoiceQuery query) {
        List<Invoice> records = invoiceMapper.selectByQuery(query);
        long total = invoiceMapper.countByQuery(query);
        return new ResultPage(records, query.getPageNum(), query.getPageSize(), (int) total);
    }
    
    @Override
    public Map<String, Object> countInvoicesByStatus() {
        List<Map<String, Object>> result = invoiceMapper.countByStatus();
        Map<String, Object> statusCountMap = new HashMap<>();
        
        // 初始化所有状态为0
        for (InvoiceStatus status : InvoiceStatus.values()) {
            Map<String, Object> valueMap = new HashMap<>();
            valueMap.put("value", 0L);
            statusCountMap.put(status.getValue(), valueMap);
        }
        
        // 填入实际统计数据
        for (Map<String, Object> row : result) {
            Integer status = (Integer) row.get("status");
            Long count = ((Number) row.get("count")).longValue();
            
            String statusName = getStatusName(status);
            Map<String, Object> valueMap = new HashMap<>();
            valueMap.put("value", count);
            statusCountMap.put(statusName, valueMap);
        }
        
        return statusCountMap;
    }
    
    private String getStatusName(Integer status) {
        if (status == null) {
            return "Unknown";
        }
        
        try {
            return InvoiceStatus.fromCode(status).getValue();
        } catch (IllegalArgumentException e) {
            return "Unknown";
        }
    }
    
    @Override
    public List<CurrencyStats> getCurrencyStatsByCompany(String companyId) {
        return invoiceMapper.getCurrencyStatsByCompany(companyId);
    }
    
    @Override
    public List<StatusHourlyStats> getHourlyStatusStats() {
        // 获取原始数据
        List<HourlyStatusStats> rawData = invoiceMapper.getHourlyStatusStats();
        
        // 生成24小时的时间列表
        List<String> hourList = generateLast24Hours();
        
        // 按状态分组
        Map<Integer, Map<String, Long>> statusGrouped = new HashMap<>();
        
        // 初始化所有状态的24小时数据为0
        for (InvoiceStatus status : InvoiceStatus.values()) {
            Map<String, Long> hourlyData = new LinkedHashMap<>();
            for (String hour : hourList) {
                hourlyData.put(hour, 0L);
            }
            statusGrouped.put(status.getCode(), hourlyData);
        }
        
        // 填入实际数据
        for (HourlyStatusStats data : rawData) {
            Integer status = data.getStatus();
            String hour = data.getHour();
            Long count = data.getCount();
            
            if (statusGrouped.containsKey(status) && statusGrouped.get(status).containsKey(hour)) {
                statusGrouped.get(status).put(hour, count);
            }
        }
        
        // 转换为返回格式
        List<StatusHourlyStats> result = new ArrayList<>();
        for (InvoiceStatus status : InvoiceStatus.values()) {
            Map<String, Long> hourlyData = statusGrouped.get(status.getCode());
            StatusHourlyStats statusStats = new StatusHourlyStats(
                status.getCode(), 
                status.getValue(), 
                hourlyData
            );
            result.add(statusStats);
        }
        
        return result;
    }
    
    /**
     * 生成最近24小时的时间列表
     */
    private List<String> generateLast24Hours() {
        List<String> hourList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00");
        LocalDateTime now = LocalDateTime.now();
        
        // 从24小时前开始，到当前小时
        for (int i = 23; i >= 0; i--) {
            LocalDateTime hourTime = now.minusHours(i).withMinute(0).withSecond(0).withNano(0);
            hourList.add(hourTime.format(formatter));
        }
        
        return hourList;
    }
} 