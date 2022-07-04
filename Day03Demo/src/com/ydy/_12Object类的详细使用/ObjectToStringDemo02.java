package com.ydy._12Object类的详细使用;

/**
    目标：常用API的学习-object类的toString方法使用详解。
    引入：
        包：java.lang.object
        object类是Java中的祖宗类。
        一个类要么默认继承了object类，要么间接继承了object类。
        object类的方法是一切子类都可以直接使用的，所以我们要学习object类的方法。

    object类的常用方法：
        （1）public String toString():
            --默认是返回当前对象在堆内存中的地址信息：com.ydy._12Object类的详细使用.Student@28d93b30
            --默认的地址信息格式：类的全限名@内存地址
            --直接输出对象名称，默认会调用toString()方法。所以直接输出对象可以省略toString()
            --实际开发中直接输出对象，输出对象的地址是没有任何实际意义的。
                所以toString()方法存在的意义就是为了被子类重写。
                以便能够返回对象的数据内容输出。因为实际开发中我们输出对象更多的时候是希望看到对象的数据内容信息。
        小结：
            toString()默认是返回当前对象在堆内存中的地址信息，开发中要重写。
        （2）public boolean equals(Object o);
 */

public class ObjectToStringDemo02 {
    public static void main(String[] args) {
        Student student1=new Student("ydy",20,'男');
        Student student2=new Student("ydy",20,'男');
        //直接调用toString方法返回的是对象在内存重点的地址
        //直接输出对象名称，默认会自动调用toString()方法，所以输出对象toString()调用可以省略不写
        System.out.println(student1.toString());
        System.out.println(student1);
    }
}
