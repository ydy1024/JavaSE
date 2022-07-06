package com.ydy._02Calendar日历类的详细使用;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
    目标：日历类Calendar的使用。

    Calendar代表了系统此刻日期对应的日历对象。
    Calendar是一个抽象类，不能直接创建对象。
    Calendar日历类创建日历对象的语法：
        Calendar rightNow=Calendar.getInstance();
    Calendar的方法：
        1.public static Calendar getInstance():返回一个日历类对象。
        2.public int get(int field):取日期中的某个字段信息。
        3.public void set(int field,int value):修改日历的某个字段信息。
        4.public void add(int field,int amount):为某个字段增加减少指定的值。
        5.public final Date getTime():拿到此刻日期对象。
        6.public long getTimeMillis():拿到此刻时间毫秒值。
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //1.通过调用日历类的静态方法getInstance得到一个当前此刻日期对象对应的日历对象。
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        //2.获取年
        System.out.println(instance.get(Calendar.YEAR));
        //3.一年中的第几天：
        int days =instance.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        //4.修改日历日期
        instance.set(Calendar.YEAR,2099);
        System.out.println(instance.get(Calendar.YEAR));
        //5.拿到此刻时间
        Date d=instance.getTime();
        System.out.println(d);
        //6.此刻时间毫秒值
        long time=instance.getTimeInMillis();
        System.out.println(time);

        //7.请问701天后是哪个日期
        instance.add(Calendar.DAY_OF_YEAR,701);
        long times=instance.getTimeInMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(times));
    }
}
