package com.kingdee.fpy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * @Author: 金帆
 * @Date: 2025/8/11 14:34
 * @Description:
 */
@Data
public class MetadataNode {
    private Long id;
    private String name;
    private Integer elementType; // 1=元素, 2=属性
    private String dataType;
    private String namespace;
    private String xpath;
    private String fixedValue;
    private Integer minOccurs;
    private Integer maxOccurs;
    private MetadataNode parent;
    private List<MetadataNode> children = new ArrayList<>();

    public MetadataNode(ElementMetadata metadata) {
        this.id = metadata.getFid();
        this.name = metadata.getFelementName();
        this.elementType = metadata.getFelementType();
        this.dataType = metadata.getFdataType();
        this.namespace = metadata.getFnameSpace();
        this.minOccurs = metadata.getFminOccurs();
        this.maxOccurs = metadata.getFmaxOccurs();
        this.xpath = metadata.getFxpath();
        this.fixedValue = metadata.getFfixedValue();
    }

    // 添加子节点并排序
    public void addChild(MetadataNode child) {
        child.setParent(this);
        this.children.add(child);
        this.children.sort((a, b) -> (int) (a.getId() - b.getId()));
    }

    @Override
    public String toString() {
        return "MetadataNode{" + "id=" + id + ", name='" + name + '\'' + ", elementType=" + elementType + ", dataType='"
                + dataType + '\'' + ", namespace='" + namespace + '\'' + ", minOccurs=" + minOccurs + ", maxOccurs="
                + maxOccurs + ", parent=" + parent + '}';
    }
}
