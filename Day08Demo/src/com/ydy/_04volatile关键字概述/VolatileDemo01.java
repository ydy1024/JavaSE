package com.ydy._04volatile关键字概述;

/**
    目标：并发编程下，多线程访问变量的不可见性问题。

    引入：
        多个线程访问共享变量，会出现一个线程修改变量的值后，其他线程看不到变量最新值的情况。

    结论：
        并发编程下，多线程修改变量，会出现线程间变量的不可见性。

    不可见性的原因：
        每个线程都有自己的工作内存，线程都是从主内存拷贝共享变量的副本值。
        每个线程是在自己的工作内存中操作共享变量的。
 */
public class VolatileDemo01 extends Thread{
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=true;
        System.out.println("flag="+flag);
    }
}
class VisibilityDemo{
    public static void main(String[] args) {
        //启动子线程，修改flag
        VolatileDemo01 volatileDemo01 = new VolatileDemo01();
        volatileDemo01.start();

        //2.主线程
        while (true){
            if (volatileDemo01.isFlag()){
                System.out.println("主线程进入执行");
            }
        }
    }
}