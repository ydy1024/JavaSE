package com.ydy._13Stream流的综合应用;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
    目标：综合案例
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("ydy");
        one.add("llh");
        one.add("zhy");
        one.add("wwd");
        one.add("wwf");
        one.add("wxq");
        one.add("lz");
        one.add("hy");
        one.add("dy");

        List<String> two = new ArrayList<>();
        two.add("姚道炎");
        two.add("刘力皓");
        two.add("曾宏勇");
        two.add("王伟东");
        two.add("吴文枫");
        two.add("吴学谦");
        two.add("龙珠");
        two.add("虎牙");
        two.add("斗鱼");

        /**
            1.第一个队伍只要名字为3个字的成员姓名
            2.第一个队伍筛选后只要前三人
         */
        Stream<String> oneStream = one.stream()
                                        .filter(s->s.length()==3)
                                        .limit(3);

        /**
            3.第二个队伍只要姓吴的成员姓名
            4.第二个队伍筛选之后不要前2个人
            5.将两个队伍合并为一个队伍
         */
        Stream<String> twoStream = two.stream().filter(s -> s.startsWith("吴")).skip(2);
        Stream<String> stringStream = Stream.concat(oneStream, twoStream);
        /**
            6.根据姓名创建‘student’对象
            7.打印整个队伍的Student对象信息
         */

        stringStream.map(Student::new).forEach(System.out::println);
    }
}
