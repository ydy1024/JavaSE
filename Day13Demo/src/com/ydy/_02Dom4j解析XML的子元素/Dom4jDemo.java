package com.ydy._02Dom4j解析XML的子元素;

import com.ydy._01Dom4j解析XML文档根元素.Dom4jDemo01;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
    目标：Dom4j解析XML的子元素

    Element元素的API：
        String getName():取元素的名称。
        List<Element> elements():获取当前元素下的全部子元素(一级)
        List<Element> elements(String name):获取当前元素下的指定名称的全部子元素(一级)
        Element element(String name):获取当前元素下的指定元素的某个子元素，默认取第一个(一级)
 */
public class Dom4jDemo {
    public static void main(String[] args) throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();

        //3.第二种方式先把xml文件读成一个字节流
        InputStream is= Dom4jDemo01.class.getResourceAsStream("/books.xml");
        Document document=saxReader.read(is);
        System.out.println(document);
        //4.从dom树中提取根元素
        Element root=document.getRootElement();
        System.out.println(root.getName());
        //获得根元素下全部子元素
        List<Element> suns=root.elements();
        for (Element sun : suns) {
            System.out.println(sun.getName());
        }
        System.out.println("--------------");
        //根元素下的全部book子元素
        List<Element> sonElements=root.elements("book");
        for (Element sonElement : sonElements) {
            System.out.println(sonElement.getName());
        }
        System.out.println("--------------");
        //根元素下指定的子元素
        Element son=root.element("user");
        System.out.println(son.getName());
    }
}
