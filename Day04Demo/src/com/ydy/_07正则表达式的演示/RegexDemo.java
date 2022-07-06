package com.ydy._07正则表达式的演示;

import java.util.regex.Pattern;

/**
    目标：正则表达式的演示。

    正则表达式的作用：
        是一些特殊字符组成的校验规则，可以检验信息的正确性，检验邮箱是否合法。
        电话号码，金额。

    需求：演示不用正则表达式和用正则表达式校验QQ号码

    小结：
        正则表达式做校验很好
 */
public class RegexDemo {
    public static void main(String[] args) {
        System.out.println(checkQQ("1285012"));
        System.out.println(cheakQQRegex("1285012"));
    }
    //正则表达式
    public static boolean cheakQQRegex(String qq){
        return qq!=null&&qq.matches("\\d{4,}");
    }
    //不用正则表达式
    public static boolean checkQQ(String qq){
        //1.判断是否为null
        if (qq==null){
            return false;
        }else {
            //2.判断长度是否
            if (qq.length()>=4){
                //3.判断是否全部是数字
                //先定义变量存储最终校验结果
                boolean rs=true;//默认认为合法
                //便利每个字符
                for (int i=0;i<qq.length();i++){
                    char ch=qq.charAt(i);
                    if (ch<'0'||ch>'9'){
                        rs=false;
                    }
                }
                return rs;
            }else {
                return false;
            }
        }
    }
}
