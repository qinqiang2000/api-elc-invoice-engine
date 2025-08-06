package com.kingdee.fpy.service;

import com.kingdee.fpy.model.ElementMetadata;
import com.kingdee.fpy.mapper.ElementMetadataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XmlBuildService {
    @Autowired
    private ElementMetadataMapper metadataMapper;

    public String buildXmlFromJson(Map<String, Object> data) {
        try {
            List<ElementMetadata> metaList = metadataMapper.findAll();
            Map<Long, Element> idElementMap = new HashMap<>();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = null;
            // 先创建所有元素节点
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 1) continue; // 只处理元素
                Element elem = doc.createElement(meta.getFxpath());
                // 设置固定值或用户输入值
                String value = null;
                if (meta.getFfixedValue() != null && !meta.getFfixedValue().isEmpty()) {
                    value = meta.getFfixedValue();
                } else if (data.containsKey(meta.getFelementName())) {
                    value = String.valueOf(data.get(meta.getFelementName()));
                }
                if (value != null) {
                    elem.setTextContent(value);
                    idElementMap.put(meta.getFid(), elem);
                }
                if (meta.getFparentId() == null) {
                    root = elem;
                    doc.appendChild(root);
                }
            }
            // 再组装父子关系
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 1) continue;
                if (meta.getFparentId() != null) {
                    Element parent = idElementMap.get(meta.getFparentId());
                    Element child = idElementMap.get(meta.getFid());
                    if (parent != null && child != null && child != root) {
                        parent.appendChild(child);
                    }
                }
            }
            // 设置属性
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 2) continue;
                Element parent = idElementMap.get(meta.getFparentId());
                if (parent != null) {
                    String value = null;
                    if (meta.getFfixedValue() != null && !meta.getFfixedValue().isEmpty()) {
                        value = meta.getFfixedValue();
                    } else if (data.containsKey(meta.getFelementName())) {
                        value = String.valueOf(data.get(meta.getFelementName()));
                    }
                    if (value != null) {
                        parent.setAttribute(meta.getFelementName(), value);
                    }
                }
            }
            // 输出XML字符串
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            java.io.StringWriter writer = new java.io.StringWriter();
            transformer.transform(new javax.xml.transform.dom.DOMSource(doc), new javax.xml.transform.stream.StreamResult(writer));
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("XML生成失败: " + e.getMessage(), e);
        }
    }
} 