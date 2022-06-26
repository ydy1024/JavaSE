package com.ydy._01多态的概述;

import java.util.Calendar;

/**
    目标：多态的入门概述；

    面向对象三大特征：封装，继承，多态

    多态的形式：
        父类类型 对象名称=new 子类构造器;
        接口 对象名称=new 实现类构造器;

        父类类型的范围>子类类型范围的。
    多态的概念：
        同一个类型的对象，执行同一个行为，在不同状态下会表现出不同的行为特征。
    多态的识别技巧：
        对于方法的调用：编译看左边，运行看右边；
        对于变量的调用：编译看左边，运行看左边;

    多态的使用前提：
        （1）必须存在继承或者实现关系。
        （2）必须存在父类类型的变量引用子类类型的对象。
        （3）需要存在方法重写。
    小结：
        记住多态的形式，识别，概念等语法即可！


 */
public class PolymorphicDemo {
    public static void main(String[] args) {
//        Cat cat=new Cat();
        //父类类型 对象名称=new 子类构造器;
        Animal cat = new Cat();
        cat.run();
        System.out.println(cat.name);

        Animal dog = new Dog();
        dog.run();
        System.out.println(cat.name);
    }
}

class Dog extends Animal{
    public String name="狗";
    @Override
    public void run() {
        System.out.println("狗会跑");
    }
}
class Cat extends Animal{
    public String name="猫";
    @Override
    public void run() {
        System.out.println("猫会跑");
    }
}
class Animal{
    public String name="动物";
    public void run(){
        System.out.println("动物跑！");
    }
}
