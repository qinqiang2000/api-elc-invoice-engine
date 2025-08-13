package com.kingdee.fpy.service;

import com.kingdee.fpy.model.Invoice;

public interface InvoiceService {
    void saveInvoice(Invoice invoice);
    Invoice getInvoiceById(Long id);
    Invoice queryByInvoiceNo(String invoiceNo);
    void updateInvoice(Invoice invoice);
    void deleteInvoice(Long id);
} 