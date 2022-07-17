package com.ydy._19线程同步_同步方法;

public class Account {
    private double money;
    private String cardID;

    public Account() {
    }

    public Account(double money, String cardID) {
        this.money = money;
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
    //取钱方法
    public synchronized void drawMoney(double v) {
        //开始判断取钱逻辑
        //1.先知道谁来取钱
        String name=Thread.currentThread().getName();
        //2.判断余额是否足够

           if (this.money>=v){
               //3.余额足够
               System.out.println(name+"来取钱，余额足够，取出"+money);
               //4.更新余额
               this.money -= money;
               //5.输出结果
               System.out.println(name+"来取钱成功，取钱后剩余："+this.money);
           }else {
               System.out.println(name+"来取钱，余额不足！剩余"+this.money);
           }

    }
}
