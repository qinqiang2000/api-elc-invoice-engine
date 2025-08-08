package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.SecUserposition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * SecUserpositionMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface SecUserpositionMapper {

    /**
     * 根据主键查询
     */
    SecUserposition selectByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 查询所有记录
     */
    List<SecUserposition> selectAll();

    /**
     * 根据条件查询
     */
    List<SecUserposition> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(SecUserposition record);

    /**
     * 选择性插入记录
     */
    int insertSelective(SecUserposition record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(SecUserposition record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(SecUserposition record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
