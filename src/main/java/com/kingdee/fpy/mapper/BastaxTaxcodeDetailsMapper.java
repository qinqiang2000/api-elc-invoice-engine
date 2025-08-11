package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BastaxTaxcodeDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BastaxTaxcodeDetailsMapper接口
 * 自动生成，请勿手动修改
 */
@Mapper
public interface BastaxTaxcodeDetailsMapper {

    /**
     * 根据主键查询
     */
    BastaxTaxcodeDetails selectByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 查询所有记录
     */
    List<BastaxTaxcodeDetails> selectAll();

    /**
     * 根据条件查询
     */
    List<BastaxTaxcodeDetails> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BastaxTaxcodeDetails record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BastaxTaxcodeDetails record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BastaxTaxcodeDetails record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BastaxTaxcodeDetails record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("entryid") Long entryid);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);

}
