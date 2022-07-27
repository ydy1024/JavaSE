package com.ydy._06转换流;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
    目标：字符输出转换流的使用

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）
                                                           InputStreamReader           OutputStreamWriter

    字符输出转换流：OutputStreamWriter
        --作用：可以指定编码把字节输出流转换成字符输出流。
                可以指定写出去的字符的编码。
        --构造器：
            --public OutputStreamWriter(OutputStream out):用当前默认编码UTF-8把字节输出流转换成字符输出流。
            --public OutputStreamWriter(OutputStream out, String charsetName)：指定编码把字节输出流转换成字符输出流。

    小结：
        字符输出转换流可以指定编码把字节输出流按照指定编码转换成字符输出流
 */
public class OutputStreamWriterDemo02 {
    public static void main(String[] args) throws Exception{
        //1.写一个字节输出流通向文件
        OutputStream os = new FileOutputStream("Day10Demo/src/ydy7.txt");
        //2.把字节输出流转换成字符输出流
        Writer osw = new OutputStreamWriter(os,"GBK");
        osw.write("姚道炎");
        osw.close();
    }
}
