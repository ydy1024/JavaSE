package com.ydy._05字符流不同编码读取乱码的问题;

import java.io.*;

/**
    目标：字符流不同编码读取乱码的问题。

    引入：
        我们之前用的代码编码和文件编码都是UTF-8编码，字符流读取没有出现乱码！
        字符流读取：
            代码编码      文件编码      中文情况
            UTF-8        UTF-8        不乱码
            GBK          GBK          不乱码
            UTF-8        GBK          乱码

    小结：
        如果代码编码和读取的文件一致。字符流读取的时候不会乱码。
        如果代码编码和读取的文件不一致。字符流读取的时候会乱码
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception{
        Reader fr = new FileReader("Day10Demo/src/test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
    }
}
