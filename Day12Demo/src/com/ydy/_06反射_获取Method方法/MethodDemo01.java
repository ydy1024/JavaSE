package com.ydy._06反射_获取Method方法;


import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
    目标：反射-获取Method方法对象

    反射获取类的Method方法对象：
        1.public Method getMethod(String name, Class<?>... parameterTypes):
            根据方法名和参数类型获得对应的方法对象，只能获得public的
        2.public Method getDeclaredMethod(String name, Class<?>... parameterTypes):
            根据方法名和参数类型获得对应的方法对象，包括private的
        3.public Method[] getMethods():
            获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的
        4.public Method[] getDeclaredMethods():
            获得类中的所有成员方法对象，返回数组，只获得本类声明的方法。

    Method的方法：
        -public Object invoke(Object obj, Object... args)：
            参数一：触发的是哪个对象的方法执行。
            参数二：args：调用方法时传递的实际参数
 */
public class MethodDemo01 {
    Class<?> c;
    @Before
    public void before(){
        c= Dog.class;
    }
    /**
     * 1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclaredMethods(){
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"=>"+declaredMethod.getParameterCount()+"=>"+ Arrays.toString(declaredMethod.getParameterTypes()) +"=>"+declaredMethod.getReturnType());
        }
    }
    /**
     * 2.获取某个方法对象
     */
    @Test
    public void getDeclaredMethod() throws Exception{
        Method run = c.getDeclaredMethod("run");
        //触发执行
        Dog dog = new Dog();
        run.invoke(dog);
        /**
         * 参数一：方法名称
         * 参数二：方法的参数个数和类型（可变参数！）
         */
        Method eat = c.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        /**
         * 参数一：被触发方法所在的对象
         * 参数二：方法需要的入参值
         */
        eat.invoke(dog,"骨头");
    }
}
