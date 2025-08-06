package com.kingdee.fpy.controller.jexl;


import java.util.Map;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.JexlScript;
import org.apache.commons.jexl3.MapContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 金帆
 * @Date: 2025/7/31 10:15
 * @Description: JEXL工具类，支持数据库查询函数
 */
@Component
public class JexlUtils {

    @Autowired
    private JexlEngine jexlEngine;

    public static void main(String[] args) {
        JexlEngine jexl = new JexlBuilder().create();
        String jexlExp = "a >= b";
        JexlScript script = jexl.createScript(jexlExp);
        JexlExpression expression = jexl.createExpression(jexlExp);
        JexlContext context = new MapContext();
        context.set("a", 500);
        context.set("b", 500.0);
       // Object evaluate = expression.evaluate(context);
        Object execute = script.execute(context);
        System.out.println(execute);
    }

    /**
     * 执行表达式
     * @param expression 表达式字符串
     * @param context 上下文变量
     * @return 执行结果
     */
    public Object evaluate(String expression, Map<String, Object> context) {
        try {
            System.out.println("开始执行JEXL表达式: " + expression);
            System.out.println("JEXL上下文内容: " + context);
            
            JexlScript script = jexlEngine.createScript(expression);
            JexlContext jexlContext = new MapContext(context);
            
            System.out.println("JEXL脚本创建成功，开始执行...");
            Object result = script.execute(jexlContext);
            System.out.println("JEXL执行完成，结果: " + result);
            
            return result;
        } catch (Exception e) {
            System.err.println("JEXL执行异常: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("JEXL表达式执行失败: " + e.getMessage(), e);
        }
    }

    /**
     * 执行表达式并返回指定类型结果
     */
    public <T> T evaluate(String expression, Map<String, Object> context, Class<T> clazz) {
        Object result = evaluate(expression, context);
        if (result != null && clazz.isAssignableFrom(result.getClass())) {
            return clazz.cast(result);
        }
        throw new RuntimeException("结果类型不匹配，期望: " + clazz.getSimpleName() + ", 实际: " + 
            (result != null ? result.getClass().getSimpleName() : "null"));
    }

    /**
     * 执行数据库查询并返回单个值
     * @param sql SQL语句
     * @param params 参数数组
     * @param context JEXL上下文
     * @return 查询结果
     */
    public Object executeDbQuery(String sql, Object[] params, Map<String, Object> context) {
        try {
            // 从上下文中获取数据库服务
            Object dbService = context.get("db");
            if (dbService == null) {
                throw new RuntimeException("数据库服务未在上下文中找到");
            }
            
            // 使用反射调用queryValue方法
            java.lang.reflect.Method method = dbService.getClass().getMethod("queryValue", String.class, Object[].class);
            return method.invoke(dbService, sql, params);
        } catch (Exception e) {
            throw new RuntimeException("数据库查询执行失败: " + e.getMessage(), e);
        }
    }

    /**
     * 执行数据库查询并返回列表
     * @param sql SQL语句
     * @param params 参数数组
     * @param context JEXL上下文
     * @return 查询结果列表
     */
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> executeDbListQuery(String sql, Object[] params, Map<String, Object> context) {
        try {
            // 从上下文中获取数据库服务
            Object dbService = context.get("db");
            if (dbService == null) {
                throw new RuntimeException("数据库服务未在上下文中找到");
            }
            
            // 使用反射调用queryList方法
            java.lang.reflect.Method method = dbService.getClass().getMethod("queryList", String.class, Object[].class);
            return (List<Map<String, Object>>) method.invoke(dbService, sql, params);
        } catch (Exception e) {
            throw new RuntimeException("数据库列表查询执行失败: " + e.getMessage(), e);
        }
    }

    /**
     * 执行数据库更新操作
     * @param sql SQL语句
     * @param params 参数数组
     * @param context JEXL上下文
     * @return 影响的行数
     */
    public int executeDbUpdate(String sql, Object[] params, Map<String, Object> context) {
        try {
            // 从上下文中获取数据库服务
            Object dbService = context.get("db");
            if (dbService == null) {
                throw new RuntimeException("数据库服务未在上下文中找到");
            }
            
            // 使用反射调用update方法
            java.lang.reflect.Method method = dbService.getClass().getMethod("update", String.class, Object[].class);
            return (Integer) method.invoke(dbService, sql, params);
        } catch (Exception e) {
            throw new RuntimeException("数据库更新执行失败: " + e.getMessage(), e);
        }
    }

    /**
     * 验证JEXL表达式语法
     * @param expression 表达式字符串
     * @return 是否有效
     */
    public boolean validate(String expression) {
        try {
            jexlEngine.createScript(expression);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
