package com.ydy._03死锁;

/**
    目标：死锁

    死锁是这样一种情形：多个线程同时被阻塞，他们中的一个或者全部都在等待某个资源被释放。
        由于线程被无限期地阻塞，因此程序不可能正常中止。

        客户（占用资金，等待经销商的货品资源） 经销商（占用货品资源，等待客户的资金）

    java死锁产生的四个必要条件：
        1.互斥使用，即当资源被一个线程使用（占有）时，别的线程不能使用。
        2.不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。
        3.请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的占用。
        4.循环等待，即存在一个等待循环队列：p1要p2的资源，p2要p1的资源。这样就形成了一个循环等待。

        当上述四个条件都成立的时候，便形成死锁。当然，死锁的情况下如果打破上述任何一个条件便可让死锁消失。
        开发中应该避免死锁

    代码实现（一个必然死锁的案例，面试需要）

    小结：
        死锁代码形式上需要锁的嵌套！
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class TreadDead {
    //定义两个资源
    public static Object resource01=new Object();
    public static Object resource02=new Object();

    public static void main(String[] args) {
        //定义两个线程。
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource01){
                    System.out.println("线程1占用资源1请求资源2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource02){
                        System.out.println("线程1成功占用资源2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource02){
                    System.out.println("线程2占用资源2请求资源1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource01){
                        System.out.println("线程2成功占用资源1");
                    }
                }
            }
        }).start();
    }
}
