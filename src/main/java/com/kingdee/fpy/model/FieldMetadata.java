package com.kingdee.fpy.model;

import lombok.Data;
import java.util.Date;

/**
 * XML标签元数据实体类
 */
@Data
public class FieldMetadata {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 标签名
     */
    private String fieldName;

    /**
     * 元素类型1元素，2属性
     */
    private Integer fieldType;

    /**
     * 层级，根节点为1
     */
    private Integer level;

    /**
     * 父标签ID，根节点为NULL
     */
    private Long parentId;

    /**
     * 顺序，值越小越靠前
     */
    private Integer order;

    /**
     * 标签的XPath路径
     */
    private String xpath;

    /**
     * 字段路径
     */
    private String fieldPath;

    /**
     * 数据类型（如1.string、2.int、3.date等）
     */
    private Integer dataType;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 描述/注释
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}