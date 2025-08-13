package com.kingdee.fpy.client.rpa.dto.response;

import com.kingdee.fpy.client.rpa.dto.common.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 参与方查询响应
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PartyQueryResponse extends BaseResponse {
    
    /**
     * 响应数据
     */
    private PartyQueryData data;
    
    @Data
    public static class PartyQueryData {
        
        /**
         * 税务状态
         */
        private String taxStatus;
        
        /**
         * 标识符类型
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
        
        /**
         * 国家代码
         */
        private String countryCode;
        
        /**
         * 地址
         */
        private String address;
        
        /**
         * 城市
         */
        private String city;
        
        /**
         * 邮政编码
         */
        private String postalCode;
    }
}