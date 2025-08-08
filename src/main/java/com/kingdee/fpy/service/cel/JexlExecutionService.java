package com.kingdee.fpy.service.cel;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.utils.JexlException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.JexlScript;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.jexl3.introspection.JexlSandbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 金帆
 * @Date: 2025/8/4 13:59
 * @Description:
 */
@Service
@Slf4j
public class JexlExecutionService {

    @Autowired
    private JexlEngine jexlEngine;

    @Autowired
    private DynamicQueryService dynamicQueryService;

    MapContext context = null;

   /* public JexlExecutionService(DynamicQueryService dynamicQueryService) {
        this.dynamicQueryService = dynamicQueryService;

        // 创建安全的JEXL引擎
        JexlSandbox sandbox = new JexlSandbox();
        sandbox.allow("db");

        this.jexlEngine = new JexlBuilder()
                .sandbox(sandbox)
                .cache(512)
                .strict(true)
                .silent(false)
                .create();
    }*/

    public Object executeExpression(String expression, JSONObject invoice) {
        JexlContext context = createJexlContext();
        context.set("invoice", invoice);
       // JexlExpression expr = jexlEngine.createExpression(expression);
       // return expr.evaluate(context);
        try {
            JexlScript script = jexlEngine.createScript(expression);
            return script.execute(context);
        }catch (JexlException e1){
            log.error("JEXL表达式执行失败: " + e1.getMessage(), e1);
            return null;
        } catch(Exception e) {
            log.error("JEXL表达式执行失败: " + e.getMessage(), e);
            return null;
        }
    }

    public Boolean executeExpression(JexlContext contexts,String expression) {
        try {
            JexlScript script = jexlEngine.createScript(expression);
            Object execute = script.execute(contexts);
            if(null !=execute){
                return Boolean.valueOf(String.valueOf(execute));
            }
            return false;
        }catch (JexlException e1){
            log.error("JEXL表达式执行失败: " + e1.getMessage(), e1);
            return false;
        } catch(Exception e) {
            log.error("JEXL表达式执行失败: " + e.getMessage(), e);
            return false;
        }
    }

    public JexlContext createJexlContext() {
        JexlContext    context = new MapContext();
        // 注册数据库函数
        context.set("db", new DatabaseFunctions(dynamicQueryService));
        // 注册工具类
       /* context.set("math", Math.class);
        context.set("strings", String.class);
        context.set("util", Arrays.class);
        context.set("date", Date.class);*/
        context.set("Math", Math.class);
        return context;
    }

    public static class DatabaseFunctions {
        private final DynamicQueryService dynamicQueryService;

        public DatabaseFunctions(DynamicQueryService dynamicQueryService) {
            this.dynamicQueryService = dynamicQueryService;
        }

        public String query(String tableName,String column,Map<String, Object> conditions) {
            return dynamicQueryService.selectOneField(tableName, column, conditions);
        }

        public Map<String, Object> queryOne(String tableName) {
            return dynamicQueryService.selectOneRow(tableName, null, null);
        }

        public Map<String, Object> queryOne(String tableName, Map<String, Object> conditions) {
            return dynamicQueryService.selectOneRow(tableName, null, conditions);
        }

        public Map<String, Object> queryOne(String tableName, List<String> columns, Map<String, Object> conditions) {
            return dynamicQueryService.selectOneRow(tableName, columns, conditions);
        }

        // 获取所有表名（用于前端展示）
        public List<String> getAllTables() {
            return dynamicQueryService.getAllTableNames();
        }
    }
}
