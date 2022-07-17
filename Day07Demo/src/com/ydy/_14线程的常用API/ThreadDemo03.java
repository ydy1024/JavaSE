package com.ydy._14线程的常用API;

/**
    目标：通过Thread类的有参数构造器为当前线程对象取名字。
        --public Thread()
        --public Thread(String name):创建线程对象并取名字。

 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        //3.创建一个线程对象
        Thread myThread1 = new MyThread02("1号线程");
        //4.调用线程对象的start()方法启动线程；最终还是执行run()方法！
        myThread1.start();


        Thread myThread2 = new MyThread02("2号线程");
        myThread2.start();


        //怎么获取主线程的名称？
        Thread.currentThread().setName("最强线程main");

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
//1.定义一个线程类继承Thread类
class MyThread02 extends Thread{
    public MyThread02(String name) {
        super(name);//调用父类的有参构造器初始化初始化当前线程对象的名称
    }

    //2.重写run()方法
    @Override
    public void run() {
        //线程的执行方法
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
