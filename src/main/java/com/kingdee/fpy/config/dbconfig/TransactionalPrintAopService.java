package com.kingdee.fpy.config.dbconfig;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * 打印事务注解
 */
@Aspect
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Component
@Slf4j
public class TransactionalPrintAopService implements PriorityOrdered {


    @Before("@annotation(org.springframework.transaction.annotation.Transactional) && @annotation(transactional)")
    public void printTransactionalDetail(JoinPoint point, Transactional transactional) {
        //tomcat线程复用，导致进了事务就无法切换数据源，这里必须在事务开启之前清掉
        DataSourceContextHolder.clear();

        MethodSignature signature = (MethodSignature) point.getSignature();
        //请求的方法名
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();
        log.info("开启注解式事务Transactional：isolation=[{}] , propagation=[{}] , rollbackFor={} , 当前调用类={}",
                transactional.isolation(), transactional.propagation(), transactional.rollbackFor(), className + "." + methodName);
    }


    @Override
    public int getOrder() {
        return 9;
    }

}
