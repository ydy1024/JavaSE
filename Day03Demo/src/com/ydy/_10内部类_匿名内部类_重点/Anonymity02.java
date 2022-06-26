package com.ydy._10内部类_匿名内部类_重点;

/**
    目标：匿名内部类的使用形式。

    需求：很多角色要一起参加游泳比赛（老师，学生，运动员）
    重新上传
 */
public class Anonymity02 {
    public static void main(String[] args) {
        Swim s1=new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师游泳");
            }
        };
        go(s1);

        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生开始游泳");
            }
        });
    }
    //提供一个方法让全部角色进入比赛
    public static void go(Swim swim){
        System.out.println("开始");
        swim.swimming();
        System.out.println("结束");
    }
}

interface Swim{
    void swimming();
}