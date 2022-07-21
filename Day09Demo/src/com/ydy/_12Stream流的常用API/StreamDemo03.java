package com.ydy._12Stream流的常用API;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
    目标：Stream流的常用API
    forEach:逐一处理（遍历）
    count：统计个数
        --long count();
    filter:过滤元素
        --Stream<T> filter(Predicate<? super T> predicate)
    limit:取前几个元素
    skip:跳过前几个
    map（映射）:加工方法
    concat:合并流。
        --public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("姚道炎");
        lists.add("刘力皓");
        lists.add("王伟东");
        lists.add("张三");
        lists.add("李四");
        lists.add("吴文枫");
        lists.add("姚瑶");
        lists.add("姚道敏");
        //数组流
        Stream<Integer> s1=Stream.of(10,20,30,40);
        //集合流
        Stream<String> stream = lists.stream();
        //合并流
        Stream<Object> concat = Stream.concat(s1, stream);
        concat.forEach(System.out::println);
    }
}
