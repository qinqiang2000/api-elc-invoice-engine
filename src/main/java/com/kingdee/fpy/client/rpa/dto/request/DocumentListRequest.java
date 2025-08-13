package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 文档列表查询请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DocumentListRequest {
    
    /**
     * 方向（SEND - 发送, RECEIVED - 接收）
     */
    private String direction;
    
    /**
     * 开始更新时间（格式：2023-01-01T10:00:00Z）
     */
    private String startUpdateTime;
    
    /**
     * 结束更新时间（格式：2023-01-02T10:00:00Z）
     */
    private String endUpdateTime;
    
    /**
     * 文档类型
     * Order - 订单
     * GoodReceipt - 收货单
     * Invoice - 发票
     * InvoiceResponse - 发票响应
     */
    private String documentType;
    
    /**
     * 游标（用于分页）
     */
    private Integer cursor;
    
    /**
     * 限制数量（最大500）
     */
    private Integer limit;
}