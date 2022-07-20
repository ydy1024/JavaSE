package com.ydy._11并发包_Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
    目标：Exchanger

    使用场景：数据校准

    作用：
        Exchanger(交换者)是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。
        这两个线程通过exchange方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange方法，
        当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程生产出来的数据传递给对方。


    Exchanger构造方法:
        public Exchanger()
    Exchanger重要的方法：
        public V exchange(V x)
    分析：
        （1）需要2个线程
        （2）需要一个交换对象负责交换两个线程执行的结果。

    小结：
        Exchanger可以实现线程间的数据交换。
        一个线程如果等不到对方的数据交换就会一直等待。
        我们也可以控制一个线程等待的时间。
        必须双方都进行交换才可以正常进行数据的交换。
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger exchanger=new Exchanger();
        new Boy(exchanger).start();
        new Girl(exchanger).start();
    }
}
class Boy extends Thread{
    private Exchanger<String> exchanger;
    public Boy(Exchanger exchanger) {
        this.exchanger=exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("男孩开始做自己定情信物：同心锁🔒！");
            //交换结果:送出自己的定情信物，交换女孩的礼物
            String rs=exchanger.exchange("同心锁🔒",5, TimeUnit.SECONDS);
            System.out.println("男孩收到礼物："+rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Girl extends Thread{
    private Exchanger<String> exchanger;
    public Girl(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("女孩开始做自己定情信物：钥匙🔑！");
//            Thread.sleep(6000);
            //交换结果:送出自己的定情信物，交换女孩的礼物
            String rs = exchanger.exchange("钥匙🔑");
            System.out.println("女孩收到礼物：" + rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}