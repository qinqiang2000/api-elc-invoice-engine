package com.kingdee.fpy.config.dbconfig;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * 在service层觉得数据源 必须在事务AOP之前执行，所以实现Ordered,order的值越小，越先执行 如果一旦开始切换到写库，则之后的读都会走写库
 */
@Aspect
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Component
@Slf4j
public class DataSourceAopInService implements PriorityOrdered {

    @Before("@annotation(com.kingdee.fpy.config.dbconfig.ReadDataSource)")
    public void setReadDataSourceType() {
        clear();
        //当前线程是否存在事务
        boolean actualTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        //不存在事务，且当前是写库，才切为读库
        if (!actualTransactionActive && !DataSourceType.read.getType().equals(com.kingdee.fpy.config.dbconfig.DataSourceContextHolder.getReadOrWrite())) {
            com.kingdee.fpy.config.dbconfig.DataSourceContextHolder.setRead();
        }
    }

    @Before(" @annotation(com.kingdee.fpy.config.dbconfig.WriteDataSource) ")
    public void setWriteDataSourceType() {
        clear();
        com.kingdee.fpy.config.dbconfig.DataSourceContextHolder.setWrite();
    }

    /**
     * 解决内存泄露问题
     */
    @After("@annotation(com.kingdee.fpy.config.dbconfig.WriteDataSource) || @annotation(com.kingdee.fpy.config.dbconfig.ReadDataSource) ")
    public void clear() {
        DataSourceContextHolder.clear();
    }

    /**
     * 解决内存泄露问题
     */
    @AfterThrowing("@annotation(com.kingdee.fpy.config.dbconfig.WriteDataSource) || @annotation(com.kingdee.fpy.config.dbconfig.ReadDataSource) ")
    public void clearAfterThrowing() {
        clear();
    }


    @Override
    public int getOrder() {
        /**
         * 一定要在事务注解AOP之后执行，否则TransactionSynchronizationManager.isActualTransactionActive()根本判断不到事务
         */
        return 11;
    }

}
