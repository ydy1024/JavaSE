package com.ydy._11注解的属性;

/**
    目标：注解的属性：

    属性的格式：
        -格式1：数据类型 属性名();
        -格式2：数据类型 属性名() default 默认值;

    属性适用的数据类型：
        八种数据数据类型(int,short,long,double,byte,char,boolean,float)
        String，Class
        以上类型的数组形式都支持

    小结：
        注解可以有属性，属性名必须带()
        在用注解的时候，属性必须赋值，除非这个属性有默认值！！
 */
@MyBook(name = "Java",authors = {"刘力皓","姚道炎"},price = 99.9)
public class AnnotationDemo01 {
    public static void main(String[] args) {

    }
}
@interface MyBook{
    String name();
    String[] authors();
    double price();
    String address() default "广州";
}