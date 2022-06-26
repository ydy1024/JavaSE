package com.ydy._05成员变量和成员方法访问的扩展;

/**
 扩展：成员变量和成员方法访问的扩展。（面试常考）
 方法：实例方法，静态方法
 成员变量：实例成员变量，静态成员变量

 8种访问形式的问答：
    a.实例方法是否可以直接访问实例成员变量？
        可以，因为他们都属于对象。
    b.实例方法是否可以直接访问静态成员变量？
        可以，静态成员变量可以被共享访问。
    c.实例方法是否可以直接访问实例方法？
        可以。因为实例方法和实例方法都属于对象。
    d.实例方法是否可以直接访问静态方法？
        可以，静态方法可以被共享访问。
    -------------------------------------
    a.静态方法是否可以直接访问实例变量？
        不可以。实例变量必须使用对象访问。
    b.静态方法是否可以直接访问静态变量？
        可以。静态成员变量可以被共享访问。
    c.静态方法是否可以直接访问实例方法？
        不可以。实例方法必须使用对象访问。
    d.静态方法是否可以直接访问静态方法？
        可以，静态方法可以被共享访问。
 */
public class MethodFieldDemo {
    //静态成员变量
    public static String schoolName="广州软件学院";
    //实例成员变量
    public String name;

    //静态方法
    public static void test(){
        System.out.println(schoolName);
        System.out.println("测试");

    }
    //实例方法
    public void run(){
        System.out.println("跑步");
    }
    //实例方法
    public void eat(){
        run();
        test();
        System.out.println(name);
        System.out.println(schoolName);
    }
}
