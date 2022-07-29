package com.ydy._04反射_获取Constructor构造器;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
    目标：反射-获取Constructor构造器然后通过这个构造器初始化对象。

    反射获取Class中的构造器对象Constructor作用：
        也是初始化并得到类的一个对象返回。

    Constructor的API：
        1.T newInstance(Object.. initargs)
            创建对象，注入构造器需要的数据。
        2.void setAccessible(true)
            修改访问权限，true代表暴力攻破权限，false表示保留不可访问权限（暴力反射）

    小结：
        可以通过定位类的构造器对象。
        如果构造器对象没有访问权限可以通过：void setAccessible(true)打开权限
        构造器可以通过T newInstance(Object... initargs)调用自己，传入参数！
 */
public class TestStudentDemo02 {
    Class<?> c;
    @Before
    public void before(){
        //a.反射的第一步是先得到Class类对象
        c=Student.class;
    }
    //1.调用无参数构造器得到一个类的对象调用。
    @Test
    public void ctreateObj01() throws Exception{
        //b.定位无参数构造器对象
        Constructor<?> constructor = c.getDeclaredConstructor();
        //c.暴力打开私有构造器的访问权限
        constructor.setAccessible(true);
        //d.通过无参构造器初始化对象返回
        Student student = (Student) constructor.newInstance();
        System.out.println(student);
    }

    //2.调用有参数构造器得到一个类的对象返回。
    @Test
    public void createObj02() throws Exception{
        //b.定位有参数构造器对象
        Constructor<?> constructor = c.getDeclaredConstructor(String.class,int.class);
        //d.通过有参构造器初始化对象返回
        Student student = (Student) constructor.newInstance("姚道炎",20);
        System.out.println(student);
    }
}
