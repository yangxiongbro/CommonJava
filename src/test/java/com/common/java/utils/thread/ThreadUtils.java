package com.common.java.utils.thread;

import com.common.java.utils.collections.CollectionsUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.function.Function;

/**
 * <b><code>ThreadUtils</code></b>
 * <p/>
 * 多线程有关工具类
 * <p/>
 * <b>Creation Time:</b> 2025/7/4 10:12
 *
 * @author yang xiong
 * @since CommonJava 0.1.0
 */
@Slf4j
public class ThreadUtils {
    /**
     * @description: Thread.sleep(millis)
     * @param: millis - [long]
     * @return: boolean
     * @throws
     * @author yang xiong
     * @date 2023/11/21 22:10
     **/
    public static boolean sleep(long millis) {
        boolean result = true;
        log.info("休眠: {}ms", millis);
        if (millis > 0L) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                log.error("sleep 发生异常：{}", e);
                result = false;
            }
        }
        return result;
    }


    /**
     * @description: 等待future
     * @param: future
     * @return: T
     * @throws
     * @author yang xiong
     * @date 2025/4/24 16:51
     **/
    public static <T> T waitFuture(Future<T> future){
        T result = null;
        try {
            result = future.get();
        } catch (Exception e) {
            log.error("future.get() 发生异常：{}", e);
        }
        return result;
    }

    /**
     * @description: 等待future
     * @param: futureList
     * @return: java.util.List<T>
     * @throws
     * @author yang xiong
     * @date 2025/4/24 16:44
     **/
    public static <T> List<T> waitAllFuture(List<Future<T>> futureList){
        if(CollectionsUtils.isEmpty(futureList)){
            return Collections.emptyList();
        }
        List<T> list = new ArrayList<>(futureList.size());
        for(Future<T> future:futureList){
            try {
                list.add(future.get());
            } catch (Exception e) {
                log.error("future.get() 发生异常：{}", e);
            }
        }
        return list;
    }

    /**
     * @description: 等待future
     * @param: futureList
     * @param: filter
     * @return: java.util.List<T>
     * @throws
     * @author yang xiong
     * @date 2025/7/4 10:23
     **/
    public static <T> List<T> waitAllFuture(List<Future<T>> futureList, Function<T, T> filter){
        if(CollectionsUtils.isEmpty(futureList)){
            return Collections.emptyList();
        }
        List<T> list = new ArrayList<>(futureList.size());
        for(Future<T> future:futureList){
            try {
                list.add(filter.apply(future.get()));
            } catch (Exception e) {
                log.error("future.get() 发生异常：{}", e);
            }
        }
        return list;
    }
}
