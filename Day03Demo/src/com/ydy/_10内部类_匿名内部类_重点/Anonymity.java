package com.ydy._10内部类_匿名内部类_重点;

/**
    目标：匿名内部类的概述

    什么是匿名内部类？
        就是一个没有名字的局部内部类。
        匿名内部类目的是：简化代码，也是开发中常用的形式。

    匿名内部类的格式：
        new 类名|抽象类|接口（形参）{
            方法重写。
        }

    匿名内部类的特点：
        1.匿名内部类是一个没有名字的内部类。
        2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
        3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型。
 */
public class Anonymity {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.run();

        Animal a= new Animal(){
            @Override
            public void run() {
                System.out.println("猫跑的块");
            }
        };
        a.run();
    }
}
//class Cat extends Animal{
//    @Override
//    public void run() {
//        System.out.println("猫在跑!");
//    }
//}

abstract class Animal{
    public abstract void run();

    public void go(){
        System.out.println("go");
    }
}