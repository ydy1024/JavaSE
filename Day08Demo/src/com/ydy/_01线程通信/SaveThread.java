package com.ydy._01线程通信;

//线程类，创建存钱线程
public class SaveThread extends Thread{
    //定义一个成员变量接收账户对象
    private Account acc;

    public SaveThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //三个爸爸
        //存100000
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
