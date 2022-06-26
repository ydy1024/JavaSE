package com.ydy._11继承后_方法重写;

/**
 目标：super调用父类被重写方法

 super：代表了父类引用.
 super可以用在子类的实例方法中调用父类被重写的方法
 */
public class ExtendsDemo02 {
    public static void main(String[] args) {
        SportMan sportMan = new SportMan();
        sportMan.run();
    }
}
class People{
    public void run(){
        System.out.println("人会跑！");
    }
}
class SportMan extends People{
    @Override
    public void run() {
        System.out.println("运动员跑的更快");
        super.run();
    }
}
