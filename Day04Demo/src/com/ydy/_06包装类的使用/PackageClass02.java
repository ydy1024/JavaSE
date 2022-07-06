package com.ydy._06包装类的使用;

/**
    目标：包装类的特殊功能。

    Java为包装类做了一些特殊功能，以便程序员使用。
    包装类作为类首先拥有了Object类的方法。
    包装类作为引用类型的变量可以存储null值。

    具体来看特殊功能主要有：
        1.可以把基本数据类型的值转换成字符串类型的值。（没啥用）
            --调用toString()方法。
            --调用Integer.toString(基本数据类型的值)得到字符串。
            --直接把基本数据类型+空字符串就得到了字符串。
        2.把字符串类型的数值转换成对应的基本数据类型的值。（真的很好用）
            --Xxx.parseXxx("字符串类型的数值")
            --Xxx.valueOf("字符串类型的数值")：推荐使用！
    小结：
        包装类可以把字符串类型的数值转换成对应的基本数据类型的值（真的很有用）
 */
public class PackageClass02 {
    public static void main(String[] args) {
        //1.把基本数据类型的值转换成字符串
        Integer it=100;
        //a.调用toString方法
        String itStr=it.toString();
        System.out.println(itStr);
        //b.调用Integer.toString(基本数据类型的值)得到字符串。
        String itStr1=Integer.toString(it);
        System.out.println(itStr1+1);
        //c.直接把基本数据类型+空字符串得到了字符串
        String itStr2=it+"";
        System.out.println(itStr2+1);
        //2.把字符串类型的数值转换成对应的基本数据类型的值。（真的很好用）
        String num="23";
//        int num1=Integer.parseInt(num);
        int num1=Integer.valueOf(num);
        System.out.println(num1);

        String str1="99.9";
//        double dStr=Double.parseDouble(str1);
        double dStr=Double.valueOf(str1);
        System.out.println(dStr+0.1);
    }
}
