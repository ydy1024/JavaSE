package com.ydy._15Collection集合的常用API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
    目标：Collection集合的常用API。
    Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习它。
    Collection API如下：
        -public boolean add(E e):把给定的对象添加到当前集合中。
        -public void clear():清空集合中所有的元素。
        -public boolean remove():把给定的对象在当前集合中删除。
        -public boolean contains(Object obj):判断当前集合中是否包含给定的对象。
        -public boolean isEmpty():判断当前集合是否为空。
        -public int size():返回集合中元素的个数。
        -public Object[] toArray():把集合中的元素，存储到数组中。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //HashList:添加的元素是无序，不重复，无索引。
        Collection<String> sets=new HashSet<>();
        //1.添加元素，添加成功返回true
        System.out.println(sets.add("刘力皓"));
        System.out.println(sets.add("姚道炎"));
        System.out.println(sets.add("王伟东"));
        System.out.println(sets.add("姚道炎"));//false
        System.out.println(sets);//集合重写了toString方法
        //2.清空元素的集合
//        sets.clear();
        System.out.println(sets);
        //3.判断集合是否为空 是空返回true
        System.out.println(sets.isEmpty());
        //4.获取集合的大小
        System.out.println(sets.size());
        //5.判断集合中是否包含某个元素
        System.out.println(sets.contains("姚道炎"));
        //6.删除某个元素：默认删除前面的第一个！
        System.out.println(sets.remove("姚道炎"));
        //7.把集合转换成数组
        Object[] arr=sets.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------扩展--------------------------");
        Collection<String> lists = new ArrayList<>();
        lists.add("姚道炎");
        lists.add("王伟东");
        Collection<String> lists1 = new ArrayList<>();
        lists1.add("刘力皓");
        lists.addAll(lists1);
        System.out.println(lists);
    }
}
