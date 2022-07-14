package com.ydy._05LinkedHashMap的特点;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
    目标：LinkedHashMap的特点介绍。

    LinkedHashMap是HashMap的子类。
        -添加的元素按照键有序，不重复。
    HashSet集合相当于是HashMap集合的键都不带值。

    LinkedHashSet集合相当于是LinkedHashMap集合的键都不带值。
        --

    底层原理完全一样，都是基于哈希表按照键存储数据的，只是HashMap或者LinkedHashMap的键都多一个附属值。

    小结：
        HashMap集合是无序不重复的键值对集合。
        LinkedHashMap集合是有序不重复的键值对集合。
        他们都是基于哈希表存储数据。增删改查都很好！

 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new LinkedHashMap<>();
        //1.添加元素：无序，不重复，无索引
        maps.put("iPhone",2999);
        maps.put("哇哇",30);
        maps.put("huawei",1000);
        maps.put("iPhone",3999);
        maps.put("手表",10);
        System.out.println(maps);
    }
}
