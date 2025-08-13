package com.kingdee.fpy.controller;

import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.service.InvoiceApplyService;
import com.kingdee.fpy.service.RpaPlatformService;
import com.kingdee.fpy.service.XmlBuildService;
import com.kingdee.fpy.service.impl.InvoiceRequestServiceImpl;
import com.kingdee.fpy.model.InvoiceRequest;
import com.kingdee.fpy.client.rpa.dto.request.DocumentPreviewRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    private InvoiceApplyService invoiceRequestService;
    
    @Autowired
    private InvoiceRequestServiceImpl invoiceRequestServiceImpl;
    
    @Autowired
    private XmlBuildService xmlBuildService;
    
    @Autowired
    private RpaPlatformService rpaPlatformService;

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

    /**
     * 根据发票号码预览XML文件
     * @param invoiceNo 发票号码
     * @return RPA预览文件
     */
    @GetMapping("/preview/{invoiceNo}")
    public ResponseEntity<Resource> previewInvoiceXml(@PathVariable String invoiceNo) {
        log.info("previewInvoiceXml: {}", invoiceNo);
        
        try {
            // 1. 根据发票号码查询request表
            InvoiceRequest invoiceRequest = invoiceRequestServiceImpl.queryByInvoiceNo(invoiceNo);
            if (invoiceRequest == null) {
                log.warn("未找到发票记录，发票号：{}", invoiceNo);
                return ResponseEntity.notFound().build();
            }
            
            // 2. 从ext_field字段获取JSON数据并转换为XML
            String extFieldJson = invoiceRequest.getExtField();
            if (extFieldJson == null || extFieldJson.trim().isEmpty()) {
                log.warn("发票扩展字段为空，发票号：{}", invoiceNo);
                return ResponseEntity.badRequest().build();
            }
            
            Map<String, Object> xmlMap = new HashMap<>();
            JSONObject invoiceData = JSONObject.parseObject(extFieldJson);
            xmlMap.put("invoice", invoiceData);
            
            String xmlContent = xmlBuildService.convertJsonToXml(com.alibaba.fastjson.JSON.toJSONString(xmlMap));
            log.info("XML转换成功，发票号：{}，XML长度：{}", invoiceNo, xmlContent.length());
            
            // 3. 调用RPA预览接口
            DocumentPreviewRequest previewRequest = new DocumentPreviewRequest();
            previewRequest.setRequestId(UUID.randomUUID().toString());
            previewRequest.setPayload(new ByteArrayResource(xmlContent.getBytes("UTF-8")));
            previewRequest.setNoise(generateNoise());
            previewRequest.setSign(generateSignature(previewRequest));
            
            Resource previewResult = rpaPlatformService.previewDocument(previewRequest);
            
            // 4. 返回预览文件
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("inline", "invoice_preview_" + invoiceNo + ".pdf");
            
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(previewResult);
                    
        } catch (Exception e) {
            log.error("预览发票XML失败，发票号：{}", invoiceNo, e);
            return ResponseEntity.internalServerError().build();
        }
    }
    
    /**
     * 生成噪声值
     */
    private String generateNoise() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    }
    
    /**
     * 生成签名
     */
    private String generateSignature(Object request) {
        return "sample_signature_" + UUID.randomUUID().toString().substring(0, 8);
    }
}
