package com.kingdee.fpy.enums;

/**
 * 规则状态枚举
 * 1草稿 2测试通过 3已发布 4启用 5停用
 */
public enum RuleStatus {
    
    DRAFT(1, "Draft", "草稿"),
    TEST_PASSED(2, "TestPassed", "测试通过"), 
    PUBLISHED(3, "Published", "已发布"),
    ENABLED(4, "Enabled", "启用"),
    DISABLED(5, "Disabled", "停用");
    
    private final Integer code;
    private final String status;
    private final String description;
    
    RuleStatus(Integer code, String status, String description) {
        this.code = code;
        this.status = status;
        this.description = description;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getDescription() {
        return description;
    }
    
    /**
     * 根据状态码获取枚举值
     * @param code 状态码
     * @return 枚举值
     */
    public static RuleStatus fromCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (RuleStatus status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown rule status code: " + code);
    }
    
    /**
     * 根据状态名称获取枚举值
     * @param status 状态名称
     * @return 枚举值
     */
    public static RuleStatus fromStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            return null;
        }
        for (RuleStatus ruleStatus : values()) {
            if (ruleStatus.getStatus().equalsIgnoreCase(status)) {
                return ruleStatus;
            }
        }
        throw new IllegalArgumentException("Unknown rule status: " + status);
    }
    
    /**
     * 判断是否为激活状态（草稿、测试通过、已发布、启用）
     * @return true表示激活状态
     */
    public boolean isActive() {
        return this == DRAFT || this == TEST_PASSED || this == PUBLISHED || this == ENABLED;
    }
    
    /**
     * 判断是否为工作流状态（草稿、测试通过、已发布）
     * @return true表示工作流状态
     */
    public boolean isWorkflowStatus() {
        return this == DRAFT || this == TEST_PASSED || this == PUBLISHED;
    }
    
    /**
     * 判断是否为操作状态（启用、停用）
     * @return true表示操作状态
     */
    public boolean isOperationalStatus() {
        return this == ENABLED || this == DISABLED;
    }
}