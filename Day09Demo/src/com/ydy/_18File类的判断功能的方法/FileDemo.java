package com.ydy._18File类的判断功能的方法;

import java.io.File;

/**
    目标：File类的判断功能的方法
        --public boolean exists():此File表示的文件或者目录是否实际存在
        --public boolean isDirectory():此File表示的是否为目录。
        --public boolean isFile():此File表示的是否为文件。
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ydy\\Desktop\\1.jpg");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        File file2 = new File("C:\\Users\\ydy\\Desktop\\tea");
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
    }
}
