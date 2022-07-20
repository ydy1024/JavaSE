package com.ydy._06原子性;

/**
    目标：保证原子性的方案一：加锁

    加锁机制性能较差。

 */
public class VolatileAtomicDemo02 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable02();
        for (int i = 1; i <=100; i++) {
            //启动100个线程，执行100次任务！
            new Thread(target).start();
        }
    }

}

class MyRunnable02 implements Runnable{
    private volatile int count;
    //一次任务是一个整体，加100
    @Override
    public void run() {
        synchronized ("ydy"){
            for (int i = 1; i <= 100; i++) {
                count++;
                System.out.println("count==>"+count);
            }
        }
    }
}