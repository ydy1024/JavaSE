package com.ydy._13Objects类的使用;

import java.util.Objects;

/**
    目标：objects类的使用。
    objects类与objects还是继承关系。
    objects类是从JDK1.7开始之后才有的。

    objects的方法：
        1.public static boolean equals(Object a,Object b)
            --比较两个对象。
            --底层进行非空判断，从而可以避免空指针异常。更安全！！推荐使用
             public static boolean equals(Object a, Object b) {
             return (a == b) || (a != null && a.equals(b));
             }
        2.public static boolean isNull(Object obj)
            --判断变量是否为null，为null返回true，反之！
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.equals(student2));
        System.out.println(Objects.equals(student1,student2));//可以避免空指针异常。更安全！
        System.out.println(Objects.isNull(student1));

    }
}
