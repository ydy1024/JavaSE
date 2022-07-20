package com.ydy._05变量不可见性解决;

/**
    目标：并发编程下，不可见性解决方案。
    现象：并发编程下，多线程修改变量，会出现线程间变量的不可见性。
    解决线程间变量的不可见性的方案的两种常见方式：
        1.加锁
            --每次加锁会清空线程自己的工作内存，然后重新读取主内存。
        2.对共享变量进行volatile关键字修饰。
            --volatile修饰的变量可以在多线程并发修改下，实现线程间变量的可见性。
            --一旦一个线程修改了volatile修饰的变量，另一个线程可以立即取到最新值。

 */
public class VolatileDemo01 extends Thread{
    private volatile boolean flag = false;

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
            //a.加锁解决，加锁会清空工作内存，读取主内存的最新值到工作内存中来！
//            synchronized (VisibilityDemo.class){
//                if (volatileDemo01.isFlag()){
//                    System.out.println("主线程进入执行");
//                }
//            }

            if (volatileDemo01.isFlag()){
                System.out.println("主线程进入执行");
            }

        }
    }
}