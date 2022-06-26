package com.ydy._01知识回顾;

/**
 目标：this关键字知识回顾。
 this关键字的作用：
    this代表了当前对象的引用。
    this关键字可以用在实例方法中和构造器中。
    this用在方法中，谁调用这个方法，this就代表谁。
    this用在构造器，代表了构造器正在初始化的那个对象的引用。


 */

public class ThisDemo02 {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.setName("金毛");

        Animal a2 = new Animal("泰迪",3,'公');

    }
}
class Animal{
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //谁调用这个方法，this就代表谁！！！
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animal() {
    }
}
