package com.ydy._05Dom4j解析案例;

import com.ydy._01Dom4j解析XML文档根元素.Dom4jDemo01;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
    目标：Dom4j解析XML文件：Contact.xml.xml成为一个Java的对象（集合对象）

    Contacts.xml 解析成===>List<Contact.xml>

    分析：
        1.定义一个联系人类封装联系人数据。
        2.解析成List集合。
 */
public class Dom4jDemo {
    public static void main(String[] args) throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();

        //2.第二种方式先把xml文件读成一个字节流
        InputStream is= Dom4jDemo01.class.getResourceAsStream("/Contacts.xml");
        Document document=saxReader.read(is);
        System.out.println(document);
        //3.获取根元素对象
        Element root=document.getRootElement();

        //4.获取根元素下的全部子元素。
        List<Element> sonElements=root.elements();

        //遍历封装成List对象
        List<Contact> contactList=new ArrayList<>();
        if(sonElements!=null&&sonElements.size()>0){
            for (Element sonElement : sonElements) {
                Contact contact = new Contact();
                contact.setId(Integer.parseInt(sonElement.attributeValue("id")));
                contact.setVip(Boolean.parseBoolean(sonElement.attributeValue("vip")));
                contact.setName(sonElement.elementText("name"));
                contact.setSex(sonElement.elementText("sex").charAt(0));
                contact.setEmail(sonElement.elementText("email"));
                contactList.add(contact);
            }
        }
        System.out.println(contactList);
    }
}
