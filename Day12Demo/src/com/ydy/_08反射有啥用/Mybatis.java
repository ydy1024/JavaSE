package com.ydy._08反射有啥用;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class Mybatis {
    //提供一个方法：可以保存一切对象数据的字段和具体值
    public static void save(Object obj){
        try(
                PrintStream ps = new PrintStream(new FileOutputStream("Day12Demo/src/data.txt",true));
        ) {
            //解析对象的字段和每个字段的值存储起来！
            //Obj=Student/Pig
            //1.先得到对象的Class文件对象
            Class<?> c = obj.getClass();
            ps.println("================="+c.getSimpleName()+"===================");
            //2.定位他的全部成员变量
            Field[] declaredFields = c.getDeclaredFields();
            //3.遍历取值
            for (Field declaredField : declaredFields) {
                //字段名称
                String name = declaredField.getName();
                //字段的值
                declaredField.setAccessible(true);
                String value=declaredField.get(obj)+"";
                ps.println(name+"="+value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
