package com.ydy._14final关键字;

/**
 了解：final修饰实例成员变量。（了解，用不到）

 final修饰变量的总规则：有且仅能被赋值一次。

 扩展：
 final修饰实例成员变量可以在哪些地方复制一次：
    1.定义的时候可以赋值一次。
    2.可以在实例代码块中赋值一次。
    3.可以在每个构造器中赋值一次。
 */
public class FinalDemo04 {
    private final String name="ydy";
    private final String name1;

    {
        name1="11";
    }

    private final String name2;
    public FinalDemo04() {
        name2="222";
    }

    public static void main(String[] args) {
        FinalDemo04 finalDemo04 = new FinalDemo04();
        System.out.println(finalDemo04.name);
//        finalDemo04.name="dyyd";//报错
    }
}
