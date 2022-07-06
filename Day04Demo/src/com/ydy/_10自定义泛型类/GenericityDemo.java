package com.ydy._10自定义泛型类;

import java.util.ArrayList;

/**
    目标：自定义泛型类

    引入：
        我们之前用的泛型都是别人写好，接下来我们来自定义泛型类使用

    泛型类的概念：
        使用了泛型定义的类就是泛型类。
    泛型类的格式：
        修饰符 class 类名<泛型变量>{

        }
        泛型变量建议使用E ，T ,K,V
    需求：
        模拟ArrayList自定义一个集合MyArrayList集合。
        泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。

    小结：
        自定义泛型的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。

 */
public class GenericityDemo {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("111");
        System.out.println(list);
    }
}
class MyArrayList<E>{
    private ArrayList lists=new ArrayList();
    public void add(E e){
        lists.add(e);
    }
    public void remove(E e){
        lists.remove(e);
    }
}