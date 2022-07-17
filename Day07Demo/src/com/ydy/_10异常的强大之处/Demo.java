package com.ydy._10异常的强大之处;

import java.util.Scanner;

/**
    扩展：异常的作用
        1.可以处理代码问题，防止程序出现异常后的死亡。
        2.提高了程序的健壮性和安全性。
 */
public class Demo {
    public static void main(String[] args) {
        //需求：请输入一个合法年龄为止
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入您的年龄：");
                int age = scanner.nextInt();
                System.out.println("您是："+age);
            }catch (Exception e){
                System.err.println("错了");
            }
        }
    }
}
