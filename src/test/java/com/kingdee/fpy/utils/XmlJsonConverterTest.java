package com.kingdee.fpy.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * XmlJsonConverter 工具类单元测试
 */
public class XmlJsonConverterTest {

    @Test
    @DisplayName("简单XML转JSON")
    void testSimpleXmlToJson() {
        String xml = "<person><name>Tom</name><age>18</age></person>";
        String json = XmlJsonConverter.xmlToJson(xml);
        Assertions.assertTrue(json.contains("\"name\""));
        Assertions.assertTrue(json.contains("\"Tom\""));
        Assertions.assertTrue(json.contains("\"age\""));
        Assertions.assertTrue(json.contains("18"));
    }

    @Test
    @DisplayName("带属性和文本的XML转JSON")
    void testXmlWithAttributesToJson() {
        String xml = "<book isbn=\"123456\"><title>Java</title><author>John</author></book>";
        String json = XmlJsonConverter.xmlToJson(xml);
        Assertions.assertTrue(json.contains("@attributes"));
        Assertions.assertTrue(json.contains("isbn"));
        Assertions.assertTrue(json.contains("123456"));
        Assertions.assertTrue(json.contains("Java"));
        Assertions.assertTrue(json.contains("John"));
    }

    @Test
    @DisplayName("复杂嵌套XML转JSON")
    void testComplexXmlToJson() {
        String xml = "<company><employees><employee id=\"1\"><name>Alice</name></employee><employee id=\"2\"><name>Bob</name></employee></employees></company>";
        String json = XmlJsonConverter.xmlToJson(xml);
        Assertions.assertTrue(json.contains("Alice"));
        Assertions.assertTrue(json.contains("Bob"));
        Assertions.assertTrue(json.contains("id"));
    }

    @Test
    @DisplayName("简单JSON转XML")
    void testSimpleJsonToXml() {
        String json = "{\"person\":{\"name\":\"Tom\",\"age\":18}}";
        String xml = XmlJsonConverter.jsonToXml(json, "root");
        Assertions.assertTrue(xml.contains("<person>"));
        Assertions.assertTrue(xml.contains("<name>Tom</name>"));
        Assertions.assertTrue(xml.contains("<age>18</age>"));
    }

    @Test
    @DisplayName("带属性和文本的JSON转XML")
    void testJsonWithAttributesToXml() {
        String json = "{\"book\":{\"@attributes\":{\"isbn\":\"123456\"},\"title\":\"Java\",\"author\":\"John\"}}";
        String xml = XmlJsonConverter.jsonToXml(json, "root");
        Assertions.assertTrue(xml.contains("isbn=\"123456\""));
        Assertions.assertTrue(xml.contains("<title>Java</title>"));
        Assertions.assertTrue(xml.contains("<author>John</author>"));
    }

    @Test
    @DisplayName("复杂嵌套JSON转XML")
    void testComplexJsonToXml() {
        String json = "{\"company\":{\"employees\":{\"employee\":[{\"@attributes\":{\"id\":\"1\"},\"name\":\"Alice\"},{\"@attributes\":{\"id\":\"2\"},\"name\":\"Bob\"}]}}}";
        String xml = XmlJsonConverter.jsonToXml(json, "root");
        Assertions.assertTrue(xml.contains("<employee"));
        Assertions.assertTrue(xml.contains("id=\"1\""));
        Assertions.assertTrue(xml.contains("id=\"2\""));
        Assertions.assertTrue(xml.contains("Alice"));
        Assertions.assertTrue(xml.contains("Bob"));
    }

    @Test
    @DisplayName("XML与JSON互转一致性")
    void testXmlJsonRoundTrip() {
        String xml = "<user><id>100</id><name>张三</name><roles><role>admin</role><role>user</role></roles></user>";
        String json = XmlJsonConverter.xmlToJson(xml);
        String xml2 = XmlJsonConverter.jsonToXml(json, "user");
        Assertions.assertTrue(xml2.contains("<id>100</id>"));
        Assertions.assertTrue(xml2.contains("<name>张三</name>"));
        Assertions.assertTrue(xml2.contains("<role>admin</role>"));
        Assertions.assertTrue(xml2.contains("<role>user</role>"));
    }
} 