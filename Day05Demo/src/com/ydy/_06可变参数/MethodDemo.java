package com.ydy._06可变参数;

import java.util.Arrays;

/**
    目标：可变参数。

    可变参数用在形参中可以接收多个数据。
    可变参数的格式：数据类型...参数名称

    可变参数的作用：
        传输参数非常灵活，方便。
            可以不传输参数。
            可以传输一个参数。
            可以传输多个参数。
            可以传输一个数组。

    可变参数在方法内部本质上就是一个数组。
    可变参数的注意事项：
        1.一个形参列表中可变参数只能有一个！！
        2.可变参数必须放在形参列表的后面！！

    小结：
        记住上面
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(1,2);
        sum(1,2,3);
        sum(new int[]{10,20,30});
    }
    public static void sum(int...nums){
        //可变参数在方法内部本质上就是一个数组
        System.out.println("长度："+nums.length);
        System.out.println("内容："+ Arrays.toString(nums));
        System.out.println("-------------------------------------");

    }
}
