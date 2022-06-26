package com.ydy._11包和权限修饰符.yao;

public class Fu {
    //1.private 只能本类中访问
    private void show1(){
        System.out.println("private");
    }
    //2.缺省：本类，同一个包下的类
    void show2(){
        System.out.println("缺省");
    }
    //3.protect:本类，同一个包下的类中，其他包下的子类
    protected void show3(){
        System.out.println("protected");
    }
    //4.任何地方都可以
    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu fu=new Fu();
        fu.show1();
        fu.show2();
        fu.show3();
        fu.show4();
    }
}
