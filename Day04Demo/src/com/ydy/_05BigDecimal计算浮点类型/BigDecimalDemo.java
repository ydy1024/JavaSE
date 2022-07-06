package com.ydy._05BigDecimal计算浮点类型;

import java.math.BigDecimal;

/**
    目标：BigDecimal大数据类。

    引入：
        浮点型运算的时候直接+ * /可能出现数据失真（精度问题）。
        BigDecimal可以解决浮点型运算数据失真的问题。
    BigDecimal类：
        包：java.math.
        创建对象的方式（最好的方式）:
            public static BigDecimal valueOf(double val):包装浮点数成为大数据对象。
        方法声明：
            public BigDecimal add(BigDecimal value):加法运算
            public BigDecimal subtract(BigDecimal value):减法运算
            public BigDecimal multiply(BigDecimal value): 乘法运算
            public BigDecimal divide(BigDecimal value):除法运算
            public double doubleValue():把BigDecimal转换成double类型。
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1+0.2);
        System.out.println(0.09+0.01);
        System.out.println();
        double a=0.01;
        double b=0.09;
        //1.把浮点数转换为大数据对象运算
        BigDecimal a1 = BigDecimal.valueOf(a);
        System.out.println(a1);
        BigDecimal a2 = BigDecimal.valueOf(b);
        BigDecimal sum=a1.add(a2);
        System.out.println(sum);
        //结果可能需要继续使用！！
        //BigDecimal解决精度问题的手段，double数据才是我们的目的。
        double rs=sum.doubleValue();
        System.out.println(rs);

    }
}
