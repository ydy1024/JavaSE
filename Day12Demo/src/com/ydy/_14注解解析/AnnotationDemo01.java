package com.ydy._14注解解析;

import org.junit.Test;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
    目标：注解的解析

    我们会使用注解注释一个类的成分，那么就设计到要解析出这些注解的的数据
    开发中经常要知道一个类的成分上面到底有哪些注解，注解有哪些属性数据，这都需要进行注解的解析。

    与注解解析相关的接口
        1.Annotation：注解类型，该类是所有注解的父类。注解都是一个Annotation的对象。
        2.AnnotatedElement:该接口定义了与注解解析相关的方法
            所有的类成分Class，Method，Field，Constructor：都实现了AnnotatedElement按
            他们都拥有解析注解的能力：
             a.Annotation[] getDeclaredAnnotation()
                获得当前对象上使用的所有注解，返回注解数组。
             b.T getDeclaredAnnotation(Class<T> annotationClass)
                根据注解类型获得对应注解对象。
             c.boolean isAnnotationPresent(Class<Annotation> annotationClass)
                判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false

    解析注解数据的原理
        -注解在哪个成分上，我们就先拿哪个成分对象。
        -比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
        -比如注解作用在类上，则要该类的Class对象，再来拿上面的注解。
        -比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解


    需求：（了解即可）
        1.定义注解Book，要求如下：
            -包含属性：String value() 书名
            -包含属性：double price() 价格，默认值为100
            -包含属性：String[] authors() 多位作者
            -限制注解使用的位置：类和成员方法上
            -指定注解的有效范围：RUNTIME
        2.定义BookStore类，在类和成员方法上使用Book注解
        3.定义AnnotationDemo01测试类获取注解上的数据。
 */
public class AnnotationDemo01 {
    @Test
    public void parseClass(){
        Class<?> c=BookStore.class;
        //2.判断类上是否使用注解
        if (c.isAnnotationPresent(Book.class)){
            //3.获取这个注解对象
            Book book = c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
    @Test
    public void parseMethod() throws Exception{
        Class<?> c=BookStore.class;
        //定位方法对象
        Method run = c.getDeclaredMethod("run");
        if (run.isAnnotationPresent(Book.class)){
            //3.获取这个注解对象
            Book book = run.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}
@Book(value = "Java",price = 99.5,authors = {"姚道炎","刘力皓"})
class BookStore{
    @Book(value = "Mybatis",price = 199.5,authors = {"ydy","llh"})
    public void run(){

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Book{
    String value();
    double price() default 100;
    String[] authors();
}