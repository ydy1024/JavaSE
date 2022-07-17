package com.ydy._14线程的常用API;

/**
    目标：线程休眠API

    public static void sleep(long millis, int nanos)：让当前线程休眠多少毫秒再继续执行。

 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                //项目经理让我加上这段代码，如果加钱就去掉。
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
