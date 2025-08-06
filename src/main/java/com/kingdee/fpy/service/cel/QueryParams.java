package com.kingdee.fpy.service.cel;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 金帆
 * @Date: 2025/8/4 16:13
 * @Description:
 */
public class QueryParams {
    private String sql;
    private final Map<String, Object> params = new HashMap<>();

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void addParam(String conditionsColumn, Object value) {
        this.params.put(conditionsColumn,value);
    }
    // getters and setters
}
