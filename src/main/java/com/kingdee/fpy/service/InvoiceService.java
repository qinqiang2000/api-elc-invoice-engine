package com.kingdee.fpy.service;

import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.model.CurrencyStats;
import java.util.Map;
import java.util.List;

public interface InvoiceService {
    void saveInvoice(Invoice invoice);
    Invoice getInvoiceById(Long id);
    Invoice queryByInvoiceNo(String invoiceNo);
    void updateInvoice(Invoice invoice);
    void deleteInvoice(Long id);
    ResultPage queryInvoiceByPage(InvoiceQuery query);
    Map<String, Long> countInvoicesByStatus();
    List<CurrencyStats> getCurrencyStatsByCompany(String companyId);
} 