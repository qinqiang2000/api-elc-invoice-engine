
package com.kingdee.fpy.config.interceptor;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.kingdee.fpy.config.dbconfig.DataSourceContextHolder;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.springframework.stereotype.Component;


@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
})
@Component
@Slf4j
public class PrintSQLInterceptor implements Interceptor {
    public static final String SEPARATOR = System.lineSeparator();

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 拦截sql
        Object target = invocation.getTarget();
        if (target instanceof Executor) {
            return callExecutor(invocation);
        }

        return invocation.proceed();
    }

    @SneakyThrows
    private Object callExecutor(Invocation invocation) {
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];
        BoundSql boundSql;
        if (args.length == 6) {
            //6 个参数时
            boundSql = (BoundSql) args[5];
        } else {
            //4 个参数时
            boundSql = statement.getBoundSql(parameterObject);
        }

        //带占位符的SQL
        String originSql = boundSql.getSql();
        String sql = originSql.replaceAll("[\\s]+", " ");
        if (StringUtils.isBlank(sql)) {
            return invocation.proceed();
        }

        try {
            return doCommonSql(invocation, boundSql);
        } catch (Exception e) {
            printErrorSql(statement, parameterObject, boundSql, sql, e);
            throw e;
        }
    }

    private void printErrorSql(MappedStatement statement, Object parameterObject, BoundSql boundSql, String sql, Exception e) {
       // TenantMode tenantMode = TenantContext.get();
        String readOrWrite = Optional.ofNullable(DataSourceContextHolder.getReadOrWrite()).orElse("defaultWrite");
        //实际执行SQL
        String actualValuesSql = getSql(boundSql, parameterObject, statement.getConfiguration());

        String sb = "(" + JSON.toJSONString("tenantMode") + ") - " +
                readOrWrite + " - " +
                statement.getId() + ":" + SEPARATOR +
                "原始SQL:[" + sql + "]" + SEPARATOR +
                "实际SQL:[" + actualValuesSql + "]";

        log.error(sb, e);
    }

    @SneakyThrows
    private Object doCommonSql(Invocation invocation, BoundSql boundSql) {
        long start = System.currentTimeMillis();
        Object result = invocation.proceed();
        long end = System.currentTimeMillis();

        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];

        printActualSql(boundSql, end - start, statement, parameterObject);

        return result;
    }


    private void printActualSql(BoundSql boundSql, long cost, MappedStatement statement, Object parameterObject) {
        Configuration configuration = statement.getConfiguration();
        //实际执行SQL
        String actualValuesSql = getSql(boundSql, parameterObject, configuration);
        String costTime = cost + "ms";
        String costAlert = cost > 5000 ? "慢SQL " + costTime : costTime;

       // TenantMode tenantMode = TenantContext.get();
        String readOrWrite = Optional.ofNullable(DataSourceContextHolder.getReadOrWrite()).orElse("write");
        log.info("[{}] - {} - 执行SQL - {} : {}SQL信息[{}]{}租户信息[{}]", statement.getId(), readOrWrite, costAlert, SEPARATOR, actualValuesSql, SEPARATOR, "");
    }

    private String getSql(BoundSql boundSql, Object parameterObject, Configuration configuration) {
        try {
            String sql = boundSql.getSql().replaceAll("[\\s]+", " ");
            //超长SQL不做打印
            if (StrUtil.length(sql) > 300000) {
                return sql.substring(0, 100) + "...";
            }
            List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (parameterMappings != null) {
                Object[] actualValues = new Object[parameterMappings.size()];
                for (int i = 0; i < parameterMappings.size(); i++) {
                    ParameterMapping parameterMapping = parameterMappings.get(i);
                    if (parameterMapping.getMode() == ParameterMode.OUT) {
                        continue;
                    }
                    Object value;
                    String propertyName = parameterMapping.getProperty();
                    if (boundSql.hasAdditionalParameter(propertyName)) {
                        value = boundSql.getAdditionalParameter(propertyName);
                    } else if (parameterObject == null) {
                        value = null;
                    } else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                        value = parameterObject;
                    } else {
                        MetaObject metaObject = configuration.newMetaObject(parameterObject);
                        value = metaObject.getValue(propertyName);
                    }
                    actualValues[i] = getActualValue(value);
                }
                sql = sql.replaceAll("\\?", "{}");
                return StrUtil.format(sql, actualValues);
            }
            return sql;
        } catch (Exception e) {
            log.error("拼接SQL异常", e);
            return null;
        }
    }

    private String getActualValue(Object propertyValue) {
        String result;
        if (propertyValue != null) {
            if (propertyValue instanceof String) {
                result = "'" + propertyValue + "'";
            } else if (propertyValue instanceof Date) {
                result = "'" + DateUtil.format((Date) propertyValue, "yyyy-MM-dd HH:mm:ss") + "'";
            } else {
                result = propertyValue.toString();
            }
        } else {
            result = "null";
        }
        return result;
    }


}
