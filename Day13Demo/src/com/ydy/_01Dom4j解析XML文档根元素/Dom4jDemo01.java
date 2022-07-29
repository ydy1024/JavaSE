package com.ydy._01Dom4j解析XML文档根元素;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;

/**
    目标：dom4j：获取Document对象和根元素

    dom4j安装步骤：
        a.去dom4j官网下载dom4j的框架：都是一些jar包。
        b.把dom4j的核心jar包导入到当前项目中去。
        c.在项目中新建一个文件夹：lib。
        d.讲dom4j-2.1.1.jar文件复制到lib文件夹。
        e.在jar文件上点右键，选择ADD as Library ->点击OK
        f.在类中导包使用。

    Java提供了Class下的一个方法：
        public InputStream getResourceAsStream(String path)
            --用于加载文件成为一个字节输入流返回！！

    Document文档：
        Element getRootElement():获取根元素。
 */
public class Dom4jDemo01 {
    public static void main(String[] args) throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();
        //2.通过解析器对象去加载xml文件数据，成为一个Document文档书对象。
//        Document document=saxReader.read(new File("Day13Demo/src/books.xml"));
        //3.第二种方式先把xml文件读成一个字节流
        InputStream is=Dom4jDemo01.class.getResourceAsStream("/books.xml");
        Document document=saxReader.read(is);
        System.out.println(document);
        //4.从dom树中提取根元素
        Element root=document.getRootElement();
        System.out.println(root.getName());
    }
}
