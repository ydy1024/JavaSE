package com.ydy._07正则表达式的演示;

import java.util.Scanner;

/**
    目标：
        public String[] split(String regex):
            --按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组。
        public String replaceAll(String regex,String newStr):
            --按照正则表达式匹配的内容进行替换
 */
public class RegexDemo04 {
    public static void main(String[] args) {
        //1.split的基础用法
        String names="wwd,llg,ydy";
        String[] name=names.split(",");
        for (int i=0;i<name.length;i++){
            String n=name[i];
            System.out.println(n);
        }

        //2.split集合正则表达式做分割
        String names1="姚道炎123abc456刘力皓123412fasc王伟东";
        String[] name1=names1.split("\\w+");
        for (int i=0;i<name1.length;i++){
            String n=name1[i];
            System.out.println(n);
        }
        //3.replaceAll
        String names2="姚道炎123abc456刘力皓123412fasc王伟东";
        System.out.println(names2.replaceAll("\\w+",","));



    }


}
