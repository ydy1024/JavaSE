package com.ydy._06包装类的使用;

/**
    目标：包装类
    引入：
        Java认为一切皆对象。引用数据类型都是对象了。
        但是在Java8中基本数据类型不是对象，只是表示一种数据的类型形式。
        Java为了一切皆对象的思想统一，把8种基本数据类型转换成对应的类，这个类称为
        基本数据类型的包装类。
        基本数据类型                   包装类（引用数据类型）
        byte                            Byte
        short                           Short
        int                             Integer
        long                            Long
        float                           Float
        double                          Double
        char                            Character（特殊）
        自动装箱：可以把基本数据类型的值或者变量赋值给包装类。
        自动拆箱：可以把包装类的变量直接赋值给基本数据类型。

 */
public class PackageClass {
    public static void main(String[] args) {
        int a=12;
        Integer a1=12;
        Integer a2=a;//自动装箱

        double b=0.09;
        Double b1=0.09;

        Integer c=1;
        int c1=1;//自动拆箱

    }
}
