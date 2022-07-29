package com.ydy._06XPath检索XML中的信息;

import com.ydy._01Dom4j解析XML文档根元素.Dom4jDemo01;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
     目标：XPath检索XML中的信息。

     引入：
         Dom4J可以用于解析整个XML的数据。
         但是如果要检索XML中的某些信息，建议使用XPath.
     XPath使用步骤：
         1.导入dom4j框架。（XPath依赖于Dom4j技术,必须先倒入dom4j框架！）
         2.导入XPath独有的框架包。jaxen-1.1.2.jar
     XPath常用API:
         List<Node> selectNodes(String var1):检索出一批节点集合。
         Node selectSingleNode(String var1)：检索出一个节点返回。
     XPath提供的四种检索数据的写法：
         1.绝对路径。
         2.相对路径。
         3.全文搜索。
         4.属性查找。

     小结：
         1.绝对路径： /根元素/子元素/子元素。
         2.相对路径： ./子元素/子元素。 (.代表了当前元素)
         3.全文搜索：
             //元素  在全文找这个元素
             //元素1/元素2  在全文找元素1下面的一级元素2
             //元素1//元素2  在全文找元素1下面的全部元素2
         4.属性查找。
             //@属性名称  在全文检索属性对象。
             //元素[@属性名称]  在全文检索包含该属性的元素对象。
             //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
 */
public class XPathDemo {
    //1.绝对路径： /根元素/子元素/子元素。
    @Test
    public void parse01() throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();

        //2.第二种方式先把xml文件读成一个字节流
        InputStream is= Dom4jDemo01.class.getResourceAsStream("/Contact.xml");
        Document document=saxReader.read(is);
        System.out.println(document);

        //3.绝对路径
        List<Node> nameNodes = document.selectNodes("/contactList/contact/name");
        for (Node nameNode : nameNodes) {
            System.out.println(nameNode.getText());
        }
    }

    @Test
    public void parse02() throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader=new SAXReader();

        //2.第二种方式先把xml文件读成一个字节流
        InputStream is= Dom4jDemo01.class.getResourceAsStream("/Contact.xml");
        Document document=saxReader.read(is);
        System.out.println(document);

        //3.得到根元素对象
        Element root = document.getRootElement();

        //4.从根元素开始检索
        List<Node> nodes = root.selectNodes("./contact/name");
        for (Node node : nodes) {
            System.out.println(node.getText());
        }
    }
    //3.全文检索
    @Test
    public void parse03() throws Exception {
        //1.创建dom4j解析器
        SAXReader saxReader = new SAXReader();

        //2.第二种方式先把xml文件读成一个字节流
        InputStream is = Dom4jDemo01.class.getResourceAsStream("/Contact.xml");
        Document document = saxReader.read(is);
        System.out.println(document);
        //3.//name是指在整个xml文件中检索name节点
        List<Node> nameNodes = document.selectNodes("//name");
        for (Node nameNode : nameNodes) {
            System.out.println(nameNode.getText());
        }
        System.out.println("-------------------------------------------------------------");
        List<Node> nameNodes1 = document.selectNodes("//contact/name");
        for (Node nameNode : nameNodes1) {
            System.out.println(nameNode.getText());
        }
    }
    //属性查找。
    @Test
    public void path04() throws Exception{
        //1.创建dom4j解析器
        SAXReader saxReader = new SAXReader();

        //2.第二种方式先把xml文件读成一个字节流
        InputStream is = Dom4jDemo01.class.getResourceAsStream("/Contact.xml");
        Document document = saxReader.read(is);
        List<Node> nodes = document.selectNodes("//@id");
        for (Node node : nodes) {
            Attribute attribute= (Attribute) node;
            System.out.println(attribute.getName()+"=>"+attribute.getStringValue());
        }
    }
}
