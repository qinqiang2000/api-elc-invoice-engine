package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BastaxTaxcodeTaxrate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BastaxTaxcodeTaxrateMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface BastaxTaxcodeTaxrateMapper {

    /**
     * 根据主键查询
     */
    BastaxTaxcodeTaxrate selectByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 查询所有记录
     */
    List<BastaxTaxcodeTaxrate> selectAll();

    /**
     * 根据条件查询
     */
    List<BastaxTaxcodeTaxrate> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BastaxTaxcodeTaxrate record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BastaxTaxcodeTaxrate record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BastaxTaxcodeTaxrate record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BastaxTaxcodeTaxrate record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
