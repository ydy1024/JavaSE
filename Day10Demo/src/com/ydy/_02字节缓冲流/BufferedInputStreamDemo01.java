package com.ydy._02字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
    目标：字节缓冲输入流的使用。

     IO流的体系：
                字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）

    a.字节缓冲输入流：BufferedInputStream
        --作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，
                从而提高字节输入流读数据的性能。
        --构造器：public BufferedInputStream(InputStream in)
        --原理：缓冲字节输入流管道包装了低级的字节输入流管道以后
                就自带一个缓冲池，缓冲池是内存的一块区域，一次可以直接提取8KB数据到内存
                以后程序直接在内存的缓冲池中读取数据，性能是很快的！
 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        //1.定义一个低级的字节输入流与源文件接通
        InputStream is = new FileInputStream("Day10Demo/src/ydy4.txt");
        //把低级字节流包装成一个高级的缓冲字节输入流
        BufferedInputStream bis = new BufferedInputStream(is);
        //定义一个字节数组循环读取。
        byte[] bytes = new byte[3];
        int len;
        while ((len=bis.read(bytes))!=-1){
            String rs = new String(bytes, 0, len);
            System.out.print(rs);
        }
    }
}
