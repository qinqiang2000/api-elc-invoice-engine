package com.kingdee.fpy.model;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 发票文件实体类
 * 对应表：t_invoice_file
 */
@Data
public class InvoiceFile {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 租户ID
     */
    private String tenantId;
    
    /**
     * 关联ID
     */
    private String relationId;
    
    /**
     * 类型
     */
    private Integer type;
    
    /**
     * 单据类型
     */
    private String documentType;
    
    /**
     * 附件信息
     */
    private String attachments;
    
    /**
     * 文件ID
     */
    private String fileId;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}