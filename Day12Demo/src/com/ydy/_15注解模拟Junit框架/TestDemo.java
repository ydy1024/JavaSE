package com.ydy._15注解模拟Junit框架;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
    目标：自定义注解模拟写一个Junit框架的基本使用。

    需求：定义若干个方法，只要加了MyTest注解
            就可以被自动触发执行。

    分析：
        （1）定义一个自定义注解TestMy.
            --只能注解方法。
            --存活范围一直都在。
        （2）定义若干个方法，只要有@TestMy注解的方法都能被触发执行！！
            没有这个注解的方法不能执行！！

    小结：
        注解和反射可以配合解决一些框架思想
        注解可以实现标记的成分做特殊处理！！
 */
public class TestDemo {
    @MyTest
    public void test01(){
        System.out.println("===test01===");
    }
    @MyTest
    public void test02(){
        System.out.println("===test02===");
    }
    @MyTest
    public void test03(){
        System.out.println("===test03===");
    }

    public void test04(){
        System.out.println("===test04===");
    }

    public static void main(String[] args) throws Exception{
        TestDemo demo = new TestDemo();
        //模拟测试类的启动按钮，有注解就触发执行
        Class<?> c=TestDemo.class;
        //2.get all methods in this class
        Method[] declaredMethods = c.getDeclaredMethods();
        //3.traverses all methods and which has annotation will be touched off executing
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(MyTest.class)){
                //This method is touched off executing
                declaredMethod.invoke(demo);
            }
        }
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTest{

}