package com.ydy._17引用类型作为成员变量的类型;

/**
 目标：引用类型作为成员变量的类型（复合类型）
 */
public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ydy");
        student.setAge(18);
        Adress adress = new Adress("110","广州",98,99);
        student.setAdress(adress);

        Adress adress1 = student.getAdress();
        System.out.println(adress1.getCode()+"-->"+adress1.getName()+"-->"+adress1.getX()+"-->"+adress1.getY());
    }
}
