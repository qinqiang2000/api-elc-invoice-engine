package com.kingdee.fpy.controller;

import com.kingdee.fpy.service.XmlBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    @Autowired
    private XmlBuildService xmlBuildService;

    @PostMapping("/generate-xml")
    public String generateXml(@RequestBody Map<String, Object> data) {
       // return xmlBuildService.buildXmlFromJson(data);
        return null;
    }
} 