package com.kingdee.fpy.config.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName SpringContextUtil
 * @Description TODO
 * @Author xufeng_liu
 * @Date 2024/10/14 10:28
 */
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    public SpringContextUtil() {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextUtil.applicationContext == null) {
            SpringContextUtil.applicationContext = applicationContext;
        }
    }


    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }
}
