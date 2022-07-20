package com.ydy._02线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
    目标：创建一个线程池。

    线程池在Java中的代表类：ExecutorService(接口)

    Java在Executors类下提供了一个静态方法得到一个线程池的对象：
        1.public static ExecutorService newFixedThreadPool(int nThreads):
            创建一个线程池返回。

    ExecutorService提交线程任务对象执行的方法：
        1.Future<?> submit(Runnable task)：提交一个Runnable的任务对象给线程池执行。

    小结：
        pools.shutdown();//等待任务执行完毕以后才会关闭线程池
        pools.shutdownNow();//立即关闭线程池的代码，无论任务是否执行完毕！
        线程池中的线程可以被复用，线程用完以后可以继续去执行其他任务。
 */
public class ThreadPoolsDemo02 {
    public static void main(String[] args) {
        //a.创建一个线程池，指定线程的固定数量是3。
        ExecutorService pools=Executors.newFixedThreadPool(3);
        //b.添加线程任务让线程池处理。
        Runnable target=new MyRunnable();
        //第一次提交任务，创建新线程，自动触发执行
        pools.submit(target);
        pools.submit(target);
        pools.submit(target);
        //第四次提交任务，复用之前的线程
        pools.submit(target);

        pools.shutdown();//等待任务执行完毕以后才会关闭线程池
//        pools.shutdownNow();//立即关闭线程池的代码，无论任务是否执行完毕！
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}