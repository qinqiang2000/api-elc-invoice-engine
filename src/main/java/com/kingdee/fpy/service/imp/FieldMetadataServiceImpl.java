package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.FieldMetadataMapper;
import com.kingdee.fpy.model.FieldMetadata;
import com.kingdee.fpy.service.FieldMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FieldMetadata服务实现类
 */
@Service
public class FieldMetadataServiceImpl implements FieldMetadataService {

    @Autowired
    private FieldMetadataMapper fieldMetadataMapper;

    @Override
    public int insert(FieldMetadata fieldMetadata) {
        return fieldMetadataMapper.insert(fieldMetadata);
    }

    @Override
    public int updateById(FieldMetadata fieldMetadata) {
        return fieldMetadataMapper.updateById(fieldMetadata);
    }

    @Override
    public int deleteById(Long id) {
        return fieldMetadataMapper.deleteById(id);
    }

    @Override
    public FieldMetadata selectById(Long id) {
        return fieldMetadataMapper.selectById(id);
    }

    @Override
    public List<FieldMetadata> selectAll() {
        return fieldMetadataMapper.selectAll();
    }
}