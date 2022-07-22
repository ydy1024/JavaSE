package com.ydy._21递归的概述和应用理论;

/**
    目标：递归的经典案例。

    猴子吃桃：
        猴子第一天摘了若干个桃子，当即吃了一半，觉得好不过瘾，然后又吃了一个。
        第二天又吃了前一天剩下的一半，觉得好不过瘾，然后又吃了一个。
        以后每天都是如此
        等到第十天再吃的时候发现只有一个桃子，请问猴子第一天摘了多少个桃子。

    公式：
        f(x+1)=f(x)-f(x)/2-1
        2f(x+1)=f(x)-2
        f(x)=2f(x+1)+2
    递归算法的三要素：
     （1）递归的公式：f(x)=2f(x+1)+2
     （2）递归的终结点：f(10)=1
     （3）递归的方向：必须走向终结点。
 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }
    public static int f(int x){
        if (x==10){
            return 1;
        }else {
            return 2*f(x+1)+2;
        }
    }
}
