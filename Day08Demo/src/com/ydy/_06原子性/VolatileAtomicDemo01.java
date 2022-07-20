package com.ydy._06原子性;

/**
    目标：volatile修饰变量的原子性研究

    什么是原子性！
        原子性，是指一次操作或者多次操作中，要么所以的操作全部都得到了执行并且不会受到任何因素的干扰而中断，要么所有的操作都不执行！

    volatile只能保证线程间变量的可见性!但是不能保证变量操作的原子性！

    小结：
        volatile只能保证线程间变量的可见性!但是不能保证变量操作的原子性！
 */
public class VolatileAtomicDemo01 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        for (int i = 1; i <=100; i++) {
            //启动100个线程，执行100次任务！
            new Thread(target).start();
        }
    }

}
class MyRunnable implements Runnable{
    private volatile int count;
    //一次任务是一个整体，加100
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            count++;
            System.out.println("count==>"+count);
        }
    }
}