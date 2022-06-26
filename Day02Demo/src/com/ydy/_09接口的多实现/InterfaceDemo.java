package com.ydy._09接口的多实现;

/**
 目标：接口的多实现研究

 类与类是单继承关系。
 类与接口是多实现关系。

 类实现接口的格式：
    修饰符 class 实现类名称 implements 接口1，接口2{

    }
    implements：类实现接口的关键字。

 小结：
    一个类实现多个接口，必须重写所有接口中的全部抽象方法。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Basketball basketball = new Basketball();
        basketball.test();
    }
}


class Basketball implements SportMan,Law{
    public void test(){
        this.run();
        this.competition();
        this.rule();
    }

    @Override
    public void run() {
        System.out.println("开始跑步");
    }

    @Override
    public void competition() {
        System.out.println("开始比赛");
    }

    @Override
    public void rule() {
        System.out.println("遵纪守法");
    }
}

interface SportMan{
    void run();
    void competition();
}

interface Law{
    void rule();
}
