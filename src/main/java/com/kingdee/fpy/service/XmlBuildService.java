package com.kingdee.fpy.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingdee.fpy.model.ElementMetadata;
import com.kingdee.fpy.model.MetadataNode;
import com.kingdee.fpy.mapper.ElementMetadataMapper;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;
import java.util.stream.Collectors;
import org.w3c.dom.Node;
import java.util.Comparator;

@Service
@Slf4j
public class XmlBuildService {
    @Autowired
    private ElementMetadataMapper metadataMapper;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Map<String, MetadataNode> xpathMap = new HashMap<>();
    private MetadataNode buildMetadataTree() {
        List<ElementMetadata> metadataList = metadataMapper.findAll();
        Map<Long, MetadataNode> nodeMap = new HashMap<>();
        Map<Long, List<ElementMetadata>> childrenMap = new HashMap<>();

        // 创建所有节点
        for (ElementMetadata meta : metadataList) {
            MetadataNode node = new MetadataNode(meta);
            nodeMap.put(meta.getFid(), node);
            xpathMap.put(meta.getFxpath(), node);

            Long parentId = meta.getFparentId();
            if (parentId != null) {
                childrenMap.computeIfAbsent(parentId, k -> new ArrayList<>())
                        .add(meta);
            }
        }

        // 构建树结构
        for (ElementMetadata meta : metadataList) {
            Long parentId = meta.getFparentId();
            if (parentId != null && nodeMap.containsKey(parentId)) {
                MetadataNode parent = nodeMap.get(parentId);
                MetadataNode child = nodeMap.get(meta.getFid());
                parent.addChild(child);
            }
        }

        // 查找根节点
        return nodeMap.get( metadataList.stream()
                .filter(meta -> meta.getFparentId() == null).findFirst().get().getFid());
    }

    public String convertJsonToXml(String json) throws Exception {
        JsonNode rootNode = objectMapper.readTree(json);
        MetadataNode rootMetadata = buildMetadataTree();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        processNode(rootNode, rootMetadata, doc, doc);

        String result = documentToString(doc);
        return result;
    }

