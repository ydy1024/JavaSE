package com.ydy._08继承_子类不能继承父类的内容;

/**
 目标：子类不能继承父类的内容。

 引入：
    子类继承父类，子类就可以得到了父类的属性和行为。
    但是并非所有父类的属性和行为等 子类都可以继承。

 子类不能继承父类的东西：
    子类不能继承父类的构造器：子类有自己的构造器。（没有争议的）
 有争议的观点：（扩展）
    子类是否可以继承父类的私有成员（私有成员变量，私有成员方法）？
        --子类可以继承父类的私有成员的，只是不能直接访问而已。
        --以后可以暴力去访问继承自父类的私有成员。~~~~
    子类是否可以继承父类的静态成员？
        --子类不能继承父类的静态成员的，
        --子类是只是可以访问父类的静态成员，父类的静态成员只有一份可以被子类共享访问。
            共享并继承。

 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        System.out.println(cat.age);
        System.out.println(cat.name);
        cat.run();

        Cat.test();
    }
}
class Cat extends Animal{

}

class Animal{
    public static int money=20;
    public String name;
    private int age;
    public void run(){

    }
    public static void test(){}
}