package com.ydy._03Dom4j解析XML的属性;

import com.ydy._01Dom4j解析XML文档根元素.Dom4jDemo01;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
    目标：Dom4j解析XML的属性；

    Element元素的API：
        List<Attribute> attributes():获取元素的全部属性对象。
        Attribute attribute(String name)：根据名称获取某个元素的属性对象。
        String attributeValue(String var1):直接获取某个元素的某个属性名称的值。

    Attribute对象的API：
        String getName():获取属性名称。
        String getValue():获取属性值。
 */
public class Dom4jDemo {
    public static void main(String[] args) throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();

        //3.第二种方式先把xml文件读成一个字节流
        InputStream is= Dom4jDemo01.class.getResourceAsStream("/books.xml");
        Document document=saxReader.read(is);
        System.out.println(document);
        //4.获取根元素对象
        Element root=document.getRootElement();

        //5.获取book子元素
        Element book = root.element("book");

        //6.获取book元素的全部属性对象
        List<Attribute> attributes=book.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+"=>"+attribute.getValue());
        }

        //获取book的某个属性对象
        Attribute attribute=book.attribute("desc");
        System.out.println(attribute.getName()+"=>"+attribute.getValue());

        System.out.println(book.attributeValue("id"));
    }
}
