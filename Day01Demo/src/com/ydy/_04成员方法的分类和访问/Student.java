package com.ydy._04成员方法的分类和访问;

/**
 目标：成员方法的分类和访问。

 成员方法按照有无static修饰可以分为：
    （1）静态方法：有static修饰，属于类，直接用类名访问即可。
    （2）实例方法：无static修饰，属于对象的，必须用对象来访问。
 成员方法的访问语法：
    静态方法的访问格式：
        类名.静态方法
        对象.静态方法（不推荐）
    实例方法的访问格式：
        对象.实例方法

 总结：
    静态方法属于类，有static修饰，直接用类名访问即可。
    实例方法属于对象，无static修饰，必须先创建对象，然后用对象来访问。

    静态方法也可以被对象共享访问，但不推荐，因为静态方法直接用类来访问
 */

public class Student {
    //实例成员变量
    private String name;
    private int age;
    //1.静态方法:有static属于类，用类名直接访问！
    public static void inAddr(){
        System.out.println("我们在广州软件学院！");
    }
    //2.实例方法：无static修饰，属于对象，必须用对象访问！
    public void eat(){
        System.out.println(name+"已经"+age+"岁，再吃东西");
    }

    public static void main(String[] args) {
        //类名.静态方法
        Student.inAddr();
        //注意：在一个类中访问静态成员可以省略类名不写。
        inAddr();
        //对象.实例方法
        Student student=new Student();
        student.name="小明";
        student.age=10;
        student.eat();

        //对象静态方法
        student.inAddr();
    }
}
