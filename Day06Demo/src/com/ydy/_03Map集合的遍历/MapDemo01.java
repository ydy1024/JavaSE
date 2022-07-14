package com.ydy._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    目标：Map集合的遍历方式。

    Map集合的遍历方式有：3种。
        （1）”键找值“的方式遍历：先获取Map集合全部的键，再根据键找值。
        （2）”键值对“的方式遍历：难度较大。
        （3）JDK1.8开始之后的新技术：Lambda表达式。

    a.”键找值“的方式遍历
        1.先获取Map集合的全部键的Set集合。
        2.遍历键的Set集合，然后通过键找值。
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        //1.添加元素：无序，不重复，无索引
        maps.put("iPhone",2999);
        maps.put("哇哇",30);
        maps.put("huawei",1000);
        maps.put("iPhone",3999);
        maps.put("手表",10);
        System.out.println(maps);
        //a.键找值方式遍历
        //获取当前Map集合的全部键的集合。
        Set<String> keys=maps.keySet();
        //b.通过遍历键然后通过键取对应的值
        for (String key : keys) {
            Integer value=maps.get(key);
            System.out.println(key+"="+value);
        }
    }
}
