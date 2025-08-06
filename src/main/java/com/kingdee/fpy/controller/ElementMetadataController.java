package com.kingdee.fpy.controller;

import com.kingdee.fpy.model.ElementMetadata;
import com.kingdee.fpy.mapper.ElementMetadataMapper;
import com.kingdee.fpy.commom.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/metadata")
public class ElementMetadataController {
    @Autowired
    private ElementMetadataMapper metadataMapper;

    @GetMapping("/fields")
    public Result<List<ElementMetadata>> getAllFields() {
        return new Result<>(metadataMapper.findAll());
    }

    @GetMapping("/fields/by-parent")
    public Result<List<ElementMetadata>> getFieldsByParentId(@RequestParam("parentId") Long parentId) {
        return new Result<>(metadataMapper.findByParentId(parentId));
    }
} 