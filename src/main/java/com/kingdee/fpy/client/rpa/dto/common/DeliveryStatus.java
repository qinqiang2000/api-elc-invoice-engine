package com.kingdee.fpy.client.rpa.dto.common;

import lombok.Data;
import java.util.List;

/**
 * 投递状态信息
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class DeliveryStatus {
    
    /**
     * 投递方法（EMAIL, SMS等）
     */
    private String method;
    
    /**
     * 投递状态
     * Success - 成功
     * Failure - 失败  
     * In-progress - 进行中
     * NA - 不可用
     * Partial-Success - 部分成功
     */
    private String status;
    
    /**
     * 投递账户（某些API返回）
     */
    private String account;
    
    /**
     * 创建时间（某些API返回）
     */
    private String createTime;
}