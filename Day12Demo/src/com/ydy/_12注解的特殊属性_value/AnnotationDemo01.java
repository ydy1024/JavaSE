package com.ydy._12注解的特殊属性_value;

/**
    目标：注解的特殊属性名称：value
        value属性，如果只有一个value属性的情况下，
        使用value属性的时候可以省略value名称不写！！

        但是如果有多个属性，且多个属性没有默认值，那么value是不能省略的。
 */
//@Book(value = "/login")
@Book(value = "/login",age = 12)
public class AnnotationDemo01 {
}

@interface Book{
    String value();
    int age();
}
