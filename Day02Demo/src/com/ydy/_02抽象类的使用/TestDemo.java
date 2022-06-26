package com.ydy._02抽象类的使用;

/**
 目标：抽象类的使用

 抽象类的作用：为了被子类继承

 结论：
    抽象类是为了被子类继承，约束子类要重写重选抽象方法。
    注意：一个类继承了抽象类，必须重写完抽象类的全部方法，否则这个类也必须定义为抽象类。
 */
public class TestDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.work();

        Manage manage = new Manage();
        manage.work();
    }
}
//需求：一家公司开发员工管理系统（讲师，班主任）
abstract class Employee{
    //每个子类都要完成工作这个功能，但是每个子类的工作内容不一样，那就定义抽象方法
    public abstract void work();
}

class Teacher extends Employee{
    @Override
    public void work() {
        System.out.println("讲师上课");
    }
}
class Manage extends Employee{
    @Override
    public void work() {
        System.out.println("班主任管理学生");
    }
}
