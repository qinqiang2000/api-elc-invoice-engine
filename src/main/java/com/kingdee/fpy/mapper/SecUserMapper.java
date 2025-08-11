package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.SecUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * SecUserMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface SecUserMapper {

    /**
     * 根据主键查询
     */
    SecUser selectByPrimaryKey(@Param("id") Long id);

    /**
     * 查询所有记录
     */
    List<SecUser> selectAll();

    /**
     * 根据条件查询
     */
    List<SecUser> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(SecUser record);

    /**
     * 选择性插入记录
     */
    int insertSelective(SecUser record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(SecUser record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(SecUser record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
