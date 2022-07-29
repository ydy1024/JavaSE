package com.ydy._04Dom4j解析XML的文本;

import com.ydy._01Dom4j解析XML文档根元素.Dom4jDemo01;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
    目标：Dom4j解析XML的文本；

    Element:
        String elementText(String name):可以直接获取当前元素的子元素的文本内容
        String elementTextTrim(String name)：去前后空格，直接获取当前元素的子元素的文本内容
        String getText():直接获取当前元素的文本内容。
        String getTextTrim():去前后空格，直接获取当前元素的文本内容。
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
        //第一个子元素book
        Element book = root.element("book");
        //直接拿到当前book元素下的子元素文本值
        System.out.println(book.elementText("name"));
        System.out.println(book.elementTextTrim("name"));
        System.out.println(book.elementText("author"));
        System.out.println(book.elementTextTrim("author"));
        System.out.println(book.elementText("sale"));

        //先获取到子元素对象，再获取该文本值
        Element bookName = book.element("name");
        System.out.println(bookName.getText());
    }
}
