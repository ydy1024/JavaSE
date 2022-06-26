package com.ydy._08接口的基本实现;

/**
 目标：接口的基本实现

 子类       继承       父类
 实现类      实现         接口

 类与类是实现关系
 类与接口是实现关系。接口是被类实现的。
 实现接口的类称为：实现类

 类实现接口的格式：
    修饰符 class 实现类名称 implements 接口1，接口2{

    }
    implements：类实现接口的关键字。
小结：
    一个类实现接口，这个类被称为实现类。
    接口是用来被类实现的，实现的关键字是implements，接口可以多实现。
    一个类实现接口必须重写完接口中全部的抽象方法，否则这个类要定义成抽象类。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPangMan pingPangMan = new PingPangMan();
        pingPangMan.run();
        pingPangMan.competition();
    }
}

class PingPangMan implements SportMan{
    @Override
    public void run() {
        System.out.println("开始跑步");
    }

    @Override
    public void competition() {
        System.out.println("开始比赛");
    }
}

interface SportMan{
    void run();
    void competition();
}
