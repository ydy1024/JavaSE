package com.ydy._11Stream流的获取;

import java.util.*;
import java.util.stream.Stream;

/**
    目标：Stream流的获取

    Stream流式思想的核心：
        是先得到集合或者数组的Stream流（传送带）
        然后就用这个Stream流操作集合或者数组的元素。
        然后用Stream流简化替代集合操作的API.

    集合获取流的API：
        （1）default Stream<E> stream();

    小结：
        集合获取Stream流用stream();
        数组：Array.stream(数组)/Stream.of(数组);
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        /**
            Collection集合获取流
         */
        Collection<String> c = new ArrayList<>();
        Stream<String> stream = c.stream();
        /**
            Map集合获取流
         */
        Map<String, Integer> maps = new HashMap<>();
        //先获取键的Stream流。
        Stream<String> keys = maps.keySet().stream();
        //再获取值的Stream流
        Stream<Integer> values = maps.values().stream();
        //获取键值对的Stream流（key=value:Map.Entry<String,Integer>）
        Stream<Map.Entry<String, Integer>> entryStream = maps.entrySet().stream();
        /**
            数组获取流
         */
        String[] strings = {"java", "ydy", "llh", "zhy"};
        Stream<String> stringStream1 = Arrays.stream(strings);
        Stream<String> stringStream2 = Stream.of(strings);


    }
}
