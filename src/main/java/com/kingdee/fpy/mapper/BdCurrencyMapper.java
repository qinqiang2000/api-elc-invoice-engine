package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BdCurrency;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BdCurrencyMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface BdCurrencyMapper {

    /**
     * 根据主键查询
     */
    BdCurrency selectByPrimaryKey(@Param("id") Long id);

    /**
     * 查询所有记录
     */
    List<BdCurrency> selectAll();

    /**
     * 根据条件查询
     */
    List<BdCurrency> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BdCurrency record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BdCurrency record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BdCurrency record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BdCurrency record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
