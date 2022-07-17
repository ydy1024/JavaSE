package com.ydy._02异常_常见的运行时异常;

/**
    扩展：常见的运行时异常。（面试题）

    运行时异常的概念：
        继承自RuntimeException的异常或者其子类，编译阶段是不会出错的，它是在运行时阶段可能出现的错误，
        运行时异常编译阶段可以处理也可以不处理，代码编译都能通过！！

    1.数组索引越界异常：ArrayIndexOutOfBoundsException。
    2.空指针异常：NullPointerException。
        直接输出没有问题。但是调用空指针的变量的功能就会报错！！
    3.类型转换异常：ClassCastException。
    4.迭代器遍历没有此元素异常：NoSuchElementException。
    5.数字操作异常：ArithmeticException。
    6.数字转换异常：NumberFormatException。

    小结：
        运行时异常继承了RuntimeException，编译阶段不报错，运行时才可能出现错误！
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        /**
         * 1.数组索引越界异常：ArrayIndexOutOfBoundsException。
         */
        int[] arr={10,20,30};
        System.out.println(arr[3]);

        /**
         * 2.空指针异常：NullPointerException。
         */
        String name=null;
        System.out.println(name.length());
        /**
         * 3.类型转换异常：ClassCastException。
         */
        Object o="ydy";
        int a=(Integer)o;
        System.out.println(a);
        /**
         * 5.数字操作异常：ArithmeticException。
         */
        int c=10/0;
        System.out.println(c);
        /**
         * 6.数字转换异常：NumberFormatException。
         */
        String num="23y";
        Integer it=Integer.valueOf(num);
        System.out.println(it);
    }
}
