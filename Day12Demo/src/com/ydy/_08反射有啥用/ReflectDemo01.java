package com.ydy._08反射有啥用;

/**
    扩展的作用

    可以在运行时得到一个类的全部成分然后操作。
    可以破坏封装性。也可以破坏泛型的约束性。

    更重要的用途是适合：做Java的高级框架，基本上主流框架都会基于反射设计一些通用技术功能。

    Mybatis框架：
        你给任何一个对象数据我都可以直接帮你解析字段并且把对应数据保存起来。
        Student（注册，把信息字段都存储起来）
        Teacher（注册，把信息字段都存储起来）
        Manager（注册，把信息字段都存储起来）

        我现在用反射技术开发一个框架实现：
            任何对象只要给我，我就可以把信息和字段都解析并存储起来。

    小结：
        反射适合做通用技术框架的底层实现，在框架的底层源码中我们经常看到反射的影子！！
 */
public class ReflectDemo01 {
    public static void main(String[] args) {
        Student student = new Student("姚道炎",22,'男',"广州","1285012");
        Mybatis.save(student);
        Pig pig = new Pig("佩奇",20.2,"粉红色","姚道炎","母猪");
        Mybatis.save(pig);
    }
}
