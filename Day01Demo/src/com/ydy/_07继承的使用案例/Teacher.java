package com.ydy._07继承的使用案例;

public class Teacher extends People{
    //特有功能
    public void teach(){
        System.out.println(getName()+"老师在上课！");
    }
}
