package com.kingdee.fpy.service;

import com.kingdee.fpy.model.SecUser;
import java.util.List;
import java.util.Map;

/**
 * SecUser服务接口
 * 自动生成，请勿手动修改
 */
public interface SecUserService {

    /**
     * 根据主键查询
     * @param id 主键ID
     * @return 用户信息
     */
    SecUser selectByPrimaryKey(Long id);

    /**
     * 查询所有记录
     * @return 用户列表
     */
    List<SecUser> selectAll();

    /**
     * 根据条件查询
     * @param condition 查询条件
     * @return 用户列表
     */
    List<SecUser> selectByCondition(Map<String, Object> condition);

    /**
     * 根据条件统计数量
     * @param condition 查询条件
     * @return 记录数量
     */
    int countByCondition(Map<String, Object> condition);

    /**
     * 插入记录
     * @param record 用户信息
     * @return 影响行数
     */
    int insert(SecUser record);

    /**
     * 选择性插入记录
     * @param record 用户信息
     * @return 影响行数
     */
    int insertSelective(SecUser record);

    /**
     * 根据主键更新
     * @param record 用户信息
     * @return 影响行数
     */
    int updateByPrimaryKey(SecUser record);

    /**
     * 根据主键选择性更新
     * @param record 用户信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(SecUser record);

    /**
     * 根据主键删除
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 批量删除
     * @param ids 主键ID列表
     * @return 影响行数
     */
    int deleteByIds(List<Long> ids);

    /**
     * 插入用户并返回插入后的完整信息
     * @param record 用户信息
     * @return 插入后的完整用户信息
     */
    SecUser insertAndSelect(SecUser record);

    /**
     * 选择性插入用户并返回插入后的完整信息
     * @param record 用户信息
     * @return 插入后的完整用户信息
     */
    SecUser insertSelectiveAndSelect(SecUser record);
}