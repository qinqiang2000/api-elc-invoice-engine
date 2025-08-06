package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.ElementMetadata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ElementMetadataMapper {
    int insert(ElementMetadata metadata);
    ElementMetadata findById(@Param("id") Long id);
    int update(ElementMetadata metadata);
    int deleteById(@Param("id") Long id);
    List<ElementMetadata> findAll();
    List<ElementMetadata> findByParentId(@Param("parentId") Long parentId);
} 