package com.kingdee.fpy.ai.rules;

/**
 * 规则生成类型枚举
 * 用于控制AI生成规则时的输出内容
 */
public enum GenerationType {
    /**
     * 生成完整规则（默认）
     * 包含fieldPath、applyTo、ruleExpression等所有字段
     */
    FULL,
    
    /**
     * 仅生成规则表达式
     * 主要生成fieldPath和ruleExpression，applyTo为空
     * 适用于先确定核心业务逻辑和目标字段的场景
     */
    RULE_EXPRESSION_ONLY,
    
    /**
     * 仅生成应用条件
     * 主要生成applyTo，要求fieldPath已确定
     * 适用于基于已知fieldPath生成触发条件的场景
     */
    APPLY_TO_ONLY
}