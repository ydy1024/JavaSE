package com.ydy._14Stream流的终结与非终结;

import java.util.ArrayList;
import java.util.List;

/**
    目标：终结与非终结方法

    终结方法：一旦Stream调用了终结方法，流的操作都全部结束了，不能继续使用了，
            只能创建新的Stream操作。
            终结方法：foreach,count。
    非终结方法：每次调用完成以后返回一个新的流对象，可以继续使用，支持链式编程！
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("ydy");
        lists.add("llh");
        lists.add("zhy");
        lists.add("wwd");
        lists.add("wwf");
        lists.add("wxq");
        lists.add("lz");
        lists.add("hy");
        lists.add("dy");
        //终结方法forEach
        lists.stream().filter(s->s.startsWith("y"))
                        .filter(s->s.length()==3)
                        .forEach(System.out::println);
        long c=lists.stream().filter(s->s.startsWith("y"))
                        .filter(s->s.length()==3).count();
    }
}
