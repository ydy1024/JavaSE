package com.ydy._00字符流的使用;

import java.io.FileReader;
import java.io.Reader;

/**
    目标：字符输入流的使用-按照字符数组读取。

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）

     c.FileReader:文件字符输入流。
         --作用：以内存为基准，把磁盘文件中的数据以字符的形式读入到内存。
                简单来说，读取文本文件内容到内存中去。
         --构造器：
             --public FileReader(File file):创建一个字符流入流与源文件对象接通。
             --public FileReader(String fileName):创建一个字符输入流与源文件路径接通。
         --方法：
             --public int read():读取一个字符的编号返回！读取完毕返回-1
             --public int read(char[] buffer):读取一个字符数组，读取多少个字符就返回多少个数量，读取完毕返回-

    小结：
        字符流按照字符数组循环读取数据，可以解决中文读取输出乱码的问题，性能也较好！
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception{
        //1.
        Reader fr = new FileReader("Day10Demo/src/ydy2.txt");
        //2.按照字符读取数组
//        char[] chars = new char[3];

//        int len=fr.read(chars);
//        System.out.println("字符数："+len);
//        String rs = new String(chars);
//        System.out.println(rs);
//
//        int len2=fr.read(chars);
//        System.out.println("字符数："+len2);
//        String rs2 = new String(chars);
//        System.out.println(rs2);
//
//        int len3=fr.read(chars);
//        System.out.println("字符数："+len3);
//        String rs3 = new String(chars);
//        System.out.println(rs3);
        //循环读取
        char[] chars = new char[1024];
        int len;
        while ((len= fr.read(chars))!=-1){
            //读多少到多少。
            System.out.print(new String(chars,0,len));
        }
    }
}
