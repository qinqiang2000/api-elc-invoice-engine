package com.kingdee.fpy.config.dbconfig;

import java.util.function.Supplier;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 主动使用分表，这种情况下，自己把控好where条件，拦截器不会拼装租户条件
 *
 * @author chenhuanwei
 * @date 2023/5/15
 */
@AllArgsConstructor
@Getter
public class SplitTableWrap {

    public static final ThreadLocal<SplitTableWrap> LOCAL_PAGE = new ThreadLocal<>();

    /**
     * 分表编号，空时还是查询主表等同未生效
     */
    public String index;


    public static SplitTableWrap of(Integer index) {
        return new SplitTableWrap(null == index ? null : index.toString());
    }

    public static SplitTableWrap of(String index) {
        return new SplitTableWrap(index);
    }

    public <T> T doSplit(Supplier<T> supplier) {
        LOCAL_PAGE.set(this);
        try {
            return supplier.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            LOCAL_PAGE.remove();
        }
    }

    public void doSplit(Runnable runnable) {
        LOCAL_PAGE.set(this);
        try {
            runnable.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            LOCAL_PAGE.remove();
        }
    }

}
