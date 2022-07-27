package com.ydy._08打印流;

import java.io.PrintStream;

/**
    目标：打印流改变输出的流向。重定向。

    System:
        --public static void setOut(PrintStream out):让系统的输出流向打印流
 */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream("Day10Demo/src/ydy8.txt");
        System.setOut(ps);
        System.out.println("姚道炎");
    }
}
