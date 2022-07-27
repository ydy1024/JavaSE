package com.ydy._08打印流;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
    目标：打印流PrintStream/PrintWriter


    打印流的作用：
        1.可以方便，快速的写数据出去。
        2.可以实现打印啥出去，就是啥出去。
    打印流的构造器：
        --public PrintStream(OutputStream out):
        --public PrintStream(String fileName):

    小结：
        打印流可以方便且高效的打印各种数据。
        PrintStream不光可以打印数据，还可以写字节数据出去。
         PrintStream不光可以打印数据，还可以写字符数据出去。
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception{
        //1.打印流PrintStream
//        OutputStream os = new FileOutputStream("Day10Demo/src/ydy8.txt");
        PrintStream ps = new PrintStream("Day10Demo/src/ydy8.txt");

        ps.println("姚道炎");
        ps.println("姚道炎".getBytes());
        ps.close();
    }
}
