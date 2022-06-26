package com.ydy._01知识回顾;
/**
    目标：知识回顾
    面向对象：用代码去高度模拟现实世界，以便为人类的业务服务
        Java是面向对象的高级编程语言

    注意：
        --类名的首字母应该大写，满足驼峰写法。
        -- 一个Java代码文件中可以定义多个类，但只能只有一个类是用public修饰的，而且public修饰的类名必须成为代码的文件名称。
    类中的成分研究：

 定义类的格式：
 修饰符 class 类名{
 //1.成员变量（Field：描述类和对象的属性信息的）。
 //2.成员方法（Method：描述类或者对象的行为信息的）
 //3.构造器（Constructor：初始化一个类的对象并返回引用）
 //4.代码块
 //5.内部类
 注意：只要不是这五大成分放在类下就会报错。
 }
 构造器的复习：
    作用：初始化一个类的对象并返回引用。
    格式：
        修饰符 类名（形参）{

 }
    构造器初始化对象的格式：
        类名 对象名称 =new 构造器；
    注意：一个类会默认自带一个无参构造器，即使不写他也存在，但是如果一个类它写了一个构造器，那默认的无参数构造器就会被覆盖了

    小结：
        类的五大成分
        构造器的作用
*/
public class ClassDemo {
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
class Student{

}
