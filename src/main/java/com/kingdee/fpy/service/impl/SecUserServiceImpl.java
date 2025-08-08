package com.kingdee.fpy.service.impl;

import cn.hutool.core.util.IdUtil;
import com.kingdee.fpy.mapper.SecUserMapper;
import com.kingdee.fpy.model.SecUser;
import com.kingdee.fpy.service.SecUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * SecUser服务实现类
 * 自动生成，请勿手动修改
 */
@Slf4j
@Service
@Transactional
public class SecUserServiceImpl implements SecUserService {

    @Autowired
    private SecUserMapper secUserMapper;

    @Override
    public SecUser selectByPrimaryKey(Long id) {
        log.debug("根据主键查询用户，ID：{}", id);
        return secUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SecUser> selectAll() {
        log.debug("查询所有用户");
        return secUserMapper.selectAll();
    }

    @Override
    public List<SecUser> selectByCondition(Map<String, Object> condition) {
        log.debug("根据条件查询用户，条件：{}", condition);
        return secUserMapper.selectByCondition(condition);
    }

    @Override
    public int countByCondition(Map<String, Object> condition) {
        log.debug("根据条件统计用户数量，条件：{}", condition);
        return secUserMapper.countByCondition(condition);
    }

    @Override
    public int insert(SecUser record) {
        log.debug("插入用户记录：{}", record);
        return secUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SecUser record) {
        log.debug("选择性插入用户记录：{}", record);
        record.setId(IdUtil.getSnowflake().nextId());
        return secUserMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(SecUser record) {
        log.debug("根据主键更新用户：{}", record);
        return secUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SecUser record) {
        log.debug("根据主键选择性更新用户：{}", record);
        return secUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        log.debug("根据主键删除用户，ID：{}", id);
        return secUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        log.debug("批量删除用户，IDs：{}", ids);
        return secUserMapper.deleteByIds(ids);
    }

    @Override
    public SecUser insertAndSelect(SecUser record) {
        log.debug("插入用户并返回完整信息：{}", record);

        // 插入记录
        int result = secUserMapper.insert(record);
        if (result > 0 && record.getId() != null) {
            // 插入成功后，根据主键查询完整信息
            return secUserMapper.selectByPrimaryKey(record.getId());
        }

        log.warn("插入用户失败或未获取到主键，记录：{}", record);
        return null;
    }

    @Override
    public SecUser insertSelectiveAndSelect(SecUser record) {
        log.debug("选择性插入用户并返回完整信息：{}", record);

        // 选择性插入记录
        int result = secUserMapper.insertSelective(record);
        if (result > 0 && record.getId() != null) {
            // 插入成功后，根据主键查询完整信息
            return secUserMapper.selectByPrimaryKey(record.getId());
        }

        log.warn("选择性插入用户失败或未获取到主键，记录：{}", record);
        return null;
    }
}