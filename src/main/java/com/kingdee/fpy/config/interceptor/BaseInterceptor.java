package com.kingdee.fpy.config.interceptor;

import java.util.List;
import lombok.SneakyThrows;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

/**
 * @author chenhuanwei
 * @date 2023/11/29
 */
public abstract class BaseInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 拦截sql
        Object target = invocation.getTarget();
        if (target instanceof Executor) {
            return callExecutor(invocation);
        }

        return invocation.proceed();
    }


    public abstract Object callExecutor(Invocation invocation) throws Throwable;

    @SneakyThrows
    protected Object doNewSql(Invocation invocation, String splitSql) {
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];
        BoundSql boundSql = statement.getBoundSql(parameterObject);
        BoundSql newBoundSql = new BoundSql(statement.getConfiguration(), splitSql, boundSql.getParameterMappings(), parameterObject);
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        for (ParameterMapping parameter : parameterMappings) {
            if (boundSql.hasAdditionalParameter(parameter.getProperty())) {
                newBoundSql.setAdditionalParameter(parameter.getProperty(), boundSql.getAdditionalParameter(parameter.getProperty()));
            }
        }
        statement = copyFromMappedStatement(statement, new BoundSqlSqlSource(newBoundSql));
        args[0] = statement;
        return invocation.proceed();
    }

    protected MappedStatement copyFromMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), newSqlSource,
                ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
            StringBuilder keyProperties = new StringBuilder();
            for (String keyProperty : ms.getKeyProperties()) {
                keyProperties.append(keyProperty).append(",");
            }
            keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
            builder.keyProperty(keyProperties.toString());
        }
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();
    }

    public static class BoundSqlSqlSource implements SqlSource {
        private BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        @Override
        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }
}
