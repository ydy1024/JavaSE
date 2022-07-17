package com.ydy._13线程的使用注意事项;

/**
    目标：线程的注意事项。

    1.线程的启动必须调用start()方法。否则当成普通类处理。
        --如果线程直接调用run()方法，相当于变成了普通类的执行，此时将只有主线程在执行他们！
        --start()方法底层其实是给CPU注册当前线程，并且触发run()方法执行。
    2.建议线程先创建子线程，主线程的任务放在之后。
 */
public class ThreadDemo {
    //启动后的threadDemo当一个进程
    //main方法是由主线程执行的，理解成main方法就是一个主线程
    public static void main(String[] args) {
        //3.创建一个线程对象
        Thread myThread = new MyThread();
        //4.调用线程对象的start()方法启动线程；最终还是执行run()方法！
        myThread.start();

        for (int i=0;i<10;i++){
            System.out.println("main线程输出："+i);
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
            System.out.println("子线程输出："+i);
        }
    }
}
