package com.ydy._05Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
    目标：Collections工具类的使用。

    java.utils.Collections:是集合工具类
    Collections并不属于集合，是用来操作集合的工具类。
    Collections有几个常用的API：
        -public static <T> boolean addAll(Collection<? super T> c, T... elements):给集合对象批量添加元素！
        -public static void shuffle(List<?> list):打乱集合顺序。
        -public static <T extends Comparable<? super T>> void sort(List<T> list):将集合中元素按照默认规则排序。
        -public static <T> void sort(List<T> list, Comparator<? super T> c)：将集合中的元素按照指
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        //1.给集合批量添加元素
        Collection<String> lists = new ArrayList<>();
        /**
         * 参数一：被添加元素的集合
         * 参数二：可变参数，一批元素
         */
        Collections.addAll(lists,"姚道炎","刘力皓","王伟东");
        System.out.println(lists);
        //2.打乱集合的顺序：public static void shuffle(List<?> list)
        //只能打乱有序的List集合。
        ArrayList<String>  newnames= new ArrayList<>();
        Collections.addAll(newnames,"ydy","llh","wwd","wwf","zhy");
        System.out.println(newnames);
        Collections.shuffle(newnames);
        System.out.println(newnames);
        //3.public static <T> void sort(List<T> list):给List集合升序排序。
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,21.2,31.3,94.1,76.3,41.8,35.1);
        Collections.sort(scores);
        System.out.println(scores);
    }
}
