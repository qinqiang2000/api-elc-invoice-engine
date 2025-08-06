package com.kingdee.fpy.service.cel;



/**
 * @Author: 金帆
 * @Date: 2025/8/4 13:41
 * @Description:
 */

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DynamicQueryService {
    private final SqlSession sqlSession;

    // 表名和列名安全验证正则
    private static final Pattern SAFE_IDENTIFIER_PATTERN = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$");

    /**
     * 执行动态查询
     * @param tableName 表名
     * @param columns 要查询的列（可选）
     * @param conditions 查询条件（可选）
     * @return 查询结果（单行）
     */
    public Map<String, Object> selectOneRow(String tableName, List<String> columns, Map<String, Object> conditions) {
        // 验证表名安全性
        validateIdentifier(tableName);

        // 构建查询SQL
        String sql = buildSelectSql(tableName, columns, conditions);
        log.info("jexl db SQL: {}", sql);
        // 执行查询
        List<Map<String, Object>> result = sqlSession.selectList("dynamicSelect",
                Collections.singletonMap("sql", sql));
        log.info("jexl db SQL: {}", result);
        return result.isEmpty() ? Collections.emptyMap() : result.get(0);
    }

    public String selectOneField(String tableName, String column, Map<String, Object> conditions) {
        // 验证表名安全性
        validateIdentifier(tableName);

        // 构建查询SQL
        QueryParams queryParams = buildSelectSql(tableName, column, conditions);
        log.info("jexl db SQL: {}", JSON.toJSONString(queryParams));
        // 执行查询
        String  result = sqlSession.selectOne("dynamicSelectOneField",
                queryParams);
        log.info("jexl db result: {}", result);
        /*if(StringUtils.isEmpty(result)){
            throw new JexlException(ResultType.QUERY_FAIL);
        }*/
        return result;
    }

    private QueryParams buildSelectSql(String tableName, String column, Map<String, Object> conditions) {
        QueryParams queryParams = new QueryParams();
        StringBuilder sql = new StringBuilder("SELECT ");
        // 处理列
        if (column == null || column.isEmpty()) {
            sql.append("*");
        } else {
            if (column == null || !SAFE_IDENTIFIER_PATTERN.matcher(column).matches()) {
                throw new IllegalArgumentException("Invalid or unsafe identifier: " + column);
            }
            sql.append(column);
        }
        sql.append(" FROM ").append(tableName);

        int paramIndex = 1;
        // 处理条件
        if (conditions != null && !conditions.isEmpty()) {
            sql.append(" WHERE ");
            List<String> whereClauses = new ArrayList<>();
            for (Map.Entry<String, Object> entry : conditions.entrySet()) {
                String condittionsColumn = entry.getKey();
                validateIdentifier(condittionsColumn);
                // 为每个条件参数创建唯一名称
                String paramName = "param" + paramIndex++;
                whereClauses.add(condittionsColumn + " = #{params." + paramName + "}");

                // 将参数值添加到参数Map
                queryParams.addParam(paramName, entry.getValue());
            }
            sql.append(String.join(" AND ", whereClauses));
        }

        // 限制只返回一行
        sql.append(" LIMIT 1");
        queryParams.setSql(sql.toString());
        return queryParams;
    }

    /**
     * 构建SELECT SQL语句
     */
    private String buildSelectSql(String tableName, List<String> columns, Map<String, Object> conditions) {
        StringBuilder sql = new StringBuilder("SELECT ");

        // 处理列
        if (columns == null || columns.isEmpty()) {
            sql.append("*");
        } else {
            for (String column : columns) {
                validateIdentifier(column);
            }
            sql.append(String.join(", ", columns));
        }

        sql.append(" FROM ").append(tableName);

        // 处理条件
        if (conditions != null && !conditions.isEmpty()) {
            sql.append(" WHERE ");
            List<String> whereClauses = new ArrayList<>();
            for (Map.Entry<String, Object> entry : conditions.entrySet()) {
                String column = entry.getKey();
                validateIdentifier(column);
                whereClauses.add(column + " = #{params." + column + "}");
            }
            sql.append(String.join(" AND ", whereClauses));
        }

        // 限制只返回一行
        sql.append(" LIMIT 1");

        return sql.toString();
    }

    /**
     * 验证标识符安全性
     */
    private void validateIdentifier(String identifier) {
        if (identifier == null || !SAFE_IDENTIFIER_PATTERN.matcher(identifier).matches()) {
            throw new IllegalArgumentException("Invalid or unsafe identifier: " + identifier);
        }
    }

    /**
     * 获取所有表名
     */
    public List<String> getAllTableNames() {
        return sqlSession.selectList("getAllTables");
    }

}