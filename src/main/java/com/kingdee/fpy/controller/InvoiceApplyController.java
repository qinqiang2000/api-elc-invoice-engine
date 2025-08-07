package com.kingdee.fpy.controller;

import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.service.InvoiceAppleyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 金帆
 * @Date: 2025/8/5 13:44
 * @Description:
 */
@RestController
@RequestMapping("/invoice")
@Slf4j
public class InvoiceApplyController {
    @Autowired
    private InvoiceAppleyService invoiceRequestService;

    /**
     * 插入一条记录
     * @param
     * @return Result结果
     */
    @PostMapping("/createInvoice")
    public Result createInvoice(@RequestBody JSONObject jsonObject) {
        log.info("createInvoice:{}", jsonObject);
        return  invoiceRequestService.createInvoice(jsonObject);
    }
}
