package com.ydy._04字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
    目标：题目练习。

    需求：把出师表的文章顺序进行恢复到一个新文件中！

    分析：
        （1）创建一个缓冲字符输入流对象包装字符输入流接通源文件。
        （2）定义一个List集合用于存储每段文章。
        （3）定义一个循环，按照行读取每段文章，存入到List集合中去。
        （4）对List的每个元素，按照首字符排序。
        （5）创建一个缓冲字符输出流管道通向目标文件。
        （6）遍历List集合中的每个元素，通过缓冲字符输出管道写出到目标文件。
        （7）释放资源
 */
public class ExecDemo {
    public static void main(String[] args) {
        try(
                //（1）创建一个缓冲字符输入流对象包装字符输入流接通源文件。
                BufferedReader br=new BufferedReader(new FileReader("Day10Demo/src/csb.txt"));
                //（5）创建一个缓冲字符输出流管道通向目标文件。
                BufferedWriter bw=new BufferedWriter(new FileWriter("Day10Demo/src/newcsb.txt"));
        ){
            //（2）定义一个List集合用于存储每段文章。
            ArrayList<String> datas = new ArrayList<>();
            //（3）定义一个循环，按照行读取每段文章，存入到List集合中去。
            String line;
            while ((line=br.readLine())!=null){
                datas.add(line);
            }
            List<Character> sizes=new ArrayList<>();
            Collections.addAll(sizes,'零','一','二','三','四','五','六','七','八','九','十');
            //（4）对List的每个元素，按照首字符排序。
//            Collections.sort(datas, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    //o1 三.侍
//                    //02 八.愿
//                    //indexOf获取元素在List集合中的索引。
//                    return sizes.indexOf(o1.charAt(0))-sizes.indexOf(o2.charAt(0));
//                }
//            });
            Collections.sort(datas,((o1, o2) -> sizes.indexOf(o1.charAt(0))-sizes.indexOf(o2.charAt(0))));
            System.out.println(datas);

            //（6）遍历List集合中的每个元素，通过缓冲字符输出管道写出到目标文件。
            for (String data : datas) {
                bw.write(data);
                bw.newLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
