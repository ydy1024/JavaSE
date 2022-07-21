package com.ydy._10Stream流概述;

import java.util.ArrayList;
import java.util.List;

/**
    目标：演示Stream流的强大。

    什么是Stream流？
        在Java8中，得益于Lambda表达式所带来的函数式编程，
        引入了一个全新的Stream流概念，用于解决已有集合/数组类库既有的弊端。

    Stream能解决什么问题？
        可以解决已有集合类库或者数组API的弊端。
        Stream认为集合和数组操作的API很不好用，所以采用了Stream流简化集合和数组的操作！！

    小结：
        Stream流的核心思想：把集合或者数组转成一个Stream流（传送带）
        然后使用Stream流的强大功能进行元素的处理！
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        //需求：从集合中筛选出所以姓张的人出来，然后再找出姓名长度是3的人。
        List<String> lists = new ArrayList<>();
        lists.add("姚道炎");
        lists.add("刘力皓");
        lists.add("王伟东");
        lists.add("张三");
        lists.add("李四");
        lists.add("吴文枫");
        lists.add("姚瑶");
        lists.add("姚道敏");

        lists.stream().filter(s->s.startsWith("姚"))
                      .filter(s->s.length()==3)
                      .forEach(System.out::println);
//        //a.找出姓姚的人。
//        List<String> yaoLists = new ArrayList<>();
//        for (String s : lists) {
//            if (s.startsWith("姚")){
//                yaoLists.add(s);
//            }
//        }
//        System.out.println(yaoLists);
//        //b.姚姓姓名长度为3的人。
//        List<String> yaoThreeLists = new ArrayList<>();
//        for (String list : yaoLists) {
//            if (list.length()==3){
//                yaoThreeLists.add(list);
//            }
//        }
//        System.out.println(yaoThreeLists);
    }
}
