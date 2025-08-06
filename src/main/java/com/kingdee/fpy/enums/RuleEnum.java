package com.kingdee.fpy.enums;

/**
 * @Author: 金帆
 * @Date: 2025/8/5 14:22
 * @Description:
 */
public enum RuleEnum {
    // 1校验，2补全
    CHECK(1),
    COMPLETE(2);
    private int value;
    RuleEnum(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static RuleEnum getByValue(int value) {
        for (RuleEnum ruleEnum : RuleEnum.values()) {
            if (ruleEnum.getValue() == value) {
                return ruleEnum;
            }
        }
        return null;
    }

}
