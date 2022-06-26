package com.ydy._15单例模式;

/**
    目标：单例设计模式。（面试重点，常考）

    什么是单例？
        单例的意思是一个类永远只存在一个对象，不能创建多个对象。
    为什么要用单例？
        开发中有很多类的对象我们只需要一个，例如虚拟机对象！任务管理器对象！
        对象越多占用内存越多，有些时候只需要一个对象就可以实现业务，单例可以节约内存，提高性能！

    如何实现单例？
        单例的实现方式：一共有8中，目前有2种方式：
            （1）饿汉单例设计模式：
                --通过类获取单例对象的时候，对象已经提前做好了！
                --实现步骤：
                    1.定义一个单例类
                    2.把类的构造器私有
                    3.定义一个静态成员变量用于存储一个对象！
                        （饿汉单例在返回对象的时候，对象要已经做好，所以这里直接创建出来！）
                    4.定义一个方法返回单例对象
            （2）懒汉单例设计模式：
                --通过类获取单例对象的时候发现没有对象才会去创建一个对象。
                --实现步骤：
                    1.定义一个单例类
                    2.把类的构造器私有
                    3.定义一个静态成员变量用于存储一个对象！
                        （不能直接创建对象，必须需要的时候创建对象）
                    4.定义一个方法返回单例对象,判断对象不存在才创建一次，存在直接返回！
 */
public class SingleInstanceDemo02 {
    public static void main(String[] args) {
        SingleInstance02 instance1 = SingleInstance02.getInstance();
        SingleInstance02 instance2 = SingleInstance02.getInstance();
        System.out.println(instance1==instance2);
    }
}

//懒汉式单例设计模式
class SingleInstance02{
    //2.定义一个静态成员变量用于存储一个对象！(不能直接创建对象，必须需要的时候创建对象)
    public static SingleInstance02 ins;
    //1.构造器私有
    private SingleInstance02(){

    }
    //3.通过方法返回对象，第一次不存在对象才创建一个返回

    public static SingleInstance02 getInstance(){
        if(ins==null){
            //第一次来取对象，创建一个对象
            ins=new SingleInstance02();
        }
        return ins;
    }
}

