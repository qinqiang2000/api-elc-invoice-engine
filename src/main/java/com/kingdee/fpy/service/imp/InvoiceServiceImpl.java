package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.InvoiceMapper;
import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.service.InvoiceService;
import org.springframework.stereotype.Service;

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
} 