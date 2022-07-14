package com.ydy._07Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
    目标：输出一个字符串中每个字符出现的次数。(经典面试题)

    分析：
        （1）键盘录入一个字符串。aabbccddaa123.
        （2）定义一个Map集合，键是每个字符，值是其出现的次数。
        （3）遍历字符串中的每一个字符。
        （4）拿着这个字符去Map集合中看是否有这个字符键，有说明之前统计过，其值+1
            没有这个字符键，说明该字符是第一次统计，直接存入“该字符=1”

    小结：
        开发中如果遇到了信息是键值对的形式，考虑用Map集合解决。
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //（1）键盘录入一个字符串。aabbccddaa123.
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String datas = scanner.nextLine();
        //（2）定义一个Map集合，键是每个字符，值是其出现的次数。
        Map<Character, Integer> infos = new HashMap<>();

        //（3）遍历字符串中的每一个字符。
        for (int i=0;i<datas.length();i++){
            //取出当前索引的字符
            char ch=datas.charAt(i);
            System.out.print(ch);
            //4)拿出这个字符去Map集合中看是否有这个字符键，有说明之前统计过，其值+1
            //没有这个字符键，说明该字符是
            if (infos.containsKey(ch)){
                //说明这个字符以前出现过
                infos.put(ch,infos.get(ch)+1);
            }else {
                //说明这个字符第一次出现
                infos.put(ch,1);
            }
        }
        //输出结果
        System.out.println(infos);
    }
}
