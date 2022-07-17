package com.ydy._14线程的常用API;

/**
    目标：线程的常用API

    Thread类的API：
        1.public final synchronized void setName(String name):给当前线程取名字。
        2. public final String getName():获取当前线程的名字。
            --线程存在默认名称，子线程的默认名称是：Thread-索引。
            --主线程的默认名称就是：main
        3.public static native Thread currentThread():
            --获取当前线程对象，这个代码在哪个线程中，就得到哪个线程对象。
 */
public class ThreadDemo {

    //启动后的threadDemo当一个进程
    //main方法是由主线程执行的，理解成main方法就是一个主线程
    public static void main(String[] args) {
        //3.创建一个线程对象
        Thread myThread1 = new MyThread();
        //4.调用线程对象的start()方法启动线程；最终还是执行run()方法！
        myThread1.start();
        myThread1.setName("1号线程");
//        System.out.println(myThread1.getName());

        Thread myThread2 = new MyThread();
        myThread2.start();
        myThread2.setName("2号线程");
//        System.out.println(myThread2.getName());

        //怎么获取主线程的名称？
        Thread name1=Thread.currentThread();
        name1.setName("最强线程main");
//        System.out.println(name.getName());

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
//1.定义一个线程类继承Thread类
class MyThread extends Thread{
    //2.重写run()方法
    @Override
    public void run() {
        //线程的执行方法
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
