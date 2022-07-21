package com.ydy._04Lambda表达式的省略写法;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
    Lambda表达式的省略写法：（进一步简化）
        （1）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写，同时要省略分号！
        （2）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。
            此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";"不写
        （3）参数类型可以省略不写。
        （4）如果只有一个参数，参数类型可以省略，同时（）也可以省略。
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("ydy");
        names.add("llh");
        names.add("wwd");
        //v1
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //v2
        names.forEach((String s)->{
            System.out.println("姓名:"+s);
        });
        //v3
        names.forEach((s)->{
            System.out.println("姓名:"+s);
        });
        //v4
        names.forEach(s-> System.out.println("姓名:"+s));
        //v5
        names.forEach(System.out::println);
    }
}
