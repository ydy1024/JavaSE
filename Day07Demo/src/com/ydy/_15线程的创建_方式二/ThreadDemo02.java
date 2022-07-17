package com.ydy._15线程的创建_方式二;

/**
    目标：方式二的匿名内部类写法。简化写法。
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //3.创建一个线程任务对象(线程任务对象不是线程对象，只是执行线程任务的)
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"==>"+i);
                }
            }
        };
        //把线程任务对象包装成线程对象，且可以指定线程名称
        Thread thread = new Thread(myRunnable);
        //调用线程对象的start()方法启动线程。
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"==>"+i);
                }
            }
        }).start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
