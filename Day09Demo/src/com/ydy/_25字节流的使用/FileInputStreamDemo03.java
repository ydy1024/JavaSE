package com.ydy._25字节流的使用;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
    扩展：解决字节输入流读取中文内容输出乱码的问题。

    引入：一个一个字节读取中文输出
         一个一个字节数组读取中文输出均无法避免乱码。
    如何实现读取可以避免乱码呢？
        1.定义一个字节数组与文件的大小刚刚一样大，然后一桶水读取全部字节数据再输出！

    小结：
        定义一个字节数组与文件的大小刚刚一样大，然后一桶水读取全部字节数据再输出！
        可以避免中文乱码，但是如果文件过大，会出现内存溢出！

    建议使用字符流！
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception{
        File file = new File("Day09Demo/src/ydy3.txt");
        InputStream is = new FileInputStream(file);
        //2.定义一个字节数组与文件大小一样大
//        System.out.println("文件大小："+file.length());
//        byte[] bytes = new byte[(int) file.length()];
//        int len = is.read(bytes);
//        System.out.println("读取了："+len);
//        String rs = new String(bytes);
//        System.out.println(rs);
        byte[] bytes = is.readAllBytes();
        String rs = new String(bytes);
        System.out.println(rs);
    }
}
