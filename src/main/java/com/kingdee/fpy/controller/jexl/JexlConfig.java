package com.kingdee.fpy.controller.jexl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.introspection.JexlPermissions;
import org.apache.commons.jexl3.introspection.JexlSandbox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 金帆
 * @Date: 2025/7/31 10:14
 * @Description: JEXL配置类，包含数据库函数注册
 */
@Configuration
public class JexlConfig {


    private JexlEngine jexlEngine;

    @Bean
    public JexlEngine jexlEngine() {
        Map<String, Object> math = new HashMap<>(); //Collections.singletonMap("math", Math.class);
        math.put("integer", Integer.class);
        math.put("math", Math.class);
        math.put("double", Double.class);
        this.jexlEngine = new JexlBuilder()
                .cache(512)          // 表达式缓存大小
                .strict(true)        // 非严格模式，更宽松
                .silent(false)        // 不静默，显示错误
                .lexical(false)       // 禁用现代语法，使用传统语法
                .debug(true)
                //.permissions(null)    // 允许所有权限
                .namespaces(math)

                .create();
        return this.jexlEngine;
    }

    public static void main(String[] args) {
        // 创建 JEXL 引擎并导入 Math 类
        JexlEngine jexl = new JexlBuilder()
                .namespaces(Collections.singletonMap("math", Math.class))
                .create();

        // 创建表达式
        JexlExpression expression = jexl.createExpression("math:abs(-123.45)");

        // 执行表达式
        Object result = expression.evaluate(null);

        System.out.println("Result: " + result); // 应输出 123.45
    }
}
