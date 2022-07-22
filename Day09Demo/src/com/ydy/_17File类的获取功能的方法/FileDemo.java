package com.ydy._17File类的获取功能的方法;

import java.io.File;

/**
    目标：File类的获取功能的API
        --public String getAbsolutePath():返回此File的绝对路径名字符串。
        --public String getPath():获取创建文件对象的时候用的路径。
        --public String getName():返回由此File表示的文件或目录的名称。
        --public long length():返回由此File表示的文件的长度。
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ydy\\Desktop\\1.jpg");
        File file1 = new File("Day09Demo/src/ydy.txt");
        //a.获取它的绝对路径。
        System.out.println(file1.getAbsolutePath());
        //b.获取文件定义的时候使用的路径
        System.out.println(file1.getPath());
        //c.获取文件的名称：带后缀
        System.out.println(file1.getName());
        //d.获取文件的大小：字节个数
        System.out.println(file1.length());
    }
}
