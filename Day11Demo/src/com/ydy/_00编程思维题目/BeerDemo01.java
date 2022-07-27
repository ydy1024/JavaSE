package com.ydy._00编程思维题目;

/**
    目标：非规律化思维，思维扩展

    啤酒问题：
        啤酒2块一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶。

    线性思维：
 */
public class BeerDemo01 {
    //可以买酒的总数
    public static int totalNums;
    public static int lastBottleNums;
    public static int lastCapNums;
    public static void main(String[] args) {
        buyBeer(10);
        System.out.println("总数："+totalNums);
        System.out.println("剩下盖子："+lastCapNums);
        System.out.println("剩下盖子："+lastBottleNums);
    }

    //定义一个方法帮助用户买酒
    public static void buyBeer(int money){
        //拿钱买酒
        int number=money/2;

        //累加起来
        totalNums+=number;

        //算出剩余全部盖子和瓶子数，换算成金额继续购买
        int currentBottles=lastBottleNums+number;
        int currentCaps=lastCapNums+number;

        //把他们换算成金额
        int totalMoney=0;
        totalMoney+=(currentBottles/2)*2;

        //算出剩下的瓶子
        lastBottleNums=currentBottles%2;

        //换算剩下的盖子
        totalMoney+=(currentCaps/4)*2;
        lastCapNums=currentCaps%4;

        //继续拿钱买酒
        if (totalMoney>=2){
            buyBeer(totalMoney);
        }
    }
}
