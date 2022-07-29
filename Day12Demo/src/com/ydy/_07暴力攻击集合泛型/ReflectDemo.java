package com.ydy._07暴力攻击集合泛型;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
    扩展
        反射可以破坏面向对象的封装性，
        同时可以破坏泛型的约束性。
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        //泛型只能工作在编译阶段，运行阶段泛型就消失了
        //泛型工作在运行时阶段
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.3);
        scores.add(199.1);
        scores.add(89.2);

        //扩展：通过反射暴力的注入一个其他类型的数据进去。
        //a.先得到集合对象的Class文件对象
        Class c = scores.getClass();
        //b.从ArrayList的Class对象中定位add方法
        Method add = c.getDeclaredMethod("add", Object.class);
        //c.触发scores集合对象中的add执行(运行阶段，泛型是不能约束了)
        add.invoke(scores,"姚道炎");
        System.out.println(scores);
    }
}
