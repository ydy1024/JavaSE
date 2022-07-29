package com.ydy._05反射_获取Field成员变量;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
    目标：反射-获取Field成员变量对象。

    反射的第一步是先得到Class类对象。

    1.public Field getField(String name):
        根据成员变量名获得对应Field对象，只能获得public修饰
    2.public Field getDeclaredField(String name)：
        根据成员变量名获得对应Field对象，只要声明了就可以得到
    3.public Field[] getFields()：
        获得所有的成员变量对应的Field对象，只能获得public的
    4.public Field[] getDeclaredFields():
        获得所有的成员变量对应的Field对象，只要声明了就可以得到

    小结：
        获取全部成员变量：getDeclaredFields
        获取某个成员变量：getDeclaredField
 */
public class FieldDemo {
    Class<?> c;
    @Before
    public void before(){
        c=Dog.class;
    }
    /**
     * 1.获取全部成员变量
     */
    @Test
    public void getDeclaredFields(){
        //c.获取全部声明的成员变量对象
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getType()+"=>"+declaredField.getName());
        }
    }

    /**
     * 2.获取某个成员变量对象
     */
    @Test
    public void getDeclaredField() throws Exception{
        //c.获取全部声明的成员变量对象
        Field declaredField = c.getDeclaredField("age");
        System.out.println(declaredField.getType()+"=>"+declaredField.getName());
    }
}
