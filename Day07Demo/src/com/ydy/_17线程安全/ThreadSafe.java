package com.ydy._17线程安全;

/**
    目标：线程安全问题。

    线程安全问题：多个线程操作同一个共享资源的时候可能会出现线程安全问题。

    模拟出取款问题的案例：
        注意：用高度面向对象的思想设计。
        分析：
            （1）提供一个账户类Account.java作为创建共享资源账户对象的类。
            （2）定义一个线程类来用于创建2个线程分别代表小明和小红来取钱。

    小结：
        多个线程同时操作同一个共享资源的时候可能会出现线程安全问题。
 */
public class ThreadSafe {
    public static void main(String[] args) {
        //a.创建一个共享资源对象。
        Account account = new Account(100000.0,"ICBC-110");
        //b.创建2个线程对象去账户对象中取钱
        Thread t1 = new DrawThread(account,"小明");
        t1.start();
        Thread t2 = new DrawThread(account,"小红");
        t2.start();
    }
}
