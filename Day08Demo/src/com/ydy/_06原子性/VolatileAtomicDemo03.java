package com.ydy._06原子性;

import java.util.concurrent.atomic.AtomicInteger;

/**
    目标：保证原子性的方案二：使用原子类，性能高效，线程安全。

    概述：java从JDK1.5开始提供了java.util.concurrent.atomic包(简称Atomic包)，
        这个包中的原子操作类提供了一种用法简单，性能高效，线程安全地更新一个变量的方式。
    API：原子型Integer，可以实现原子更新操作
        public AtomicInteger()：	   				初始化一个默认值为0的原子型Integer
         public AtomicInteger(int initialValue)： 初始化一个指定值的原子型Integer
         int get():   			 				 获取值
         int getAndIncrement():      			 以原子方式将当前值加1，注意，这里返回的是自增前的值。
         int incrementAndGet():     				 以原子方式将当前值加1，注意，这里返回的是自增后的值。
         int addAndGet(int data):				 以原子方式将输入的数值与实例中的值（AtomicInteger里的value）相加，并返回结果。
         int getAndSet(int value):   			 以原子方式设置为newValue的值，并返回旧值。
    小结：
        使用原子类保证原子性操作，从而实现线程安全！
        加锁机制的性能较差！
        为什么使用原子类可以保证原子性操作，且性能好，而且线程安全呢？
            底层基于CAS乐观锁机制，每次修改数据不会加锁，等到修改的时候判断有没有别人修改了！
 */
public class VolatileAtomicDemo03 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable03();
        for (int i = 1; i <=100; i++) {
            //启动100个线程，执行100次任务！
            new Thread(target).start();
        }
    }

}

class MyRunnable03 implements Runnable{
    //创建一个Integer更新的原子类AtomicInteger，初始值为0；
    private AtomicInteger atomicInteger=new AtomicInteger();
    //一次任务是一个整体，加100
    @Override
    public void run() {
        synchronized ("ydy"){
            for (int i = 1; i <= 100; i++) {
                System.out.println("count==>"+atomicInteger.incrementAndGet());
            }
        }
    }
}