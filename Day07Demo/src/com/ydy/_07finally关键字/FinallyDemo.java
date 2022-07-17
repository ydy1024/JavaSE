package com.ydy._07finally关键字;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
    目标：finally关键字

    用在捕获处理的异常格式中的，放在最后面。
        try{
            //可能出现异常的代码！
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //无论代码是出现异常还是正常执行，最终一定要执行这里的代码！
        }
        try:1次
        catch:0-N次（如果有finally出现catch可以没有）
        finally:0-1次
    finally的作用：可以在代码执行完毕以后进行资源的释放操作。
        什么是资源？资源都是实现了Closeable接口的，都自带close()关闭方法！
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println(chu1());
    }
    public static int chu1(){
        try {
            int a=10/2;
            return a;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("==finally被执行");
            //不建议在finally里面加return，会覆盖前面所有return的值
        }
    }
    public static void chu(){
        InputStream inputStream=null;
        try{
            inputStream = new FileInputStream("D:/1.jpg");
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("==finally被执行==");
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
