package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BastaxTaxareagroupL;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BastaxTaxareagroupLMapper接口
 * 数据访问层，提供BastaxTaxareagroupL的CRUD操作
 *
 * @author CodeGenerator
 * @version 1.0
 * @since 2025-08-13
 * @description 自动生成的Mapper接口，请勿手动修改
 */
@Mapper
public interface BastaxTaxareagroupLMapper {

    /**
     * 根据主键查询
     */
    BastaxTaxareagroupL selectByPrimaryKey(@Param("pkid") String pkid);

    /**
     * 查询所有记录
     */
    List<BastaxTaxareagroupL> selectAll();

    /**
     * 根据条件查询
     */
    List<BastaxTaxareagroupL> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BastaxTaxareagroupL record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BastaxTaxareagroupL record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BastaxTaxareagroupL record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BastaxTaxareagroupL record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("pkid") String pkid);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<String> ids);

}
