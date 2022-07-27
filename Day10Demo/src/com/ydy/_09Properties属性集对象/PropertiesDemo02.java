package com.ydy._09Properties属性集对象;

import java.io.FileInputStream;
import java.util.Properties;

/**
    目标：Properties读取属性文件中的键值对信息。（读取）

    Properties的方法：
         -- public synchronized Object setProperty(String key, String value):保存一对属性。
         --public String getProperty(String key)：使用此属性列表中指定的键搜索属性值。
         --public Set<String> stringPropertyNames():所有键的名称的集合
         --public void store(Writer writer, String comments)：保存数据到属性文件中去
         --public void store(OutputStream out, String comments)：保存数据到属性文件中去.
 */
public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception{
        //1.创建一个属性集对象
        Properties properties = new Properties();

        //2.字节输入流加载属性文件的数据
        properties.load(new FileInputStream("Day10Demo/src/test.properties"));

        System.out.println(properties.getProperty("admin"));
        System.out.println(properties.getProperty("password"));
    }
}
