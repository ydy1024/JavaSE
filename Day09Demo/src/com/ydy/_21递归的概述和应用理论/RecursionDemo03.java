package com.ydy._21递归的概述和应用理论;

/**
    扩展：递归的核心思想-公式转换

    已知：f(x)=f(x+1)+2
         f(1)=1
    求：f(10)=?

    递归算法的三要素：
        （1）递归的公式：f(x)=f(x-1)-2
        （2）递归的终结点：f(1)=1
        （3）递归的方向：必须走向终结点。
 */
public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int x){
        if (x==1){
            return 1;
        }else {
            return f(x-1)-2;
        }
    }
}
