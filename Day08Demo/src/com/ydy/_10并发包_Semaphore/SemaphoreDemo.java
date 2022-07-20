package com.ydy._10并发包_Semaphore;

import java.util.concurrent.Semaphore;

/**
    目标：Semaphore的使用介绍

    引入：
        Semaphore（发信号）的主要作用是控制线程的并发占锁的数量。
        synchronized可以起到锁的作用，但某个时间段内，只能有一个线程允许执行。
        Semaphore可以设置同时允许几个线程执行。
        Semaphore字面意思是信号量的意思，它的作用是控制访问特定资源的线程数目。
    Semaphore的构造器：
        public Semaphore(int permits):permits表示许可线程的数量。
        public Semaphore(int permits, boolean fair):fair表示公平性，如果这个设为true,下次执行的线程会是等待最久的线程
    Semaphore的方法:
        public void acquire() throws InterruptedException:表示获取许可
        public void release():表示释放许可

    小结：
        Semaphore可以控制线程并发占锁的数量
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 1; i <= 5; i++) {
            MyThread myThread = new MyThread(service);
            myThread.start();
        }
    }
}

class MyThread extends Thread{
    private Service service;
    public MyThread(Service service) {
        this.service=service;
    }

    @Override
    public void run() {
        service.login();
    }
}
//业务代码
class Service{
    //1表示许可的意思，表示最多允许1个线程执行acquire()和release()之间的内容
    private Semaphore semaphore=new Semaphore(2);

    //登录
    public void login(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"进入 时间="+System.currentTimeMillis());
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"登录成功！");
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"离开 时间="+System.currentTimeMillis());
            semaphore.release();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}