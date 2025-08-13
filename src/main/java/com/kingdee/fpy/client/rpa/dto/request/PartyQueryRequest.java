package com.kingdee.fpy.client.rpa.dto.request;

import lombok.Data;

/**
 * 参与方查询请求
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
public class PartyQueryRequest {
    
    /**
     * 请求ID
     */
    private String requestId;
    
    /**
     * 查询数据
     */
    private PartyQueryData data;
    
    /**
     * 噪声值
     */
    private String noise;
    
    /**
     * 签名值
     */
    private String sign;
    
    @Data
    public static class PartyQueryData {
        
        /**
         * 国家代码
         */
        private String countryCode;
        
        /**
         * 标识符类型
         * MY: NRIC, PASSPORT, BRN, ARMY
         * SG: GST, UEN, NRIC
         * EU: VAT
         */
        private String identifierType;
        
        /**
         * 标识符值
         */
        private String identifierValue;
        
        /**
         * 纳税人名称
         */
        private String taxpayerName;
    }
}