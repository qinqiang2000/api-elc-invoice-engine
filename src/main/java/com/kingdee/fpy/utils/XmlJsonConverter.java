package com.kingdee.fpy.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * XML与JSON互转工具类
 */
public class XmlJsonConverter {
    private static final Logger logger = LoggerFactory.getLogger(XmlJsonConverter.class);
    private static final ObjectMapper JSON_MAPPER = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private XmlJsonConverter() {}

    public static String xmlToJson(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(
                    new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8))
            );
            ObjectNode node = convertElementToJsonNode(document.getDocumentElement());
            return JSON_MAPPER.writeValueAsString(node);
        } catch (Exception e) {
            logger.error("XML转JSON失败: {}", e.getMessage(), e);
            throw new RuntimeException("XML转JSON失败", e);
        }
    }

    public static String jsonToXml(String jsonString, String rootElementName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.newDocument();

            org.w3c.dom.Element rootElement = document.createElement(rootElementName);
            document.appendChild(rootElement);

            JsonNode jsonNode = JSON_MAPPER.readTree(jsonString);
            convertJsonToDom(jsonNode, rootElement, document);

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

    private static ObjectNode convertElementToJsonNode(org.w3c.dom.Element element) {
        ObjectNode obj = JSON_MAPPER.createObjectNode();

        // attributes
        if (element.hasAttributes()) {
            ObjectNode attrs = JSON_MAPPER.createObjectNode();
            org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++) {
                org.w3c.dom.Attr attr = (org.w3c.dom.Attr) attributes.item(i);
                attrs.put(attr.getNodeName(), attr.getNodeValue());
            }
            obj.set("@attributes", attrs);
        }

        // group child elements by name
        org.w3c.dom.NodeList children = element.getChildNodes();
        Map<String, List<org.w3c.dom.Element>> nameToElements = new HashMap<>();
        StringBuilder textBuilder = new StringBuilder();

        for (int i = 0; i < children.getLength(); i++) {
            org.w3c.dom.Node child = children.item(i);
            if (child.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                org.w3c.dom.Element childElem = (org.w3c.dom.Element) child;
                nameToElements.computeIfAbsent(childElem.getNodeName(), k -> new ArrayList<>()).add(childElem);
            } else if (child.getNodeType() == org.w3c.dom.Node.TEXT_NODE) {
                String text = child.getNodeValue();
                if (text != null) {
                    textBuilder.append(text.trim());
                }
            }
        }

        // add element children
        for (Map.Entry<String, List<org.w3c.dom.Element>> entry : nameToElements.entrySet()) {
            String name = entry.getKey();
            List<org.w3c.dom.Element> elems = entry.getValue();
            if (elems.size() == 1) {
                obj.set(name, convertElementToJsonNode(elems.get(0)));
            } else {
                ArrayNode arr = JSON_MAPPER.createArrayNode();
                for (org.w3c.dom.Element e : elems) {
                    arr.add(convertElementToJsonNode(e));
                }
                obj.set(name, arr);
            }
        }

        // add text if present
        if (textBuilder.length() > 0) {
            obj.put("#text", textBuilder.toString());
        }

        return obj;
    }

    private static void convertJsonToDom(JsonNode jsonNode, org.w3c.dom.Element parentElement, org.w3c.dom.Document document) {
        if (jsonNode.isObject()) {
            jsonNode.fieldNames().forEachRemaining(fieldName -> {
                JsonNode fieldValue = jsonNode.get(fieldName);
                if ("@attributes".equals(fieldName) && fieldValue.isObject()) {
                    fieldValue.fieldNames().forEachRemaining(attrName -> {
                        parentElement.setAttribute(attrName, fieldValue.get(attrName).asText());
                    });
                } else if ("#text".equals(fieldName)) {
                    parentElement.setTextContent(fieldValue.asText());
                } else {
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
} 