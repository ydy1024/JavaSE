package com.ydy._05反射_获取Field成员变量;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
    目标：反射获取成员变量：取值和赋值。

    Field的方法：给成员变量赋值和取值
        -public void set(Object obj, Object value):给对象注入某个成员变量数据
        -public Object get(Object obj):获取对象的成员变量的值
        -public void setAccessible(boolean flag)：暴力反射，设置为可以直接访问私有类型的属性。
        -public Class<?> getType():获取属性的类型，返回Class对象。
        -public String getName():获取属性的名称。
 */
public class FieldDemo02 {
    Class<?> c;
    @Before
    public void before(){
        c=Dog.class;
    }
    @Test
    public void setField() throws Exception{
        Field nameF = c.getDeclaredField("name");
        nameF.setAccessible(true);
        //c.为这个成员变量赋值!
        Dog dog = new Dog();
        /**
         * 参数一：被赋值的对象
         * 参数二：该成员变量的值。
         */
        nameF.set(dog,"大黄");
        System.out.println(dog);

        //获取成员变量的值
        String value=nameF.get(dog)+"";
        System.out.println(value);
    }

}
