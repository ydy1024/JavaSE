package com.ydy._17引用类型作为成员变量的类型;

public class Student {
    private String name;
    private int age;
    //地址信息:复合类型。
    //引用类型作为成员变量的类型。
    private Adress adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
