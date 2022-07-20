package com.ydy._08并发包_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
    目标：CountDownLatch的使用。（了解）

    CountDownLatch允许一个或多个线程等待其他线程完成操作，再执行自己。
    例如：线程1要执行打印：A和C,线程2要执行打印：B，但线程1在打印A后，
        要线程2打印B之后才能打印C，所以：线程1在打印A后，
        必须等待线程2打印完B之后才能继续执行。

    需求：
        提供A线程，打印A，C
        提供B线程，打印B

    构造器：
        public CountDownLatch(int count):初始化唤醒需要的down几步
    方法：
        public void await() throws InterruptedException：让当前线程等待，必须down
        public void countDown()：计数器进行减1（down 1）
    小结：
        CountDownLatch可以控制线程在执行的过程等待自己，让其他线程执行完毕后唤醒自己
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        //创建一个CountdownLatch对象用于监督A，B线程的执行情况。
        CountDownLatch count = new CountDownLatch(1);
        new ThreadB(count).start();
        new ThreadA(count).start();

    }
}
class ThreadA extends Thread{
    private CountDownLatch c;

    public ThreadA(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("A");
        //等待自己根据监督者中的数量决定,让当前线程让出CPU等待自己
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
class ThreadB extends Thread{
    private CountDownLatch c;

    public ThreadB(CountDownLatch c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("B");
        c.countDown();//让计数器减1，被等待的线程就唤醒了。
    }
}