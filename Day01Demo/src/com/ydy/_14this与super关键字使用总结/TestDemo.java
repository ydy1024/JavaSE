package com.ydy._14this与super关键字使用总结;

/**
 总结与扩展：this与super关键字使用总结

 this代表了当前对象的引用（继承中指代子类对象）
    this.子类成员变量。
    this.子类成员方法。
    this(...)：可以根据参数匹配访问本类其他构造器。（还没有学习）
 super代表了父类对象的引用（继承中指代了父类对象空间）
    super.父类成员变量。
    super.父类的成员方法。
    super(...):根据参数匹配访问本类其他构造器。
 扩展：
    this(...)根据参数匹配访问本类其他构造器。
 注意：
    this(...)借用本类其他构造器
    super(...)调用父类的构造器
    this(...)和super(...)必须放在构造器的第一行，否则报错！
    所以this(...)和super(...)不能同时出现在构造器中；
 */
public class TestDemo {
    public static void main(String[] args) {
        Studnet studnet = new Studnet("ydy",18);
        System.out.println(studnet.getName());
        System.out.println(studnet.getAge());
        System.out.println(studnet.getSchoolName());
    }
}

class Studnet{
    private String name;
    private int age;
    private String schoolName;

    public Studnet() {
    }

    public Studnet(String name, int age) {
//        this.name = name;
//        this.age = age;
        this(name,age,"heima");

    }

    public Studnet(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
