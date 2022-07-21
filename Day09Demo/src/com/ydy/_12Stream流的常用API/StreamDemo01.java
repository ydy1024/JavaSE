package com.ydy._12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
    目标：Stream流的常用API
    forEach:逐一处理（遍历）
    count：统计个数
        --long count();
    filter:过滤元素
        --Stream<T> filter(Predicate<? super T> predicate)
    limit:取前几个元素
    skip:跳过前几个
    map:加工方法
    concat:合并流。
 */
public class StreamDemo01 {
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
        lists.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        });

        lists.stream().filter(s -> s.length()==3)
                        .filter(s -> s.startsWith("姚"))
                        .forEach(System.out::println);
        //统计数量
        long count=lists.stream().filter(s->s.length()==3)
                                .filter(s->s.startsWith("姚"))
                                .count();
        System.out.println(count);
        //取前两个
        lists.stream().filter(s->s.length()==3)
                        .limit(2)
                        .forEach(System.out::println);
        //跳过前两个
        lists.stream().filter(s->s.length()==3)
                        .skip(2)
                        .forEach(System.out::println);

    }
}
