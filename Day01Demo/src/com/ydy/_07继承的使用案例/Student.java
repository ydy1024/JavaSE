package com.ydy._07继承的使用案例;

public class Student extends People{
    //特有功能
    public void study(){
        System.out.println(getName()+"同学在认真学习！");
    }
}
