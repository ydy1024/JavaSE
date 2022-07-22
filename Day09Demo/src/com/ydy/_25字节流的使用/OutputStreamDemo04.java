package com.ydy._25字节流的使用;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
    目标：字节输出流的使用！

    IO流的体系：
                    字节流                                              字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）

    a.FileOutputStream文件字节输出流
        --作用：以内存为基准，把内存中的数据按照字节的形式写出到磁盘中去。
                简单来说，把内存数据按照字节写出到磁盘文件中去。
        --构造器：
                --public FileOutputStream(File file):创建一个字节输出流管道通向目标文件对象。
                --public FileOutputStream(String name):创建一个字节输出流管道通向目标文件路径。
                --public FileOutputStream(File file, boolean append)：创建一个追加数据的字节流输出流
                --public FileOutputStream(String name, boolean append)：创建一个追加数据的字节流
        --方法：
            public void write(int a):写一个字节出去。
            public void write(byte[] buffer):写一个字节数组出去。
            public void write(byte[] buffer,int pos,int len):写一个字节数组的一部分出去
    小结：
        字节输出流可以写字节数据到文件中去。
        写一个字节，写一个字节数组，写一个字节数组的一部分出去。
        管道用完需要关闭，数组要生效需要刷新，关闭包含刷新，刷新后流可以继续使用，关闭后不能使用。
        字节输出流管道默认是覆盖数据管道，启动管道写数据前会清除数据。
            --OutputStream os = new FileOutputStream("Day09Demo/src/ydy4.txt");
        追加数据管道，第二个参数为true
            --OutputStream os = new FileOutputStream("Day09Demo/src/ydy4.txt",true);
 */
public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception{
//        //1.创建一个文件对象定位目标文件,写文件自动创建
//        File file = new File("Day09Demo/src/ydy4.txt");
//        //2.创建一个字节输出流管道与目标文件对象接通
//        OutputStream os = new FileOutputStream(file);
        //3.简化写法,默认覆盖数据
//        OutputStream os = new FileOutputStream("Day09Demo/src/ydy4.txt");
        //追加数据管道，第二个参数为true
        OutputStream os = new FileOutputStream("Day09Demo/src/ydy4.txt",true);
        //4.写数据出去
        //a.写一个字节出去（写一滴水出去）
        os.write(97);//字节a
        os.write('b');//字节b
//        os.write('姚');//只会写出中文第一个字节
        //b.写一个字节数组进去
        os.write("\r\n".getBytes());
        byte[] bytes = {98,99,100,101};
        os.write(bytes);
        os.write("\r\n".getBytes());
        byte[] bytes1 = "ydy姚道炎".getBytes();//默认以当前代码编码提取字节
        os.write(bytes1);

        os.write("\r\n".getBytes());
        //c.写一个数组的一部分进去
        byte[] bytes2 = "ydy姚道炎".getBytes();
        os.write(bytes2,0,3);
//        os.flush();//立即刷新数据到文件中去，刷新后管道可以继续使用。
        os.close();//关闭不能使用
    }
}
