package com.ydy._02Map集合的API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    目标：Map集合的常用API（重点）
        -public V put(K key, V value):把指定的键与指定的值添加到Map集合中。
        -public V remove(Object key):把指定的键 所对应的键值对元素在Map集合中删除，返回被删除元素
        -public V get(Object key):根据指定的键,在Map集合中获取对应的值。
        -public Set<K> keySet():获取Map集合中所以的键，存储到Set集合中。
        -public Set<Map.Entry<K,V>> entrySet():获取到Map集合中所有的键值对对象的集合(Set集合)
        -public boolean containsKey(Object key):判断改集合中是否有此键。

 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        //1.添加元素：无序，不重复，无索引
        maps.put("iPhone",2999);
        maps.put("哇哇",30);
        maps.put("huawei",1000);
        maps.put("iPhone",3999);
        maps.put("手表",10);
        System.out.println(maps);
        //2.清空集合
//        maps.clear();
//        System.out.println(maps);
        //3.判断集合是否为空，为空则返回true，反之！
        System.out.println(maps.isEmpty());
        //4.根据键获取对应值
        Integer value=maps.get("iPhone");
        System.out.println(value);
        //5.根据键删除整个元素。(删除键会返回值)
        System.out.println(maps.remove("iPhone"));
        //6.判断是否包含某个键，包含返回true，反之
        System.out.println(maps.containsKey("手表"));
        //7.判断是否包含某个值。
        System.out.println(maps.containsValue(1000));
        //8.获取全部键的集合：public Set<K> keySet()
        //Map集合的键是无序不重复的，所以返回的是一个set集合
        Set<String> keys=maps.keySet();
        for (String key : keys) {
            System.out.print(key+" ");
        }
        //9.获取全部值的集合：public Collection<V> values()
        //Map集合的值是不做要求的，可能重复，所有值要用Collection集合接收！
        Collection<Integer> values=maps.values();
        System.out.println();
        for (Integer integer : values) {

            System.out.print(integer+" ");
        }
        //10.集合的大小
        System.out.println();
        System.out.println(maps.size());
        //11.合并其他Map结合。（扩展）
        Map<String, Integer> maps2 = new HashMap<>();
        maps2.put("xiaoMi",100);
        maps2.put("Sanxing",12);
        maps2.put("oppo",34);
        maps2.put("手表",1000);
        maps.putAll(maps2);
        System.out.println(maps);
    }
}
