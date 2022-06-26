package com.ydy._04多态_引用类型强制类型转换;

/**
    目标：引用类型强制类型转换

 引用类型强制类型转换的语法：
    1.父类类型的变量或者对象必须强制类型转换成子类类型的变量，否则报错！

 强制类型转换的格式：
    类型 变量名称=（类型）（对象或者变量）

 注意：
    有继承/实现关系的两个类型就可以进行强制类型转换，编译阶段一定不会报错！
    但是运行阶段可能出现：类型转换异常ClassCastException

 Java建议在进行强制类型转换之前先判断变量的真实类型，再强制类型转换！
    变量instanceof类型：判断前面的变量是否是后面的类型或者其子类类型。

 总结：
    有继承/实现关系的两个类型就可以进行强制类型转换，编译阶段一定不会报错！但是运行阶段可能出现：类型转换异常ClassCastException;
    Java建议在进行强制类型转换之前先判断变量的真实类型，再强制类型转换！
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal wolf = new Wolf();
        wolf.run();
//        wolf.catchSheep(); //报错
        //1.把动物类型的变量a转换成真实的狼类型

        Wolf wolf1= (Wolf) wolf;
        wolf1.catchSheep();

        //2.多态下类型转换异常研究（重点）

        Animal a1=new Cat();
//        Wolf w1= (Wolf) a1;//编译阶段没有报错！在运行阶段可能出现类型转换异常。
        if (a1 instanceof Cat){
            Cat c1= (Cat) a1;
            c1.catchMouth();
        }else if (a1 instanceof Wolf){
            Wolf w1= (Wolf) a1;
            w1.catchSheep();
        }

    }
}
class Animal{
    public void run(){
        System.out.println("动物可以跑！");
    }
}
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("猫可以跑!");
    }
    public void catchMouth(){
        System.out.println("猫可以跑!");
    }
}
class Wolf extends Animal{
    @Override
    public void run() {
        System.out.println("狼可以跑！");
    }
    public void catchSheep(){
        System.out.println("狼可以抓羊！");
    }
}
