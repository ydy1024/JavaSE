package com.ydy._11JDK_1_8开始之后接口新增的方法;

/**
 目标：JDK1.8开始之后接口新增的三个方法。（sun公司，Stream，Lambda，函数式接口）【了解即可】

 JDK1.8之前接口只能是抽象方法和常量。
 JDK1.8之后接口不在纯洁。
 JDK1.8开始之后接口默认新增了三个方法：
    （1）默认方法:其实就是之前写的实例方法。
            --必须用default修饰
            --默认会加public
            --只能用接口的实现类的对象来调用。
    （2）静态方法：
            --可以直接加static修饰。
            --默认会加public
            --接口的静态方法只能用接口的类名称本身调用。
    （3）私有方法（从JDK1.9开始）；
            --其实就是私有的实例方法。必须加private修饰
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.run();
        SportMan.inaddr();
    }
}

class Sport implements SportMan{


}

interface SportMan{
    //1.默认方法:其实就是我们之前写的实例方法。
    default void run(){
        System.out.println("开始跑步");
//        go();
    }
    //2.静态方法：可以直接加static修饰。默认会加public修饰。
    //接口的静态方法只能用接口的类名称本身调用。
    public static void inaddr(){
        System.out.println("在广州");
    }
    //3.私有方法：私有的实例方法。
    //私有方法通常给私有方法或者给默认方法调用！
//    private void go(){
//        System.out.println("开始");
//    }

}