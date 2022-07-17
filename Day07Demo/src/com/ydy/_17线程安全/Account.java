package com.ydy._17线程安全;

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
    public void drawMoney(double v) {
        //开始判断取钱逻辑
        //1.先知道谁来取钱
        String name=Thread.currentThread().getName();
        //判断余额是否足够
        if (this.money>=v){
            System.out.println(name+"来取钱，余额足够，取出"+money);
            //3.更新余额
            this.money-=money;
            System.out.println(name+"取完钱，剩余"+this.money);
        }else {
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}
