package com.ydy._04Set系列集合;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private int age;
    //重写了方法
    //e1.compareTo( o)
    //比较者：this
    //被比较者：o
    //需求按照年龄比较
    @Override
    public int compareTo(Employee o) {
        //规则：Java规则：
        // 如果程序员认为比较者大于被比较者返回正数！！
        //如果程序员认为比较者小于被比较者返回负数！！
        //如果程序员认为比较者等于被比较者 返回0！
//        if (this.age>o.age){
//            return 1;
//        }else if (this.age<o.age){
//            return -1;
//        }
//        return 0;
        return this.age-o.age;
    }

    public Employee() {
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }




}
