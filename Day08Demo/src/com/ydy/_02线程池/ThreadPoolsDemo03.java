package com.ydy._02线程池;

import java.util.concurrent.*;

/**
     目标：创建一个线程池。

     线程池在Java中的代表类：ExecutorService(接口)

     Java在Executors类下提供了一个静态方法得到一个线程池的对象：
         1.public static ExecutorService newFixedThreadPool(int nThreads):
            创建一个线程池返回。

     ExecutorService提交线程任务对象执行的方法：
        1.Future<?> submit(Runnable task)：提交一个Runnable的任务对象给线程池执行。
        2.<T> Future<T> submit(Callable<T> task);

     小结：
        Callable做线程池的任务可以得到线程执行的结果！
 */
public class ThreadPoolsDemo03 {
    public static void main(String[] args) {
        //a.创建一个线程池，指定线程的固定数为3
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //b.提交Callable的任务对象后返回一个未来任务对象！
        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));
        //c.获取线程池执行任务的结果
        try {
            String rs1=f1.get();
            String rs2=f2.get();
            String rs3=f3.get();
            String rs4=f4.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            System.out.println(rs4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pool.shutdown();

    }
}
class MyCallable implements Callable<String>{
    //使用线程池计算出1-100，1-200，1-300的和返回！
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"执行的结果是："+sum;
    }
}