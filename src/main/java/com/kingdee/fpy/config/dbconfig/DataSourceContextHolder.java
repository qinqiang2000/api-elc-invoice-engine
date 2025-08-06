package com.kingdee.fpy.config.dbconfig;

/**
 * 本地线程，数据源上下文
 *
 * @author xufeng_liu
 */
public class DataSourceContextHolder {

    //线程本地环境
    private static final ThreadLocal<String> local = new ThreadLocal<>();

    /**
     * 读库
     */
    public static void setRead() {
        local.set(com.kingdee.fpy.config.dbconfig.DataSourceType.read.getType());
    }

    /**
     * 写库
     */
    public static void setWrite() {
        local.set(DataSourceType.write.getType());
    }

    public static String getReadOrWrite() {
        return local.get();
    }

    public static void clear() {
        local.remove();
    }
}
