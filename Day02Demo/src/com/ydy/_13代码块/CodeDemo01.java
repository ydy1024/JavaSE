package com.ydy._13代码块;

import java.util.ArrayList;
import java.util.List;

/**
 目标：静态代码块研究。（重点）

 类有5大成分：成员变量，方法，构造器，代码块，内部类。

 代码块按照有无static修饰可以分为：静态代码块，示例代码块

 （1）静态代码快：
    格式：static{

        }
    -- 必须用static修饰，属于类，会与类一起优先加载,而且自动触发执行一次!
    -- 静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作。（扩展）

    小结：
        静态代码块属于类的成分，应该用static修饰。属于类，会与类一起优先加载，而且自动触发执行一次。
        静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作。（扩展）

 */
public class CodeDemo01 {
    public static List<String> cards=new ArrayList<>();

    static {
        System.out.println("静态代码块！");//逼格高，代码优雅
        cards.add("大王");
        cards.add("红桃三");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        System.out.println(cards);
    }
}
