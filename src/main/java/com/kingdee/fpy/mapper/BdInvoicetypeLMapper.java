package com.kingdee.fpy.mapper;

import com.kingdee.fpy.model.BdInvoicetypeL;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * BdInvoicetypeLMapper接口
 * 数据访问层，提供BdInvoicetypeL的CRUD操作
 *
 * @author CodeGenerator
 * @version 1.0
 * @since 2025-08-11
 * @description 自动生成的Mapper接口，请勿手动修改
 */
@Mapper
public interface BdInvoicetypeLMapper {

    /**
     * 根据主键查询
     */
    BdInvoicetypeL selectByPrimaryKey(@Param("pkid") String pkid);

    /**
     * 查询所有记录
     */
    List<BdInvoicetypeL> selectAll();

    /**
     * 根据条件查询
     */
    List<BdInvoicetypeL> selectByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件统计数量
     */
    int countByCondition(@Param("condition") Map<String, Object> condition);

    /**
     * 插入记录
     */
    int insert(BdInvoicetypeL record);

    /**
     * 选择性插入记录
     */
    int insertSelective(BdInvoicetypeL record);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(BdInvoicetypeL record);

    /**
     * 根据主键选择性更新
     */
    int updateByPrimaryKeySelective(BdInvoicetypeL record);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(@Param("pkid") String pkid);

    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<String> ids);

}
