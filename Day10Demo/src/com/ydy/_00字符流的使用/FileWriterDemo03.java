package com.ydy._00字符流的使用;

import java.io.FileWriter;
import java.io.Writer;

/**
    目标：字符输出流的使用

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）

    d.FileWriter文件字符输出流的使用。
        --作用：以内存为基准，把内存中的数据按照字符的形式写出到磁盘文件中去。
            简单来说，就是把内存的数据以字符写出到文件中去。
        --构造器：
            --public FileWriter(String fileName):创建一个字符输出流管道通向目标文件路径。
            --public FileWriter(File file)：创建一个字符输出流管道通向目标文件对象。
            --public FileWriter(String fileName, boolean append)：创建一个追加数据的字符输出流管道通向目标文件路径。
            --public FileWriter(File file, boolean append)：创建一个追加数据的字符输出流管道通向目标文件对象。
        --方法：
            a.public void write(int c)：写一个字符出去。
            b.public void write(String c):写一个字符串出去。
            c.public void write(char[] buffer):写一个字符数组出去。
            d.public void write(String c,int pos,int len):写字符串的一部分出去。

    小结：
        字符输出流可以写字符数据出去，总共有5个方法
        换行：fw.write("\r\n");
    读写字符建议使用字符输出流
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception{
//        Writer fw = new FileWriter("Day10Demo/src/ydy3.txt");//覆盖数据管道
        Writer fw = new FileWriter("Day10Demo/src/ydy3.txt",true);//追加数据管道


        //写一个字符出去
        fw.write(97);
        fw.write('b');
        fw.write('姚');
        fw.write("\r\n");
        //写一个字符串出去
        fw.write("ydy姚道炎");
        fw.write("\r\n");
        //写一个字符数组
        fw.write("一定要".toCharArray());
        fw.write("\r\n");
        //写字符串一部分出去
        fw.write("广州大学华软软件学院",0,4);
        //写字符数组的一部分
        fw.write("\r\n");
        fw.write("广州大学华软软件学院".toCharArray(),0,4);
        fw.close();
    }
}
