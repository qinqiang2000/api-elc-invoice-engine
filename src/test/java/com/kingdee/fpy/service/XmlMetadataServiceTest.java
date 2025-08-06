package com.kingdee.fpy.service;

import com.kingdee.fpy.model.ElementMetadata;
import com.kingdee.fpy.mapper.ElementMetadataMapper;
import java.io.FileInputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Element;

import java.io.InputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

//@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class XmlMetadataServiceTest {

    @Autowired
    private XmlMetadataService xmlMetadataService;

    @Test
    public void testParseAndSaveXmlMetadata() throws Exception {
        // 使用测试资源目录下的tw_NL_DE_KDUBL20250707.xml
        FileInputStream fileInputStream = new FileInputStream(
                "G:\\ai\\api-invoice-xml\\api-invoice-xml\\tw_NL_DE_KDUBL20250707.xml");
        xmlMetadataService.parseAndSaveXmlMetadata(fileInputStream);
    }
} 