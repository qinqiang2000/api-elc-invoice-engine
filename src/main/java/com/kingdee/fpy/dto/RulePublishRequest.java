package com.kingdee.fpy.dto;

import lombok.Data;
import java.util.List;

/**
 * 规则发布请求DTO
 * 用于批量发布发票规则
 */
@Data
public class RulePublishRequest {
    
    /**
     * 规则编码列表，支持批量发布多个规则
     */
    private List<String> ruleCodes;
    
    /**
     * 规则版本号，由用户输入
     */
    private String version;
    
}