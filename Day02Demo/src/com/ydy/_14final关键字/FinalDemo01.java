package com.ydy._14final关键字;

/**
 目标：final关键字讲解。

 final是“最终”的含义。

 final用于修饰类，方法，变量。
 （1）final修饰类：类不能被继承了。
 （2）final修饰方法：方法不能被重写。
 （3）fianl修饰变量，变量有且仅能被赋值一次。

 扩展：请问abstract和final的关系是什么？
    互斥关系，不能同时出现修饰成员
 */
public class FinalDemo01 {

}

class Animal{
//    public final void run(){
//
//    }
}
class Cat extends Animal{

    public void run() {

    }
}

