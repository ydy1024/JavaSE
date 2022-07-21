package com.ydy._08方法引用方式三_特定类型的方法引用;

import java.util.Arrays;
import java.util.Comparator;

/**
     目标：方法引用的四种形式：
         1.静态方法的引用。
         2.实例方法的引用。
         3.特点类型方法的引用。
         4.构造器引用。

    3.特点类型方法的引用：
        特定类型：String，任何类型。
        格式：
            特定类型::方法。

        注意：
            如果第一个参数列表中的形参中的第一个参数作为了后面的方法的调用者，
            并且其余参数作为后面方法的形参，那么就可以用特定类型方法引用了。
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        String[] strings = {"ydy","llh","wwd","zhy","wxq","xcf","Zsad","Awsd","Nike"};

        //需求：按照字符串的首字符（忽略大小写）升序排序
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);//按照元素的首字符（忽略大小写）比较
            }
        });

        Arrays.sort(strings,(s1,s2)->s1.compareToIgnoreCase(s2));
        //特定类型的方法引用
        Arrays.sort(strings,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}
