package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.RuleLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * RuleLog Mapper接口
 */
@Mapper
public interface RuleLogMapper {

    /**
     * 插入一条记录
     * @param ruleLog RuleLog实体
     * @return 影响行数
     */
    int insert(RuleLog ruleLog);

    /**
     * 根据ID更新记录
     * @param ruleLog RuleLog实体
     * @return 影响行数
     */
    int updateById(RuleLog ruleLog);

    /**
     * 根据ID删除记录
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 根据ID查询记录
     * @param id 主键ID
     * @return RuleLog实体
     */
    RuleLog selectById(Long id);

    /**
     * 查询所有记录
     * @return RuleLog实体列表
     */
    List<RuleLog> selectAll();

    void insertBatch(List<RuleLog> ruleLogs);
}