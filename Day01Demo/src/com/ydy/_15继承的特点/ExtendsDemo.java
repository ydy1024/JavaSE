package com.ydy._15继承的特点;

/**
 目录：继承的特点

 1.单继承
    为什么Java是单继承？
        答：反证法，加入Java多继承，请看如下代码：
        class  A{
            public void test(){
                System.out.print("A");
            }
         }
        class  B{
            public void test(){
                System.out.print("B");
            }
        }
        class  C extends A,B{
            public static void main(String[] args){
                C c=new C();
                c.test();//出现了类的二义性！所以Java不能多继承
            }
        }
 2.多层继承：一个类可以间接继承多个类。
 3.一个类可以有多个子类。
 4.一个类要么继承Object类，要么间接继承了Object类，Object类是Java中的祖宗类。
 */
public class ExtendsDemo {
}

class A{

}
class B extends A{

}

class C extends B{

}