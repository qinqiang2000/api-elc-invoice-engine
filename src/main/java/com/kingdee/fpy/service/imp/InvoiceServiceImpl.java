package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.InvoiceMapper;
import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.model.CurrencyStats;
import com.kingdee.fpy.service.InvoiceService;
import com.kingdee.fpy.enums.InvoiceStatus;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
    public Map<String, Long> countInvoicesByStatus() {
        List<Map<String, Object>> result = invoiceMapper.countByStatus();
        Map<String, Long> statusCountMap = new HashMap<>();
        
        // 初始化所有状态为0
        for (InvoiceStatus status : InvoiceStatus.values()) {
            statusCountMap.put(status.getValue(), 0L);
        }
        
        // 填入实际统计数据
        for (Map<String, Object> row : result) {
            Integer status = (Integer) row.get("status");
            Long count = ((Number) row.get("count")).longValue();
            
            String statusName = getStatusName(status);
            statusCountMap.put(statusName, count);
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
} 