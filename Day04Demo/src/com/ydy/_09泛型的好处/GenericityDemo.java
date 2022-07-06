package com.ydy._09泛型的好处;

import java.util.ArrayList;

/**
    目标：泛型的好处
        泛型在编译阶段约束了操作的数据类型，从而不会出现类型转换异常。
        体现的是Java严谨性和规范性，数据类型，经常需要进行统一。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<>();
        lists.add("ydy");
        lists.add("llh");
        lists.add("wwd");
//        lists.add(99);
//        lists.add(false);
        for (int i=0;i<lists.size();i++){
            Object o = lists.get(i);
            String  rs=(String) o;
            System.out.println(rs);
        }
    }
}
