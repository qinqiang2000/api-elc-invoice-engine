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
            
            // 先创建所有需要的元素节点（只有当JSON中有对应数据或有固定值时才创建）
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 1){ continue;} // 只处理元素
                
                // 检查是否应该创建此元素
                boolean shouldCreate = false;
                String value = null;
                
                // 1. 如果有固定值，总是创建
                if (meta.getFfixedValue() != null && !meta.getFfixedValue().isEmpty()) {
                    value = meta.getFfixedValue();
                    shouldCreate = true;
                } 
                // 2. 如果JSON中有对应的数据，创建元素
                else if (hasJsonValueByXPath(data, meta.getFxpath(), meta.getFelementName())) {
                    Object jsonValue = getJsonValueByXPath(data, meta.getFxpath(), meta.getFelementName());
                    if (jsonValue != null) {
                        // 处理复杂对象（如带有value属性的对象）
                        if (jsonValue instanceof Map) {
                            Map<String, Object> objMap = (Map<String, Object>) jsonValue;
                            if (objMap.containsKey("value")) {
                                value = String.valueOf(objMap.get("value"));
                            }
                        } else {
                            value = String.valueOf(jsonValue);
                        }
                        shouldCreate = true;
                    }
                }
                // 3. 如果是根节点，必须创建
                else if (meta.getFparentId() == null) {
                    shouldCreate = true;
                }
                // 4. 如果是必需的元素且父节点存在，也要创建
                else if (meta.getFisRequired() != null && meta.getFisRequired() == 1) {
                    // 检查父节点是否会被创建
                    if (shouldCreateParent(meta.getFparentId(), metaList, data)) {
                        shouldCreate = true;
                    }
                }
                
                if (shouldCreate) {
                    Element elem = doc.createElement(getElementName(meta.getFxpath()));
                    if (value != null && !value.trim().isEmpty()) {
                        elem.setTextContent(value);
                    }
                    idElementMap.put(meta.getFid(), elem);
                    
                    if (meta.getFparentId() == null) {
                        root = elem;
                        doc.appendChild(root);
                    }
                }
            }
            
            // 再组装父子关系
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 1) {continue;}
                if (meta.getFparentId() != null) {
                    Element parent = idElementMap.get(meta.getFparentId());
                    Element child = idElementMap.get(meta.getFid());
                    if (parent != null && child != null && child != root) {
                        parent.appendChild(child);
                    }
                }
            }
            
            // 设置属性（只有当JSON中有对应数据或有固定值时才设置）
            for (ElementMetadata meta : metaList) {
                if (meta.getFelementType() != 2){ continue; }// 只处理属性
                Element parent = idElementMap.get(meta.getFparentId());
                if (parent != null) {
                    String value = null;
                    if (meta.getFfixedValue() != null && !meta.getFfixedValue().isEmpty()) {
                        value = meta.getFfixedValue();
                    } else if (hasJsonAttribute(data, meta)) {
                        value = getJsonAttributeValue(data, meta);
                    }
                    if (value != null && !value.trim().isEmpty()) {
                        parent.setAttribute(meta.getFelementName(), value);
                    }
                }
            }
            
            // 输出XML字符串
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            java.io.StringWriter writer = new java.io.StringWriter();
            transformer.transform(new javax.xml.transform.dom.DOMSource(doc), new javax.xml.transform.stream.StreamResult(writer));
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("XML生成失败: " + e.getMessage(), e);
        }
    }
    
    /**
     * 检查JSON中是否有对应的值（基于xpath路径）
     */
    private boolean hasJsonValue(Map<String, Object> data, String elementName) {
        return getJsonValueByPath(data, elementName) != null;
    }
    
    /**
     * 获取JSON中的值（基于xpath路径）
     */
    private Object getJsonValue(Map<String, Object> data, String elementName) {
        return getJsonValueByPath(data, elementName);
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
} 