package com.ydy._11继承后_方法重写;

/**
 目标：静态方法和私有方法是否可以被重写（扩展语法）
 可以吗？
 不可以,加上@Override
 */
public class ExtendsDemo03 {

}

class Computer{
    private void go(){

    }

    public static void test(){

    }
}

class Mac extends Computer{
//    @Override
    public void go() {

    }
//    @Override
    public static void test(){

    }
}