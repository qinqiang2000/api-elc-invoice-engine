package com.kingdee.fpy.service;

import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.model.CurrencyStats;
import com.kingdee.fpy.model.HourlyStatusStats;
import com.kingdee.fpy.model.StatusHourlyStats;
import java.util.Map;
import java.util.List;

public interface InvoiceService {
    void saveInvoice(Invoice invoice);
    Invoice getInvoiceById(Long id);
    Invoice queryByInvoiceNo(String invoiceNo);
    void updateInvoice(Invoice invoice);
    void deleteInvoice(Long id);
    ResultPage queryInvoiceByPage(InvoiceQuery query);
    Map<String, Object> countInvoicesByStatus();
    List<CurrencyStats> getCurrencyStatsByCompany(String companyId);
    List<StatusHourlyStats> getHourlyStatusStats();
} 