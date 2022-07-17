package com.ydy._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    目标：编译时异常的处理方式三。

    方式三：
        在出现异常的地方把异常一层一层的抛出给最外层调用者。
        最外层调用者集中捕获处理！！（规范做法）

    小结：
        编译时异常的处理方式三：底层出现的异常抛出给最外层调用者集中捕获处理。
        这种方法最外层调用者可以知道底层执行的情况，同时程序在出现异常后也不会立即死亡，这是理论上最好的方案。

        虽然异常有三种处理方式，但是开发中只要能够解决你的问题，每种方式都有可能用到！
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            parseDate("2022-07-16 10:10:10");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
    //JDK 1.7之后
    public static void parseDate(String s) throws Exception{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d=simpleDateFormat.parse(s);
            System.out.println(d);

            InputStream inputStream = new FileInputStream("D:/1.jpg");

    }
}
