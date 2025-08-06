package com.kingdee.fpy.service;

import com.kingdee.fpy.mapper.ElementMetadataMapper;
import com.kingdee.fpy.model.ElementMetadata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
@SpringBootTest
public class XmlBuildServiceTest {

    @Autowired
    private ElementMetadataMapper metadataMapper;

    @Autowired
    private XmlBuildService xmlBuildService;

    //@BeforeEach
   // public void setUp() {
   //     MockitoAnnotations.initMocks(this);
   // }

    @Test
    public void testBuildXmlFromJson() {
        // 构造元数据
        List<ElementMetadata> metaList = new ArrayList<>();
        ElementMetadata root = new ElementMetadata();
        root.setFid(1L);
        root.setFelementName("Invoice");
        root.setFelementType(1);
        root.setFparentId(null);
        root.setFxpath("Invoice");
        metaList.add(root);

        ElementMetadata ubl = new ElementMetadata();
        ubl.setFid(2L);
        ubl.setFelementName("UBLVersionID");
        ubl.setFelementType(1);
        ubl.setFparentId(1L);
        ubl.setFxpath("UBLVersionID");
        metaList.add(ubl);

        ElementMetadata id = new ElementMetadata();
        id.setFid(3L);
        id.setFelementName("ID");
        id.setFelementType(1);
        id.setFparentId(1L);
        id.setFxpath("ID");
        metaList.add(id);

        // mock元数据
        when(metadataMapper.findAll()).thenReturn(metaList);

        // 构造输入数据
        Map<String, Object> data = new HashMap<>();
        data.put("UBLVersionID", "2.1");
        data.put("ID", "INV-001");

        String xml = xmlBuildService.buildXmlFromJson(data);
        // 验证生成的XML包含关键内容
        assertTrue(xml.contains("<Invoice>"));
        assertTrue(xml.contains("<UBLVersionID>2.1</UBLVersionID>"));
        assertTrue(xml.contains("<ID>INV-001</ID>"));
    }
} 