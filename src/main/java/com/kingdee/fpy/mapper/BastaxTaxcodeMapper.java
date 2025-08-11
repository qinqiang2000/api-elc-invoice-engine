package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BastaxTaxcode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BastaxTaxcodeMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface BastaxTaxcodeMapper {

    /**
     * 根据主键查询
     */
    BastaxTaxcode selectByPrimaryKey(@Param("id") Long id);

    /**
     * 查询所有记录
     */
    List<BastaxTaxcode> selectAll();

    /**
     * 根据条件查询
     */
    List<BastaxTaxcode> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BastaxTaxcode record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BastaxTaxcode record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BastaxTaxcode record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BastaxTaxcode record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
