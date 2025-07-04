package com.common.java.utils.collections;

import com.common.java.exception.base.BaseException;
import com.common.java.exception.base.business.CommonResponseEnum;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * <b><code>SubListIterator</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2025/7/4 10:26
 *
 * @author yang xiong
 * @since CommonJava 0.1.0
 */
public class SubListIterator<E> {
    List<E> list;
    int size = 0;
    int si = 0;
    int ei = 0;
    int step = 1;

    public SubListIterator(List<E> list, int step) throws BaseException {
        CommonResponseEnum.ARGUE_ERROR.assertNotNull(list, "list不能为null");
        CommonResponseEnum.ARGUE_ERROR.assertTrue(step > 0, "step不能小于1");
        this.list = Optional.ofNullable(list).orElse(Collections.emptyList());
        this.size = this.list.size();
        this.si = 0;
        this.ei = 0;
        this.step = step;
    }

    public boolean hasNext() {
        si = ei;
        if (si >= size) {
            return false;
        } else {
            ei = ei + step;
            if(ei > size){
                ei = size;
            }
            return true;
        }
    }

    public List<E> next() {
        return this.list.subList(si, ei);
    }

    public static <E> void iterator(List<E> list, int step, Consumer<List<E>> consumer) throws BaseException {
        CommonResponseEnum.ARGUE_ERROR.assertNotNull(list, "list不能为null");
        CommonResponseEnum.ARGUE_ERROR.assertTrue(step > 0, "step不能小于1");
        int size = list.size();
        int si = 0;
        int ei = 0;
        while(si < size){
            ei = si + step;
            if(ei > size){
                ei = size;
            }
            consumer.accept(list.subList(si, ei));
            si = ei;
        }
    }

}