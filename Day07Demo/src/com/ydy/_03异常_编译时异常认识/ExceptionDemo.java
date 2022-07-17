package com.ydy._03异常_编译时异常认识;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    目标：常见的编译时异常认识。

    编译时异常：继承自Exception的异常或者其子类，没有继承RuntimeException。
              “编译时异常是编译阶段就会报错”，
               必须程序员编译阶段就处理的。否则代码编译就报错！！

    编译时异常的作用是什么：
        是担心程序员的技术不行，在编译阶段就爆出一个错误，目的在于提醒！
        提醒程序猿这里很有可能出错，请检查并注意不要出Bug。

        编译时异常是可遇不可求。遇到了就遇到了

    小结：
        编译时异常是编译阶段就会报错，继承了Exception，编译时异常是可遇不可求。
            必须程序员编译阶段就处理的。否则代码编译就报错！！
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date="2022-07-16 10:23:21";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=format.parse(date);
        System.out.println(d);

    }
}
