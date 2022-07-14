package com.ydy._06TreeMap集合应用;

import java.util.Comparator;
import java.util.TreeMap;

/**
    目标：TreeMap集合的特点和使用。

    TreeMap集合按照键是可排序不重复的键值对集合。（默认升序）
    TreeMap集合按照键排序的特点与TreeSet是完全一样的。

    小结：
        TreeMap集合和TreeSet集合都是排序不重复集合。
        TreeSet集合的底层是基于TreeMap，只是键没有附属值而已。
        所有TreeMap集合指定大小规则有2种方式：
            a.直接为对象的类实现比较器规则接口Comparable，重写比较方法(扩展方式)
            b.直接为集合设置比较器Comparator对象，重写比较方法
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> maps = new TreeMap<>();
        maps.put(1000000,"张三");
        maps.put(1000000,"张三1");
        maps.put(10000,"李四");
        maps.put(10,"王五");
        maps.put(24244,"张麻子");
        System.out.println(maps);

        TreeMap<Pig, String> pigs = new TreeMap<>();
        pigs.put(new Pig("佩奇",99.5,500.0),"荷兰");
        pigs.put(new Pig("乔治",99.4,605.0),"澳大利亚");
        pigs.put(new Pig("野猪",199.4,305.0),"山上");
        System.out.println(pigs);

        TreeMap<Pig, String> pigs1 = new TreeMap<>(new Comparator<Pig>() {
            @Override
            public int compare(Pig o1, Pig o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
        pigs1.put(new Pig("佩奇",99.5,500.0),"荷兰");
        pigs1.put(new Pig("乔治",99.4,605.0),"澳大利亚");
        pigs1.put(new Pig("野猪",199.4,305.0),"山上");
        System.out.println(pigs1);
    }
}
