package com.ydy._06转换流;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
    目标：
        字符输入转换流InputStreamReader的使用。

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）
                                                           InputStreamReader           OutputStreamWriter

    字符输入转换流InputStreamReader：
        --作用：可以解决字符流乱码的问题。
                可以把原始的字节流按照当前默认的代码编码转换成字符输入流。
                也可以把原始的字节流按照指定编码转换成字符输入流。
        --构造器：
            --public InputStreamReader(InputStream in)：可以使用当前默认编码转换成字符流。
            --public InputStreamReader(InputStream in, String charsetName)：可以指定编码把字节流转换成字符流。

    小结：
        字符输入转换流可以把字节流按照默认编码转换成字符流，
        字符输入转换流也可以把字节流转换成字符流，并且可以指定编码转换，
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception{
        //代码：UTF-8 文件GBK（ab我爱你：o o [oo] [oo] [oo]）
        //1.提取GBK原始字节流
        InputStream is = new FileInputStream("Day10Demo/src/test.txt");
        //2.把原始字节输入流通过转换流，转换成 字符输入转换流InputStreamReader
        Reader isr = new InputStreamReader(is, "GBK");
        //3.包装成缓冲流
        BufferedReader br = new BufferedReader(isr);
        //3.包装成缓冲流
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
    }
}
