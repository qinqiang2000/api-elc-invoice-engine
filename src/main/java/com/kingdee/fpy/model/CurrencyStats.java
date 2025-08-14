package com.kingdee.fpy.model;

import lombok.Data;
import java.math.BigDecimal;

/**
 * 币种统计结果实体类
 */
@Data
public class CurrencyStats {
    
    /**
     * 币种代码
     */
    private String currency;
    
    /**
     * 总金额
     */
    private BigDecimal totalAmount;
    
    /**
     * 税额
     */
    private BigDecimal taxAmount;
    
    public CurrencyStats() {}
    
    public CurrencyStats(String currency, BigDecimal totalAmount, BigDecimal taxAmount) {
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
    }
}