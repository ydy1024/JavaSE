package com.ydy._08工厂设计模式介绍;
//工厂设计模式
public class FactoryPattern {
    //生成对象的方法：工厂方法
    public static Animal createAnimal(){
        return new Dog();
    }
}
