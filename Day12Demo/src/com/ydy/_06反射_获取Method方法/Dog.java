package com.ydy._06反射_获取Method方法;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("狗跑的贼快！");
    }
    private void eat(){
        System.out.println("狗吃骨头！");
    }
    private void eat(String name){
        System.out.println("狗吃"+name);
    }
    public static void inAddr(){
        System.out.println("在广州有一只单身狗！");
    }

}
