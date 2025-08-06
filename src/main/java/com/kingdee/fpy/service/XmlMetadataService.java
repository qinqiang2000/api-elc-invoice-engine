package com.kingdee.fpy.service;

import com.kingdee.fpy.model.ElementMetadata;
import com.kingdee.fpy.mapper.ElementMetadataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

@Service
public class XmlMetadataService {

    @Autowired
    private ElementMetadataMapper metadataMapper;

    // 用于去重：key格式为 parentId-felementName-felementType
    private Set<String> uniqueElementSet = new HashSet<>();

    public void parseAndSaveXmlMetadata(InputStream xmlInputStream) throws Exception {
        uniqueElementSet.clear(); // 每次解析前清空
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlInputStream);
        Element root = doc.getDocumentElement();
        saveElementRecursive(root, null, 1);
    }

    private void saveElementRecursive(Element element, Long parentId, int level) {
        String elementKey = (parentId == null ? "root" : parentId) + "-" + element.getTagName() + "-1";
        if (uniqueElementSet.contains(elementKey)) {
            return; // 已存在则跳过
        }
        uniqueElementSet.add(elementKey);

        // 保存当前元素
        ElementMetadata meta = new ElementMetadata();
        meta.setFelementName(element.getLocalName());
        meta.setFelementType(1);
        meta.setFparentId(parentId);
        meta.setFxpath(element.getTagName());
        meta.setFlevel(level);
        meta.setFdescription("");
        meta.setFnameSpace(element.getNamespaceURI());
        // 保存固定值逻辑
        if (isFixedValueElement(element)) {
            meta.setFfixedValue(element.getTextContent());
        }
        metadataMapper.insert(meta);
        Long currentId = meta.getFid();

        // 保存属性
        NamedNodeMap attrs = element.getAttributes();
        for (int i = 0; i < attrs.getLength(); i++) {
            Node attr = attrs.item(i);
            String attrKey = currentId + "-" + attr.getNodeName() + "-2";
            if (uniqueElementSet.contains(attrKey)) {
                continue; // 已存在则跳过
            }
            uniqueElementSet.add(attrKey);

            ElementMetadata attrMeta = new ElementMetadata();
            attrMeta.setFelementName(attr.getNodeName());
            attrMeta.setFelementType(2);
            attrMeta.setFparentId(currentId);
            attrMeta.setFxpath(attr.getNodeName());
            attrMeta.setFlevel(level + 1);
            attrMeta.setFdescription("属性");
            attrMeta.setFmaxOccurs(1);
            attrMeta.setFminOccurs(1);
            attrMeta.setFnameSpace(attr.getNamespaceURI());
            // Invoice节点属性保存固定值
            if (element.getTagName().equals("Invoice")) {
                attrMeta.setFfixedValue(attr.getNodeValue());
            }
            metadataMapper.insert(attrMeta);
        }

        // 递归保存子元素
        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child instanceof Element) {
                saveElementRecursive((Element) child, currentId, level + 1);
            }
        }
    }

    // 判断是否为需要保存固定值的节点
    private boolean isFixedValueElement(Element element) {
        String tag = element.getTagName();
        return "cbc:UBLVersionID".equals(tag) || "cbc:CustomizationID".equals(tag) || "cbc:ProfileID".equals(tag);
    }
} 