    private void processNode(JsonNode jsonNode, MetadataNode metaNode,
            Document doc, Node parentNode) {
        if (metaNode.getElementType() == 2) { // 属性处理
            // 根据xpath路径查找属性值
            JsonNode attrValue = findJsonValueByXPath(jsonNode, metaNode.getXpath());
            if(null == attrValue && metaNode.getFixedValue() != null){
                Attr attr = doc.createAttribute(metaNode.getXpath());
                attr.setValue(escapeXml(metaNode.getFixedValue()));
                ((Element) parentNode).setAttributeNode(attr);
            } else if (attrValue != null && !attrValue.isNull()) {
                Attr attr = doc.createAttribute(getElementNameFromXPath(metaNode.getXpath()));
                attr.setValue(escapeXml(attrValue.asText()));
                ((Element) parentNode).setAttributeNode(attr);
            }
            return;
        }

        // 创建元素
        Element element = doc.createElement(metaNode.getXpath());
        // 处理属性子节点
        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 2)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> processNode(jsonNode, child, doc, element));

        // 查找当前元素对应的JSON数据
        JsonNode elementData = findJsonValueByXPath(jsonNode, metaNode.getXpath());
        
        // 处理元素子节点 - 只处理元数据中定义的字段
        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 1)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> {
                    // 严格按照元数据定义查找数据，不进行额外的递归搜索
                    JsonNode childData = findChildData(jsonNode, elementData, child);
                    if (childData != null && !childData.isNull()) {
                            // 处理数组
                            if (childData.isArray()) {
                                for (int i = 0; i < childData.size(); i++) {
                                    JsonNode item = childData.get(i);
                                    // 为数组中的每一项创建一个元素
                                    processArrayItem(jsonNode, item, child, doc, element);
                                }
                            } else {
                                // 单个值但元数据定义为数组，仍然处理
                                processArrayItem(jsonNode, childData, child, doc, element);
                            }

                    } 
                    // 移除日志输出，减少噪音 - 没有找到数据是正常的，不需要记录
                });

        // 处理叶子节点值 - 检查当前元素是否有对应的JSON值
        if (elementData != null && !elementData.isNull()) {
            if (elementData.isValueNode()) {
                element.setTextContent(escapeXml(elementData.asText()));
            } else if (elementData.isObject()) {
                // 如果是对象，检查是否有文本值字段
                JsonNode valueField = elementData.get("value");
                if (valueField != null && !valueField.isNull() && valueField.isValueNode()) {
                    element.setTextContent(escapeXml(valueField.asText()));
                }
                // 如果没有子元素定义，尝试从对象中获取第一个非属性字段作为文本值
                else if (metaNode.getChildren().stream().noneMatch(child -> child.getElementType() == 1)) {
                    // 获取所有属性字段名
                    Set<String> attrNames = metaNode.getChildren().stream()
                            .filter(child -> child.getElementType() == 2)
                            .map(MetadataNode::getName)
                            .collect(java.util.stream.Collectors.toSet());
                    
                    // 查找第一个非属性字段且在元数据中定义的字段作为文本值
                    elementData.fields().forEachRemaining(field -> {
                        if (!attrNames.contains(field.getKey()) && 
                            field.getValue().isValueNode() &&
                            element.getTextContent().isEmpty() &&
                            isFieldDefinedInMetadata(metaNode, field.getKey())) {
                            element.setTextContent(escapeXml(field.getValue().asText()));
                        }
                    });
                }
            }
        }

        parentNode.appendChild(element);
    }
    
    /**
     * 处理数组项，为数组中的每个项创建XML元素
     */
    private void processArrayItem(JsonNode rootJson, JsonNode arrayItem, MetadataNode metaNode,
            Document doc, Node parentNode) {
        // 创建元素
        Element element = doc.createElement(metaNode.getXpath());

        // 处理属性子节点 - 从数组项本身获取属性 - 只处理元数据中定义的属性
        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 2)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> {
                    JsonNode attrValue = null;
                    String childElementName = getElementNameFromXPath(child.getXpath());
                    // 只在当前数组项中查找属性值，不进行递归搜索
                    if (arrayItem != null && arrayItem.has(childElementName)) {
                        attrValue = arrayItem.get(childElementName);
                    }
                    
                    if (attrValue != null && !attrValue.isNull()) {
                        Attr attr = doc.createAttribute(getElementNameFromXPath(child.getXpath()));
                        attr.setValue(escapeXml(attrValue.asText()));
                        element.setAttributeNode(attr);
                    } 
                    // 移除日志输出，没找到属性是正常的
                });

        // 处理元素子节点 - 从数组项本身获取子元素数据 - 只处理元数据中定义的子元素
        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 1)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> {
                    JsonNode childData = null;
                    String childElementName = getElementNameFromXPath(child.getXpath());
                    // 只在当前数组项中查找子元素，不进行递归搜索
                    if (arrayItem != null && arrayItem.has(childElementName)) {
                        childData = arrayItem.get(childElementName);
                    }
                    if (childData != null && !childData.isNull()) {
                        // 嵌套数组处理
                        if (childData.isArray()) {
                            for (JsonNode item : childData) {
                                processArrayItem(rootJson, item, child, doc, element);
                            }
                        } else {
                            processArrayItem(rootJson, childData, child, doc, element);
                        }
                    } 
                    // 不再为没有数据的情况创建空元素框架，严格按照数据存在性决定
                });

        // 处理叶子节点值
        if (arrayItem != null && !arrayItem.isNull()) {
            if (arrayItem.isValueNode()) {
                element.setTextContent(escapeXml(arrayItem.asText()));
            } else if (arrayItem.isObject()) {
                // 如果是对象，检查是否有文本值字段
                JsonNode valueField = arrayItem.get("value");
                if (valueField != null && !valueField.isNull() && valueField.isValueNode()) {
                    element.setTextContent(escapeXml(valueField.asText()));
                }
                // 如果没有子元素定义，尝试从对象中获取第一个非属性字段作为文本值
                else if (metaNode.getChildren().stream().noneMatch(child -> child.getElementType() == 1)) {
                    // 获取所有属性字段名
                    Set<String> attrNames = metaNode.getChildren().stream()
                            .filter(child -> child.getElementType() == 2)
                            .map(MetadataNode::getName)
                            .collect(java.util.stream.Collectors.toSet());
                    
                    // 查找第一个非属性字段且在元数据中定义的字段作为文本值
                    arrayItem.fields().forEachRemaining(field -> {
                        if (!attrNames.contains(field.getKey()) && 
                            field.getValue().isValueNode() &&
                            element.getTextContent().isEmpty() &&
                            isFieldDefinedInMetadata(metaNode, field.getKey())) {
                            element.setTextContent(escapeXml(field.getValue().asText()));
                        }
                    });
                }
            }
        }

        parentNode.appendChild(element);
    }
    
    /**
     * 处理空子元素，尝试从父数据中查找属性和值
     */
    private void processEmptyChildElement(JsonNode parentData, MetadataNode childMeta, Document doc, Element childElement) {
        if (parentData == null || parentData.isNull()) {
            return;
        }
        
        // 查找子元素的属性
        childMeta.getChildren().stream()
                .filter(grandChild -> grandChild.getElementType() == 2) // 属性
                .forEach(attrChild -> {
                    JsonNode attrValue = findAttributeInData(parentData, childMeta.getName(), attrChild.getName());
                    if (attrValue != null && !attrValue.isNull()) {
                        Attr attr = doc.createAttribute(attrChild.getName());
                        attr.setValue(escapeXml(attrValue.asText()));
                        childElement.setAttributeNode(attr);
                    }
                });
        
        // 查找子元素的文本值
        JsonNode textValue = findTextValueInData(parentData, childMeta.getName());
        if (textValue != null && !textValue.isNull()) {
            childElement.setTextContent(escapeXml(textValue.asText()));
        }
        
        // 处理嵌套子元素
        childMeta.getChildren().stream()
                .filter(grandChild -> grandChild.getElementType() == 1) // 元素
                .forEach(grandChild -> {
                    JsonNode grandChildData = findChildInData(parentData, childMeta.getName(), grandChild.getName());
                    if (grandChildData != null && !grandChildData.isNull()) {
                        processNodeWithData(grandChildData, grandChild, doc, childElement);
                    }
                });
    }
    
    /**
     * 在数据中查找指定子元素的属性值
     */
    private JsonNode findAttributeInData(JsonNode data, String elementName, String attrName) {
        if (data.has(elementName)) {
            JsonNode elementData = data.get(elementName);
            if (elementData.isObject() && elementData.has(attrName)) {
                return elementData.get(attrName);
            }
        }
        return null;
    }
    
    /**
     * 在数据中查找指定子元素的文本值
     */
    private JsonNode findTextValueInData(JsonNode data, String elementName) {
        if (data.has(elementName)) {
            JsonNode elementData = data.get(elementName);
            if (elementData.isValueNode()) {
                return elementData;
            } else if (elementData.isObject()) {
                // 检查value字段
                if (elementData.has("value")) {
                    return elementData.get("value");
                }
            }
        }
        return null;
    }
    
    /**
     * 在数据中查找指定子元素的子元素数据
     */
    private JsonNode findChildInData(JsonNode data, String elementName, String childName) {
        if (data.has(elementName)) {
            JsonNode elementData = data.get(elementName);
            if (elementData.isObject() && elementData.has(childName)) {
                return elementData.get(childName);
            }
        }
        return null;
    }
    
    /**
     * 使用指定的数据节点处理元数据节点
     */
    private void processNodeWithData(JsonNode dataNode, MetadataNode metaNode,
            Document doc, Node parentNode) {
        if (metaNode.getElementType() == 2) { // 属性处理
            if (dataNode != null && !dataNode.isNull()) {
                Attr attr = doc.createAttribute(getElementNameFromXPath(metaNode.getXpath()));
                attr.setValue(escapeXml(dataNode.asText()));
                ((Element) parentNode).setAttributeNode(attr);
            }
            return;
        }

        // 创建元素
        Element element = doc.createElement(metaNode.getXpath());

        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 2)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> {
                    JsonNode attrValue = null;
                    String childElementName = getElementNameFromXPath(child.getXpath());
                    if (dataNode != null && dataNode.has(childElementName)) {
                        attrValue = dataNode.get(childElementName);
                    }
                    if (attrValue != null && !attrValue.isNull()) {
                        Attr attr = doc.createAttribute(getElementNameFromXPath(child.getXpath()));
                        attr.setValue(escapeXml(attrValue.asText()));
                        element.setAttributeNode(attr);
                    }
                });

        // 处理元素子节点
        metaNode.getChildren().stream()
                .filter(child -> child.getElementType() == 1)
                .sorted(Comparator.comparingLong(MetadataNode::getId))
                .forEach(child -> {
                    JsonNode childData = null;
                    String childElementName = getElementNameFromXPath(child.getXpath());
                    if (dataNode != null && dataNode.has(childElementName)) {
                        childData = dataNode.get(childElementName);
                    } 
                    // 移除日志输出，没找到数据是正常的，不需要记录
                    
                    if (childData != null && !childData.isNull()) {
                        if (child.getMaxOccurs() != null &&
                                (child.getMaxOccurs() > 1 || child.getMaxOccurs() == -1)) {
                            // 处理数组
                            if (childData.isArray()) {
                                for (JsonNode item : childData) {
                                    processNodeWithData(item, child, doc, element);
                                }
                            } else {
                                processNodeWithData(childData, child, doc, element);
                            }
                        } else {
                            processNodeWithData(childData, child, doc, element);
                        }
                    } else {
                        // 即使没有直接数据，也要检查子节点是否有必需的属性或固定值
                        if (child.getFixedValue() != null && !child.getFixedValue().isEmpty()) {
                            Element childElement = doc.createElement(child.getXpath());
                            childElement.setTextContent(child.getFixedValue());
                            element.appendChild(childElement);
                        } else if (!child.getChildren().isEmpty()) {
                            processNodeWithData(null, child, doc, element);
                        }
                    }
                });

        // 处理叶子节点值
        if (dataNode != null && !dataNode.isNull()) {
            if (dataNode.isValueNode()) {
                element.setTextContent(escapeXml(dataNode.asText()));
            } else if (dataNode.isObject()) {
                // 如果是对象，检查是否有文本值字段
                JsonNode valueField = dataNode.get("value");
                if (valueField != null && !valueField.isNull() && valueField.isValueNode()) {
                    element.setTextContent(escapeXml(valueField.asText()));
                }
                // 如果没有子元素定义，尝试从对象中获取第一个非属性字段作为文本值
                else if (metaNode.getChildren().stream().noneMatch(child -> child.getElementType() == 1)) {
                    // 获取所有属性字段名
                    Set<String> attrNames = metaNode.getChildren().stream()
                            .filter(child -> child.getElementType() == 2)
                            .map(MetadataNode::getName)
                            .collect(java.util.stream.Collectors.toSet());
                    
                    // 查找第一个非属性字段且在元数据中定义的字段作为文本值
                    dataNode.fields().forEachRemaining(field -> {
                        if (!attrNames.contains(field.getKey()) && 
                            field.getValue().isValueNode() &&
                            element.getTextContent().isEmpty() &&
                            isFieldDefinedInMetadata(metaNode, field.getKey())) {
                            element.setTextContent(escapeXml(field.getValue().asText()));
                        }
                    });
                }
            }
        }

        parentNode.appendChild(element);
    }
    
    /**
     * 判断是否应该创建子元素
     */
    private boolean shouldCreateChildElement(MetadataNode childNode, JsonNode parentData) {
        // 如果子节点有固定值，应该创建
        if (childNode.getFixedValue() != null && !childNode.getFixedValue().isEmpty()) {
            return true;
        }
        
        /*// 如果是必需元素，应该创建
        if (childNode.isRequired() != null && childNode.isRequired()) {
            return true;
        }*/
        
        // 如果子节点有属性子节点且父数据中有对应属性数据，应该创建
        if (parentData != null && !parentData.isNull() && parentData.isObject()) {
            for (MetadataNode grandChild : childNode.getChildren()) {
                if (grandChild.getElementType() == 2) { // 属性
                    if (parentData.has(grandChild.getName())) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    /**
     * 检查指定的字段名是否在元数据节点的子节点中定义
     */
    private boolean isFieldDefinedInMetadata(MetadataNode parentMeta, String fieldName) {
        if (parentMeta == null || fieldName == null || fieldName.isEmpty()) {
            return false;
        }
        
        return parentMeta.getChildren().stream()
                .anyMatch(child -> fieldName.equals(child.getName()) || 
                                 fieldName.equals(getElementNameFromXPath(child.getXpath())));
    }

    /**
     * 使用多种策略查找子元素数据 - 只在元数据定义了该字段时才查找
     */
    private JsonNode findChildData(JsonNode rootJson, JsonNode parentData, MetadataNode childMeta) {
        // 首先检查元数据中是否定义了该字段，如果没有定义则直接返回null
        if (childMeta == null || childMeta.getName() == null || childMeta.getName().isEmpty()) {
            return null;
        }
        
        // 策略1：从父元素数据中直接查找
        if (parentData != null && !parentData.isNull() && parentData.has(childMeta.getName())) {
            return parentData.get(childMeta.getName());
        }
        // 策略2：通过xpath查找 - 严格按照元数据定义的xpath路径查找
        if (childMeta.getXpath() != null && !childMeta.getXpath().isEmpty()) {
            JsonNode result = findJsonValueByXPath(rootJson, childMeta.getXpath());
            if (result != null && !result.isNull()) {
                return result;
            }
        }
        
        // 不再使用递归查找和根级别查找策略，避免生成元数据中未定义的XML标签
        return null;
    }

    /**
     * 根据xpath路径查找JsonNode中的值
     */
    private JsonNode findJsonValueByXPath(JsonNode rootNode, String xpath) {
        if (xpath == null || xpath.isEmpty()) {
            return null;
        }
        
        // 解析xpath路径
        String[] pathElements = parseXPathToJsonPath(xpath);
        if (pathElements.length == 0) {
            return null;
        }
        
        // 从根节点开始查找，跳过根元素
        JsonNode current = rootNode;
        int startIndex = pathElements.length > 1 ? 1 : 0;
        
        for (int i = startIndex; i < pathElements.length; i++) {
            String element = pathElements[i];
            
            // 处理属性路径（以@开头）
            if (element.startsWith("@")) {
                element = element.substring(1);
            }
            
            if (current == null || current.isNull()) {
                return null;
            }
            
            if (current.has(element)) {
                current = current.get(element);
            } else {
                // 如果直接查找不到，尝试递归查找
                JsonNode found = findJsonValueRecursively(current, element);
                if (found != null) {
                    current = found;
                } else {
                    return null;
                }
            }
        }
        
        return current;
    }
    
    /**
     * 递归查找JsonNode中的值
     */
    private JsonNode findJsonValueRecursively(JsonNode node, String elementName) {
        if (node == null || node.isNull()) {
            return null;
        }
        
        // 直接查找
        if (node.has(elementName)) {
            return node.get(elementName);
        }
        
        // 递归查找对象字段
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                JsonNode result = findJsonValueRecursively(field.getValue(), elementName);
                if (result != null) {
                    return result;
                }
            }
        }
        
        // 递归查找数组元素
        if (node.isArray()) {
            for (JsonNode item : node) {
                JsonNode result = findJsonValueRecursively(item, elementName);
                if (result != null) {
                    return result;
                }
            }
        }
        
        return null;
    }
    
    /**
     * 解析xpath为适用于JSON的路径数组
     */
    private String[] parseXPathToJsonPath(String xpath) {
        // 移除开头的'/'和'.'
        String cleanPath = xpath;
        if (cleanPath.startsWith("/")) {
            cleanPath = cleanPath.substring(1);
        }
        if (cleanPath.startsWith(".")) {
            cleanPath = cleanPath.substring(1);
        }
        
        // 按'/'分割路径
        String[] parts = cleanPath.split("/");
        
        // 移除命名空间前缀，只保留元素名
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains(":")) {
                parts[i] = parts[i].substring(parts[i].indexOf(":") + 1);
            }
        }
        
        return parts;
    }

    private String escapeXml(String value) {
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }

    private String documentToString(Document doc) throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        return writer.toString();
    }

    /**
     * 根据元数据的xpath路径获取JSON中的值
     */
    private Object getJsonValueByPath(Map<String, Object> data, String elementName) {
        // 首先尝试直接在根级别查找
        if (data.containsKey(elementName)) {
            return data.get(elementName);
        }

        // 如果没有找到，递归查找所有可能的位置
        return findJsonValueRecursive(data, elementName);
    }

    /**
     * 递归查找JSON中的值（支持嵌套结构）
     */
    private Object findJsonValueRecursive(Map<String, Object> data, String elementName) {
        // 直接查找当前层级
        if (data.containsKey(elementName)) {
            return data.get(elementName);
        }

        // 递归查找嵌套对象
        for (Object value : data.values()) {
            if (value instanceof Map) {
                Object result = findJsonValueRecursive((Map<String, Object>) value, elementName);
                if (result != null) {
                    return result;
                }
            } else if (value instanceof java.util.List) {
                for (Object item : (java.util.List) value) {
                    if (item instanceof Map) {
                        Object result = findJsonValueRecursive((Map<String, Object>) item, elementName);
                        if (result != null) {
                            return result;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * 基于xpath路径检查JSON中是否有对应的值
     */
    private boolean hasJsonValueByXPath(Map<String, Object> data, String xpath, String elementName) {
        return getJsonValueByXPath(data, xpath, elementName) != null;
    }

    /**
     * 基于xpath路径获取JSON中的值
     */
    private Object getJsonValueByXPath(Map<String, Object> data, String xpath, String elementName) {
        if (xpath == null || xpath.isEmpty()) {
            // 如果没有xpath，使用原有的递归查找方式
            return getJsonValueByPath(data, elementName);
        }

        // 解析xpath路径，构建路径数组
        String[] pathElements = parseXPathToElements(xpath);
        if (pathElements.length == 0) {
            return getJsonValueByPath(data, elementName);
        }

        // 从根开始递归查找，跳过根元素
        int startIndex = pathElements.length > 1 ? 1 : 0;
        return findValueByPath(data, pathElements, startIndex);
    }

    /**
     * 解析xpath为元素路径数组
     */
    private String[] parseXPathToElements(String xpath) {
        // 移除开头的'.'，按'.'分割路径
        String cleanPath = xpath.startsWith(".") ? xpath.substring(1) : xpath;
        String[] parts = cleanPath.split(".");

        // 移除命名空间前缀，只保留元素名
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains(":")) {
                parts[i] = parts[i].substring(parts[i].indexOf(":") + 1);
            }
            // 移除属性路径部分
            if (parts[i].startsWith("@")) {
                parts[i] = parts[i].substring(1);
            }
        }

        return parts;
    }

    /**
     * 根据路径数组递归查找值
     */
    private Object findValueByPath(Map<String, Object> data, String[] pathElements, int currentIndex) {
        if (currentIndex >= pathElements.length) {
            return null;
        }

        String currentElement = pathElements[currentIndex];

        // 如果是最后一个元素，直接返回值
        if (currentIndex == pathElements.length - 1) {
            return data.get(currentElement);
        }

        // 继续向下查找
        Object nextLevel = data.get(currentElement);
        if (nextLevel instanceof Map) {
            return findValueByPath((Map<String, Object>) nextLevel, pathElements, currentIndex + 1);
        } else if (nextLevel instanceof java.util.List) {
            // 如果是数组，查找第一个匹配的对象
            for (Object item : (java.util.List) nextLevel) {
                if (item instanceof Map) {
                    Object result = findValueByPath((Map<String, Object>) item, pathElements, currentIndex + 1);
                    if (result != null) {
                        return result;
                    }
                }
            }
        }

        return null;
    }

    /**
     * 检查是否应该创建父节点
     */
    private boolean shouldCreateParent(Long parentId, List<ElementMetadata> metaList, Map<String, Object> data) {
        for (ElementMetadata meta : metaList) {
            if (meta.getFid().equals(parentId)) {
                if (meta.getFfixedValue() != null && !meta.getFfixedValue().isEmpty()) {
                    return true;
                }
                if (hasJsonValueByXPath(data, meta.getFxpath(), meta.getFelementName())) {
                    return true;
                }
                if (meta.getFparentId() == null) { // 根节点
                    return true;
                }
                break;
            }
        }
        return false;
    }

    /**
     * 从xpath中提取元素名称（用于创建XML标签）
     */
    private String getElementNameFromXPath(String xpath) {
        if (xpath == null || xpath.isEmpty()) {
            return "Unknown";
        }
        // 处理带命名空间的xpath，如"/Invoice/cbc:UBLVersionID"或"@schemeID"
        String elementName = xpath;

        // 如果是属性路径（以@开头），移除@
        if (elementName.startsWith("@")) {
            elementName = elementName.substring(1);
        }

        // 如果包含路径分隔符，取最后一段
        if (elementName.contains("/")) {
            String[] parts = elementName.split("/");
            elementName = parts[parts.length - 1];
        }

        // 移除命名空间前缀，如"cbc:UBLVersionID" -> "UBLVersionID"
        if (elementName.contains(":")) {
            elementName = elementName.substring(elementName.indexOf(":") + 1);
        }

        return elementName;
    }

    /**
     * 从xpath中提取元素名称
     */
    private String getElementName(String xpath) {
        if (xpath == null || xpath.isEmpty()) {
            return "Unknown";
        }
        // 处理带命名空间的xpath，如"/Invoice/cbc:UBLVersionID"
        String[] parts = xpath.split("/");
        if (parts.length > 0) {
            String lastPart = parts[parts.length - 1];
            // 移除命名空间前缀，如"cbc:UBLVersionID" -> "UBLVersionID"
            if (lastPart.contains(":")) {
                return lastPart.substring(lastPart.indexOf(":") + 1);
            }
            return lastPart;
        }
        return xpath;
    }

    /**
     * 检查JSON中是否有对应的属性值
     */
    private boolean hasJsonAttribute(Map<String, Object> data, ElementMetadata meta) {
        return getJsonAttributeValue(data, meta) != null;
    }

    /**
     * 获取JSON中的属性值
     */
    private String getJsonAttributeValue(Map<String, Object> data, ElementMetadata meta) {
        // 获取父元素的xpath
        String parentXPath = getParentXPath(meta.getFxpath());
        String parentElementName = getElementName(parentXPath);

        // 首先根据父元素的xpath路径查找父对象
        Object parentObj = null;
        if (parentXPath != null && !parentXPath.isEmpty()) {
            parentObj = getJsonValueByXPath(data, parentXPath, parentElementName);
        } else {
            // 如果没有xpath，使用传统方式
            parentObj = findJsonValueRecursive(data, parentElementName);
        }

        if (parentObj instanceof Map) {
            Map<String, Object> parentMap = (Map<String, Object>) parentObj;
            if (parentMap.containsKey(meta.getFelementName())) {
                return String.valueOf(parentMap.get(meta.getFelementName()));
            }
        }

        return null;
    }

    /**
     * 从属性xpath中获取父元素的xpath
     */
    private String getParentXPath(String xpath) {
        if (xpath != null && xpath.contains("/@")) {
            return xpath.substring(0, xpath.lastIndexOf("/@"));
        }
        return null;
    }

    /**
     * 从对象中提取元素值
     */
    private String extractElementValue(Object jsonValue, String elementName) {
        if (jsonValue == null) {
            return null;
        }

        // 如果是Map对象，尝试获取指定字段或value字段
        if (jsonValue instanceof Map) {
            Map<String, Object> objMap = (Map<String, Object>) jsonValue;
            if (objMap.containsKey(elementName)) {
                //return String.valueOf(objMap.get(elementName));
                return null;
            } else if (objMap.containsKey("value")) {
                return String.valueOf(objMap.get("value"));
            } else {
                // 如果没有匹配的字段，返回第一个非null值
                for (Object value : objMap.values()) {
                    if (value != null) {
                        return String.valueOf(value);
                    }
                }
            }
        } else {
            // 直接返回字符串值
            return String.valueOf(jsonValue);
        }

        return null;
    }
} 