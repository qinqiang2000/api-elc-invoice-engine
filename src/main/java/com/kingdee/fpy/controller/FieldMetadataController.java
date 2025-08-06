package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.model.FieldMetadata;
import com.kingdee.fpy.service.FieldMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FieldMetadata控制器
 */
@RestController
@RequestMapping("/field-metadata")
public class FieldMetadataController {

    @Autowired
    private FieldMetadataService fieldMetadataService;

    /**
     * 插入一条记录
     * @param fieldMetadata FieldMetadata实体
     * @return Result结果
     */
    @PostMapping
    public Result<Integer> insert(@RequestBody FieldMetadata fieldMetadata) {
        int result = fieldMetadataService.insert(fieldMetadata);
        return new Result<>(result);
    }

    /**
     * 根据ID更新记录
     * @param fieldMetadata FieldMetadata实体
     * @return Result结果
     */
    @PutMapping
    public Result<Integer> updateById(@RequestBody FieldMetadata fieldMetadata) {
        int result = fieldMetadataService.updateById(fieldMetadata);
        return new Result<>(result);
    }

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return Result结果
     */
    @DeleteMapping("/{id}")
    public Result<Integer> deleteById(@PathVariable Long id) {
        int result = fieldMetadataService.deleteById(id);
        return new Result<>(result);
    }

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return Result结果
     */
    @GetMapping("/{id}")
    public Result<FieldMetadata> selectById(@PathVariable Long id) {
        FieldMetadata result = fieldMetadataService.selectById(id);
        return new Result<>(result);
    }

    /**
     * 查询所有记录
     * @return Result结果
     */
    @GetMapping
    public Result<List<FieldMetadata>> selectAll() {
        List<FieldMetadata> result = fieldMetadataService.selectAll();
        return new Result<>(result);
    }
}