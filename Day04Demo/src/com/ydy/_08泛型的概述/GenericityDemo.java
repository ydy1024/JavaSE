package com.ydy._08泛型的概述;

import java.util.ArrayList;

/**
    目标：泛型的概述
    什么是泛型？
        泛型就是一个标签：<数据类型>
        泛型可以在编译阶段约束只能操作某种数据类型。
    注意：JDK1.7开始之后，泛型后面的声明可以省略不写！！
        泛型和集合都只能支持引用数据。不支持基本数据类型。
    小结：
        泛型是一个标签，可以在编译阶段约束只能操作某种数据类型。
        泛型和集合都只能支持引用数据类型，不支持基本数据类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
//        list.add(1);
        list.add("mysql");
//        list.add('a');
        System.out.println(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(30);
        System.out.println(list2);
    }
}
