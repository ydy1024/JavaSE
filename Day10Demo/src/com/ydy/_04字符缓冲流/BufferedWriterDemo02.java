package com.ydy._04字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
    目标：字符缓冲输出流的使用。

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）

    字符缓冲输出流：BufferedWriter
        --作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
        --构造器：public BufferedWriter(Writer writer):
        --原理：高级的缓冲字符输出流默认会有一个8K的字符缓冲池，可以提高写字符的性能。
        --缓冲字符输出流除了提高了字符输出流的写数据的性能，还多了一个换行的特有功能：（重点）
            public void newLine():新建一行。

    小结：
        缓冲字符输出流可以把低级的字符输出流进行包装。提高了性能。
        多了一个换行的功能：public void newLine():新建一行。
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws Exception{
        //定义一个低级的输出流
        Writer fw = new FileWriter("Day10Demo/src/ydy7.txt",true);
        //把低级的字符输出流包装成高级的缓冲输出流。
        BufferedWriter bw = new BufferedWriter(fw);

        //写入数据
        bw.newLine();
        bw.write("有多远有多远");
        bw.newLine();
        bw.write("阿萨大大大苏打");


        bw.close();
    }
}
