package com.ydy._04反射_获取Constructor构造器;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
    目标：反射——获取Constructor构造器对象。

    反射的第一步是先得到Class类对象。（Class文件）

    反射中Class类型获取构造器提供了很多API：
        1.public Constructor<T> getConstructor(Class<?>... parameterTypes):
            根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
        2.public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：
            根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用。
        3.public Constructor<?>[] getConstructors():
            获取所有的构造器，只能拿public修饰的构造器。几乎不用，太弱
        4.public Constructor<?>[] getDeclaredConstructors()：
            获取所有声明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！

    小结：
        获取类的全部构造器对象：Constructor[] getDeclaredConstructors()
            -获取所有声明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
        获取类的某个构造器对象：Constructor getDeclaredConstructor(Class<?>... parameterTypes)
            -根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用。
 */
public class TestStudent {
    Class<?> c;
    @Before
    public void before(){
        c=Student.class;
    }
    //1.getConstructors()
    // 获取所有的构造器，只能拿public修饰的构造器
    @Test
    public void getConstructors(){
        //b.定位全部构造器，只能拿public修饰的。
        Constructor<?>[] cons = c.getConstructors();
        //c.遍历这些构造器
        for (Constructor<?> con : cons) {
            System.out.println(con.getName()+"==>"+con.getParameterCount());
        }
    }
    //2.getDeclaredConstructors()
    //获取所有声明的构造器，只要你写我就能拿到，无所谓权限
    @Test
    public void getDeclaredConstructors(){
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName()+"==>"+declaredConstructor.getParameterCount());
        }
    }
    //3.getConstructor(Class<?>... parameterTypes)
    //根据参数匹配获取某个构造器，只能拿public修饰的构造器
    @Test
    public void getConstructor() throws Exception{
        Constructor<?> constructor = c.getConstructor(String.class,int.class);
        System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());

    }

    //4.getDeclaredConstructor(Class<?>... parameterTypes)
    //根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用。
    @Test
    public void getDeclaredConstructor() throws Exception{
        Constructor<?> declaredConstructor = c.getDeclaredConstructor();
        System.out.println(declaredConstructor.getName()+"==>"+declaredConstructor.getParameterCount());
    }
}
