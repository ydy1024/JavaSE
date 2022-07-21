package com.ydy._15收集Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    目标：收集Stream流：把Stream流的数据转回成集合。

    引入：
        Stream的作用是：把集合转换成一根传送带，借用Stream流的强大功能进行的操作。
        但是实际开发中数据最终的形式还是应该是集合，最终Stream流操作完毕以后还是要转换成集合。
        这就是收集Stream流。

    收集Stream流的含义：就是把Stream流的数据转回到集合中去。

    Stream流：手段。
    集合：才是目的。

    流：只能使用一次。
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("ydy");
        lists.add("llh");
        lists.add("zhy");
        lists.add("wwd");
        lists.add("wwf");
        lists.add("wwf");
        lists.add("wxq");
        lists.add("lz");
        lists.add("hy");
        lists.add("dy");

        Stream<String> stream1 = lists.stream().filter(s -> s.startsWith("w"));
        //把stream流转换成Set集合
        Set<String> sets=stream1.collect(Collectors.toSet());
        System.out.println(sets);
        //把Stream流转换成List集合
        Stream<String> stream2 = lists.stream().filter(s -> s.startsWith("w"));
        List<String> list2 = stream2.collect(Collectors.toList());
        System.out.println(list2);
        //把Stream流转成数组
        Stream<String> stream3 = lists.stream().filter(s -> s.startsWith("w"));
//         Object[] arr=stream3.toArray();
        //可以借用构造器引用声明转换成的数组类型！
        String[] arr=stream3.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
