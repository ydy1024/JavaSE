package com.ydy._07接口的概述;

/**
 目标：接口的概述

 什么是接口？
    接口是更加彻底的抽象，在JDK1.8之前接口中只能是抽象方法和常量。
    接口体现的是规范思想，实现接口的子类必须重写完接口的全部抽象方法。

 接口的定义格式：
    修饰符 interface 接口名称{
    //在JDK1.8之前接口中只能是抽象方法和常量。
    }
    interface定义接口的核心关键字。

 接口的成分研究：
    在JDK1.8之前接口中只能是抽象方法和常量。

    1.抽象方法：
        接口中的抽象方法可以省略public abstract不写，默认会加上！
    2.常量：变量值只有一个，而且在程序运行的过程中不可更改！
           常量一般修饰符是：public static final
            接口中的常量可以省略public static final不写

 小结：
    接口体现的是规范思想。
    JDK1.8之前接口中只有抽象方法和常量！
    接口中抽象方法 public abstract可以不写
    接口中常量的  public static final可以不写
    除此之外，接口没有其他成分

 */
public interface InterfaceDemo {
    //1.抽象方法
    //接口中的抽象方法可以省略public abstract不写，默认会加上！
//    public abstract void run();
    void run();

    //2.常量：变量值只有一个，而且在程序运行的过程中不可更改！
    //常量一般修饰符是：public static final
    //接口中的常量可以省略public static final不写
    public static final String SCHOOL_NAME="广州软件学院";
}
