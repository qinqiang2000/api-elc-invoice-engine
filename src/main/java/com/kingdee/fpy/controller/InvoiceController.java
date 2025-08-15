package com.kingdee.fpy.controller;

import com.kingdee.fpy.model.Invoice;
import com.kingdee.fpy.model.InvoiceQuery;
import com.kingdee.fpy.model.CurrencyStats;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.service.InvoiceService;
import com.kingdee.fpy.service.XmlBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    @Autowired
    private XmlBuildService xmlBuildService;
    
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/generate-xml")
    public String generateXml(@RequestBody Map<String, Object> data) {
       // return xmlBuildService.buildXmlFromJson(data);
        return null;
    }
    
    @PostMapping
    public Result<Invoice> createInvoice(@RequestBody Invoice invoice) {
        invoiceService.saveInvoice(invoice);
        return Result.success(invoice);
    }
    
    @GetMapping("/{id}")
    public Result<Invoice> getInvoiceById(@PathVariable Long id) {
        Invoice invoice = invoiceService.getInvoiceById(id);
        if (invoice != null) {
            return Result.success(invoice);
        }
        return Result.error("发票不存在");
    }
    
    @GetMapping("/by-invoice-no/{invoiceNo}")
    public Result<Invoice> getInvoiceByNo(@PathVariable String invoiceNo) {
        Invoice invoice = invoiceService.queryByInvoiceNo(invoiceNo);
        if (invoice != null) {
            return Result.success(invoice);
        }
        return Result.error("发票不存在");
    }
    
    @PutMapping("/{id}")
    public Result<Invoice> updateInvoice(@PathVariable Long id, @RequestBody Invoice invoice) {
        invoice.setId(id);
        invoiceService.updateInvoice(invoice);
        return Result.success(invoice);
    }
    
    @DeleteMapping("/{id}")
    public Result<Void> deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoice(id);
        return Result.success();
    }
    
    @PostMapping("/page")
    public ResultPage queryInvoiceByPage(@RequestBody InvoiceQuery query) {
        return invoiceService.queryInvoiceByPage(query);
    }
    
    @GetMapping("/status-count")
    public Result<Map<String, Object>> getInvoiceStatusCount() {
        Map<String, Object> statusCount = invoiceService.countInvoicesByStatus();
        return Result.success(statusCount);
    }
    
    @GetMapping("/currency-stats/{companyId}")
    public Result<List<CurrencyStats>> getCurrencyStatsByCompany(@PathVariable String companyId) {
        List<CurrencyStats> currencyStats = invoiceService.getCurrencyStatsByCompany(companyId);
        return Result.success(currencyStats);
    }
} 