package com.ydy._09方法引用方式四_构造器引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
     目标：方法引用的四种形式：
         1.静态方法的引用。
         2.实例方法的引用。
         3.特点类型方法的引用。
         4.构造器引用。

    4.构造器引用:
        格式是：类名::new
        注意点：前后参数一致的情况下，又在创建对象就可以使用构造器引用。
        s->new Student(s)=>Student::new

    小结：
        方法引用是可遇不可求，能用则用，不能用就不用！
 */
public class ConstructorDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");
        //集合默认只能转成Object类型的数组。
        Object[] objs=lists.toArray();
        System.out.println("Object数组"+ Arrays.toString(objs));

        //我们想指定转换成字符串类型的数组！
        //最新的写法可以结合构造器引用实现！
        //JDK1.8不支持大于等于1.8
//        String[] str=lists.toArray(new IntFunction<String[]>(){
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        String[] strs= lists.toArray(String[]::new);
    }
}
