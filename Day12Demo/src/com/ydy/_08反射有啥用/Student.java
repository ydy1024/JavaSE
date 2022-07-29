package com.ydy._08反射有啥用;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String address;
    private String tel;

    public Student() {
    }

    public Student(String name, int age, char sex, String address, String tel) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.tel = tel;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
