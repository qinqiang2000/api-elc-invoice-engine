package com.kingdee.fpy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * SecUsercontact实体类
 * 对应数据库表：t_sec_usercontact
 * 自动生成，请勿手动修改
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SecUsercontact {

    private Long entryid;

    private Long id;

    /**
     * 分录行号
     */
    private Long seq;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 类型
     */
    private Long contacttypeid;

    /**
     * 默认
     */
    private String isdefault;

}
