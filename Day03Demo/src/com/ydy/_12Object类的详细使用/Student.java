package com.ydy._12Object类的详细使用;


import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
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
    //重写equals

    @Override
    public boolean equals(Object o) {
        //1.判断obj是否是学生类型，学生只能和学生比较！
        if (o instanceof Student) {
            //obj是学生类型了
            //把obj强制类型转换成学生对象
            Student student = (Student) o;
            //2.判断内容是否一样，一样返回true
            return  (this.name.equals((student.name)) && this.age == student.age && this.sex == student.sex);

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        //重写toString()方法
        return "Student[name="+name+",age="+age+",sex="+sex+"]";
    }
}
