package com.ydy._13泛型的通配符;

import java.util.ArrayList;

/**
    目标：泛型通配符

    需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛。

    注意：
        泛型没有继承关系！
    通配符：？
        ？可以用在使用泛型的时候代表一切类型。
        E,T,K,V是在定义泛型的时候使用
    泛型的上下限:
        ? extends Car:那么？必须是Car或者其子类.(泛型的上限)
        ？ super Car：那么？必须是Car或者其父类。（泛型的下限）

 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws=new ArrayList<>();
        bmws.add(new BMW());
        run(bmws);
        ArrayList<BENZ> benzs=new ArrayList<>();
        benzs.add(new BENZ());
        run(benzs);
    }
    public static void run(ArrayList<? extends Car> car){

    }
}
class Car{

}

class BMW extends Car{

}
class BENZ extends Car{

}