package com.kingdee.fpy.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

/**
 * XML与JSON互转工具类
 * <p>
 * 支持任意复杂结构的XML与JSON互转，包括嵌套、属性、数组等。
 * 使用DOM方式实现，依赖Jackson进行JSON处理。
 * </p>
 *
 * @author
 */
public class XmlJsonConverter {
    private static final Logger logger = LoggerFactory.getLogger(XmlJsonConverter.class);
    private static final ObjectMapper JSON_MAPPER = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private XmlJsonConverter() {
        // 工具类禁止实例化
    }

    /**
     * 将XML字符串转换为JSON字符串。
     * 支持复杂嵌套、属性、文本内容等。
     *
     * @param xmlString XML字符串
     * @return JSON字符串
     */
    public static String xmlToJson(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(
                    new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8))
            );
            String json = convertDomToJson(document.getDocumentElement());
            // 格式化JSON
            return formatJson(json);
        } catch (Exception e) {
            logger.error("XML转JSON失败: {}", e.getMessage(), e);
            throw new RuntimeException("XML转JSON失败", e);
        }
    }

    /**
     * 将JSON字符串转换为XML字符串。
     * 支持复杂嵌套、属性、文本内容等。
     *
     * @param jsonString JSON字符串
     * @param rootElementName 根元素名称
     * @return XML字符串
     */
    public static String jsonToXml(String jsonString, String rootElementName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.newDocument();

            // 创建根元素
            org.w3c.dom.Element rootElement = document.createElement(rootElementName);
            document.appendChild(rootElement);

            // 解析JSON并构建DOM
            JsonNode jsonNode = JSON_MAPPER.readTree(jsonString);
            convertJsonToDom(jsonNode, rootElement, document);

            // 转换为字符串
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));

            return writer.toString();
        } catch (Exception e) {
            logger.error("JSON转XML失败: {}", e.getMessage(), e);
            throw new RuntimeException("JSON转XML失败", e);
        }
    }

    /**
     * 将DOM元素递归转换为JSON字符串（内部方法）。
     * @param element DOM元素
     * @return JSON字符串
     */
    private static String convertDomToJson(org.w3c.dom.Element element) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        boolean hasContent = false;

        // 处理属性
        if (element.hasAttributes()) {
            json.append("\"@attributes\":{");
            org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++) {
                org.w3c.dom.Attr attr = (org.w3c.dom.Attr) attributes.item(i);
                if (i > 0) json.append(",");
                json.append("\"").append(attr.getNodeName()).append("\":\"").append(attr.getNodeValue()).append("\"");
            }
            json.append("}");
            hasContent = true;
        }

        // 处理子元素和文本
        org.w3c.dom.NodeList children = element.getChildNodes();
        int elementChildCount = 0;
        for (int i = 0; i < children.getLength(); i++) {
            org.w3c.dom.Node child = children.item(i);
            if (child.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                elementChildCount++;
            }
        }
        int processedElementChild = 0;
        for (int i = 0; i < children.getLength(); i++) {
            org.w3c.dom.Node child = children.item(i);
            if (child.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                if (hasContent) json.append(",");
                json.append("\"").append(child.getNodeName()).append("\":").append(convertDomToJson((org.w3c.dom.Element) child));
                hasContent = true;
                processedElementChild++;
            } else if (child.getNodeType() == org.w3c.dom.Node.TEXT_NODE) {
                String text = child.getNodeValue().trim();
                if (!text.isEmpty()) {
                    if (hasContent) json.append(",");
                    json.append("\"#text\":\"").append(escapeJson(text)).append("\"");
                    hasContent = true;
                }
            }
        }
        json.append("}");
        return json.toString();
    }

    /**
     * 将JSON节点递归转换为DOM元素（内部方法）。
     * @param jsonNode JSON节点
     * @param parentElement 父DOM元素
     * @param document DOM文档
     */
    private static void convertJsonToDom(JsonNode jsonNode, org.w3c.dom.Element parentElement, org.w3c.dom.Document document) {
        if (jsonNode.isObject()) {
            jsonNode.fieldNames().forEachRemaining(fieldName -> {
                JsonNode fieldValue = jsonNode.get(fieldName);
                if ("@attributes".equals(fieldName) && fieldValue.isObject()) {
                    // 处理属性
                    fieldValue.fieldNames().forEachRemaining(attrName -> {
                        parentElement.setAttribute(attrName, fieldValue.get(attrName).asText());
                    });
                } else if ("#text".equals(fieldName)) {
                    // 文本内容
                    parentElement.setTextContent(fieldValue.asText());
                } else {
                    // 子元素
                    if (fieldValue.isArray()) {
                        for (JsonNode arrayElement : fieldValue) {
                            org.w3c.dom.Element childElement = document.createElement(fieldName);
                            parentElement.appendChild(childElement);
                            convertJsonToDom(arrayElement, childElement, document);
                        }
                    } else {
                        org.w3c.dom.Element childElement = document.createElement(fieldName);
                        parentElement.appendChild(childElement);
                        convertJsonToDom(fieldValue, childElement, document);
                    }
                }
            });
        } else if (jsonNode.isArray()) {
            for (JsonNode arrayElement : jsonNode) {
                convertJsonToDom(arrayElement, parentElement, document);
            }
        } else {
            parentElement.setTextContent(jsonNode.asText());
        }
    }

    /**
     * 格式化JSON字符串（内部方法）。
     * @param jsonString 原始JSON字符串
     * @return 格式化后的JSON字符串
     */
    private static String formatJson(String jsonString) {
        try {
            JsonNode jsonNode = JSON_MAPPER.readTree(jsonString);
            return JSON_MAPPER.writeValueAsString(jsonNode);
        } catch (Exception e) {
            logger.error("JSON格式化失败: {}", e.getMessage(), e);
            return jsonString;
        }
    }

    /**
     * 转义JSON中的特殊字符（如换行、引号等）。
     * @param text 原始文本
     * @return 转义后的文本
     */
    private static String escapeJson(String text) {
        return text.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
} 