package com.ydy._01线程通信;
//账户类
public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    //小明小红
    public synchronized void drawMoney(double money) {
    try {
        //谁来取钱
        String name=Thread.currentThread().getName();
        //判断余额是否足够
        if (this.money>=money){
            //2.开始吐钱
            this.money-=money;
            System.out.println(name+"来取钱，取钱"+money+"剩余："+this.money);
            //3.取钱后没，唤醒别人，等待自己
            this.notifyAll();
            this.wait();
        }else {
            //4.余额不足
            //唤醒别人，等待自己
            this.notifyAll();
            this.wait();
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    //三个爹存钱
    public synchronized void saveMoney(double v) {
        try {
            //谁来存钱
            String name=Thread.currentThread().getName();
            //判断余额是否足够
            if (this.money>0){
                //2.有了钱，唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }else {
                this.money +=v;
                System.out.println(name+"来存钱："+v);
                //4.余额不足
                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
