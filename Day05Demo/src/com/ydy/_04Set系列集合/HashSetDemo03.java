package com.ydy._04Set系列集合;

import java.util.HashSet;
import java.util.Set;

/**
    目标：set系列集合元素无序的根本原因。（面试必考）

    Set系列集合添加元素无序的根本原因是因为底层采用了哈希表存储数据。

    JDK1.8之前：哈希表=数组+链表+（哈希算法）
    JDK1.8之后：哈希表=数组+链表+红黑树+（哈希算法）
            当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。
    例子：
        底层数组长度假设为：6
    哈希算法：
        1.先获取元素对象的哈希值。假如 Mybatis：63
        2.让当前对象的哈希值对底层数组长度求余 63%6=3
        3.求余的结果作为该对象元素在底层数组的索引位置。
        4.把该对象元素存入到该索引位置。

    小结：
        Set系列集合是基于哈希表存储数据的
        它的增删改查的性能都很好！！但是它是无序不重复的！如果不在意当然可以使用！

 */
public class HashSetDemo03 {
    public static void main(String[] args) {
        //无序，不重复，无索引的
        HashSet<String> sets = new HashSet<>();
        sets.add("Mybatis");
        sets.add("Java");
        sets.add("Java");
        sets.add("MySQL");
        sets.add("Spring");
        System.out.println(sets);
    }
}
