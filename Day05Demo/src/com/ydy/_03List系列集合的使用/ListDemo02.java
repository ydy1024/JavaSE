package com.ydy._03List系列集合的使用;

import java.util.ArrayList;
import java.util.Iterator;

/**
    扩展：List系列集合的遍历方式有：4种

    List系列集合多了索引，所以多了一种按照索引遍历集合的for循环。

    List遍历方式：
        （1）for循环。
        （2）迭代器。
        （3）foreach。
        （4）JDK1.8新技术。
 */
public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("java");
        lists.add("mysql");
        lists.add("mybatis");
        lists.add("spring");
        lists.add("python");
        //1.for循环
        for (int i = 0; i < lists.size(); i++) {
            String ele=lists.get(i);
            System.out.println(ele);
        }
        System.out.println("--------------------------");
        //2.迭代器
        Iterator<String> it=lists.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------------");
        //3.foreach
        for (String s:lists){
            System.out.println(s);
        }
        System.out.println("--------------------------");
        //Lambda表达式
        lists.forEach(System.out::println);
        System.out.println("--------------------------");
        lists.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("--------------------------");
        lists.forEach(s-> System.out.println(s));
    }
}
