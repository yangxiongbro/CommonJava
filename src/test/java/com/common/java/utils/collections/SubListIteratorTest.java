package com.common.java.utils.collections;

import com.common.java.exception.base.BaseException;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

/**
 * <b><code>SubListIteratorTest</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2025/7/4 10:43
 *
 * @author yang xiong
 * @since CommonJava 0.1.0
 */
public class SubListIteratorTest {

    @Test
    public void testSubListIterator() throws BaseException {
        SubListIterator<Integer> iterator;
//        iterator = new SubListIterator<>(null, 0);
//        iteratorList(iterator);
//        iterator = new SubListIterator<>(Collections.emptyList(), 0);
//        iteratorList(iterator);
        iterator = new SubListIterator<>(Collections.emptyList(), 1);
        iteratorList(iterator);
        iterator = new SubListIterator<>(Collections.emptyList(), 10);
        iteratorList(iterator);
        iterator = new SubListIterator<>(CollectionsUtils.<Integer>listBuilder(8).add(1).build(), 1);
        iteratorList(iterator);
        iterator = new SubListIterator<>(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 1);
        iteratorList(iterator);
        iterator = new SubListIterator<>(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 2);
        iteratorList(iterator);
        iterator = new SubListIterator<>(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 3);
        iteratorList(iterator);
    }

    public void iteratorList(SubListIterator<Integer> iterator){
        System.out.println("------------");
        while(iterator.hasNext()){
            for(Integer item : iterator.next()){
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }

    public void printList(List<Integer> list){
        for(Integer item : list){
            System.out.printf("%d\t", item);
        }
        System.out.println();
    }

    @Test
    public void testIterator() throws BaseException {
//        System.out.println("------------");
//        SubListIterator.<Integer>iterator(null, 0, list -> printList(list));
//        System.out.println("------------");
//        SubListIterator.iterator(Collections.<Integer>emptyList(), 0, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(Collections.<Integer>emptyList(), 1, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(Collections.<Integer>emptyList(), 10, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(CollectionsUtils.<Integer>listBuilder(8).add(1).build(), 1, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 1, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 2, list -> printList(list));
        System.out.println("------------");
        SubListIterator.iterator(CollectionsUtils.<Integer>listBuilder(8).add(1).add(2).build(), 3, list -> printList(list));
    }
}
