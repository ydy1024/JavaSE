package com.ydy._01DateFormat时间格式化类;

import java.text.SimpleDateFormat;

/**
    目标：DateFormat简单日期格式化类的使用

    引入：
        我们之前得到的Date日期对象或者时间毫秒值的时间形式
        开发中并不喜欢，不符合有些时间格式的需求。
    DateFormat作用：
        1.可以把日期对象或者时间毫秒值格式化成我们喜欢的时间形式。
        2.可以把字符串的时间形式解析成日期对象。

    DateFormat是一个抽象类，不能直接使用，要找它的子类：SimpleDateFormat
    我们需要用的是简单日期格式化类：SimpleDateFormat

    SimpleDateFormat简单日期格式化类：
        包：java.text.SimpleDateFormat
        构造器：public SimpleDateFormat(String pattern):指定时间的格式创建简单日期格式化对象。
        方法：
            --public String format(Date date)：可以把日期对象格式化成为我们喜欢的形式，返回的是字符串！
            --public String format(Object time):可以把时间毫秒值格式化成我们喜欢的时间形式，返回的是字符串！
            --public

 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        SimpleDateFormat
    }
}
