package com.ydy._07正则表达式的演示;

import java.util.Scanner;

/**
    目标：：正则表达式的实际应用

    0203433535
 */
public class RegexDemo03 {
    public static void main(String[] args) {
        //校验邮箱
//        checkEmail();
        checkTel();
    }

    //校验邮箱
    public static void checkEmail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请你输入邮箱：");
        String email=sc.nextLine();
        //1285012@qq.com.xxxx@163.com
        if (email.matches("\\w{1,20}@\\w{2,10}(\\.\\w{2,10}){1,2}")){
            System.out.println("邮箱合法了");
        }else{
            System.err.println("邮箱出错了");
        }
    }
    //校验手机号码
    public static void checkTel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请你输入手机号码：");
        String email=sc.nextLine();
        //1285012@qq.com.xxxx@163.com
        if (email.matches("1[3-9]\\d{9}")){
            System.out.println("手机号码合法了");
        }else{
            System.err.println("手机号码出错了");
        }
    }
}
