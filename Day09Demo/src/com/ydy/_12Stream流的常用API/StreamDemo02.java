package com.ydy._12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;


/**
    目标：Stream流的常用API
    forEach:逐一处理（遍历）
    count：统计个数
        --long count();
    filter:过滤元素
        --Stream<T> filter(Predicate<? super T> predicate)
    limit:取前几个元素
    skip:跳过前几个
    map（映射）:加工方法（把原来的元素加工以后，重新放上去）
        --<R> Stream<R> map(Function<? super T,? extends R> mapper)
    concat:合并流。
 */
public class StreamDemo02 {
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

        //需求，把名字都加上”tt“
        lists.stream().map(s->"tt"+s).forEach(System.out::println);

        //需求：把名称都加工成学生对象放上去！！
        //lists.stream().map(s->new Student(s)).forEach(System.out::println);
        lists.stream().map(Student::new).forEach(System.out::println);
    }
}
