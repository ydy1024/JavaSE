package com.ydy._05抽象类设计模板模式;

/**
 目标：抽象类设计模板模式

 什么是设计模式？
    设计模式是前人在生产实战中发现的优秀软件设计架构和思想。
    后来者可以直接使用这些架构或思想就可以设计出优秀，提高开发效率，提高软件可扩展性和可维护性的软件。
 模板设计模式是一种经典的设计模式思想。

 作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写！
      可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现！

 作文模板：
    标题固定：
    第一段固定：请介绍一下你的爸爸，说说你的爸爸有多好，多牛逼。
    正文部分：抽象出来。
    结尾部分：

 小结：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写！
 可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现！
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.write();
    }
}

class Student extends Template{
    @Override
    public String writeMain() {
        return "\t\t我爸爸很厉害。";
    }
}

//1.设计一个模板类
abstract class Template{
    private String title="\t\t\t\t\t\t《我的爸爸》";
    private String one="\t\t请介绍一下你的爸爸";
    private String last="\t\t介绍结束";

    //2.写作文功能
    public void write(){
        System.out.println(title);
        System.out.println(one);
        //3.正文部分：正文部分模板不能确定，交给使用模板的人来写！
        System.out.println(writeMain());
        System.out.println(last);
    }
    //4.定义抽象方法
    public abstract String writeMain();
}