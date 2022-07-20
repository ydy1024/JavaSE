package com.ydy._09并发包_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
    目标：CyclicBarrier
    场景：多线程下载，
    CyclicBarrier作用：
        某个线程任务必须等待其他线程执行完毕以后才能最终触发自己执行。
    例如：公司召集5名员工开会，等5名员工都到了，会议开始。
        我们创建5个员工线程，1个开会任务，几乎同时启动
        使用CyclicBarrier保证5名员工线程全部执行后，再执行开会线程。
    构造器：
        public CyclicBarrier(int parties, Runnable barrierAction):
            -用于在线程到达屏障5时，优先执行barrierAction，方便处理更复杂的业务场景。
    方法：
        public int await():
            -每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被回收
    小结：
        可以实现多线程中，某个任务在等待其他线程执行完毕以后触发。
        循环屏蔽可以实现达到一组屏障就触发一个任务执行！
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        //2.创建一个循环屏障对象，等到5个线程执行完毕以后触发一次任务线程（开会）！
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,new Meeting());
        //1.创建一个任务循环屏蔽对象。
        for (int i = 1; i <=10; i++) {
            new EmployeeThread("员工"+i,cyclicBarrier).start();
        }
    }
}
class Meeting implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始组织会议！");
    }
}

class EmployeeThread extends Thread{
    private CyclicBarrier c;
    public EmployeeThread(String name,CyclicBarrier c) {
        super(name);
        this.c=c;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"正在进入会议室");
            c.await();//每个线程调用await方法告诉CyclicBarrier我已经到达了，然后当前线程被回收
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}