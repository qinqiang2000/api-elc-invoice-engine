package com.kingdee.fpy.service;

import com.kingdee.fpy.model.FieldMetadata;
import java.util.List;

/**
 * FieldMetadata服务接口
 */
public interface FieldMetadataService {

    /**
     * 插入一条记录
     * @param fieldMetadata FieldMetadata实体
     * @return 影响行数
     */
    int insert(FieldMetadata fieldMetadata);

    /**
     * 根据ID更新记录
     * @param fieldMetadata FieldMetadata实体
     * @return 影响行数
     */
    int updateById(FieldMetadata fieldMetadata);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return FieldMetadata实体
     */
    FieldMetadata selectById(Long id);

    /**
     * 查询所有记录
     * @return FieldMetadata实体列表
     */
    List<FieldMetadata> selectAll();
}