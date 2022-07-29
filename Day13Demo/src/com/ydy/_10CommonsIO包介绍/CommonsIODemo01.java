package com.ydy._10CommonsIO包介绍;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
    目标：Commons-IO包的使用介绍。

    什么是Commons-IO包？
        common-io是apache开源基金组织提供的一组有关IO操作的类库。
        可以提高IO功能开发的效率。commons-io工具包提供了很多有关io操作的类。

    见下表：
          包                                    功能描述
          org.apache.commons.io                 有关Streams,Readers,Writers,Files的工具类
          org.apache.commons.io.input           输入流相关的实现类，包含Reader和InputStream
          org.apache.commons.io.output          输出流相关的实现类，包含Writer和OutputStream
          org.apache.commons.io.serialization   序列化相关的类

     步骤：
         1. 下载commons-io相关jar包；http://commons.apache.org/proper/commons-io/
         2. 把commons-io-2.6.jar包复制到指定的Module的lib目录中
         3. 将commons-io-2.6.jar加入到classpath中
     小结：
         IOUtils和FileUtils可以方便的复制文件和文件夹！！


 */
public class CommonsIODemo01 {
    public static void main(String[] args) throws Exception{
        //1.复制文件
        IOUtils.copy(new FileInputStream("Day13Demo/src/books.xml"),new FileOutputStream("Day13Demo/new.xml"));
        //2.复制文件复制到某个文件夹
        FileUtils.copyFileToDirectory(new File("Day13Demo/src/books.xml"),new File("C:\\Users\\ydy\\Desktop"));
        //3.复制文件夹复制到某个文件夹
        FileUtils.copyDirectoryToDirectory(new File("C:\\Users\\ydy\\Desktop\\tea"),new File("C:\\Users\\ydy\\Desktop\\test"));
        //4.jdk1.7以后提供了nio，也有一行代码完成代码复制的技术！
        Files.copy(Paths.get("Day13Demo/src/books.xml"),new FileOutputStream("Day13Demo/new1.txt"));
    }
}
