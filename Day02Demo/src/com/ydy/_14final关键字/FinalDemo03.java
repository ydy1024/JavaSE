package com.ydy._14final关键字;

/**
 了解：final修饰变量-局部变量。

 final修饰变量的总规则：有且仅能被赋值一次。
 fianl修饰静态成员变量，变量变成了常量。
 常量：有public static final修饰，名称字母全部大写，多个单词用下划线连接。

 扩展：
    final修饰静态成员变量可以在哪些地方赋值一次：
        1.定义的时候赋值一次。
        2.可以在静态代码块中赋值一次。
 */
public class FinalDemo03 {
    public static final String NAME="ydy";
    public static final String NAME1;
    static  {
        NAME1="ydy";
    }
    public static void main(String[] args) {
//        schoolName="ydy"
    }



}
