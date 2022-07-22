package com.ydy._20File目录的遍历;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.Stream;

/**
    目标：File针对目录的遍历
        -public String[] list():
            获取当前目录下所有的”一级文件名称“到一个字符串数组中去返回。
        -public File[] listFiles()(常用):
            获取当前目录下所有的”一级文件对象“到一个文件对象数组中去返回(重点)
 */
public class FileDemo {
    public static void main(String[] args) {
        File file2 = new File("C:\\Users\\ydy\\Desktop\\tea");
        //a.获取当前目录下所有的”一级文件名称“到一个字符串数组中去返回。
        String[] names=file2.list();
        Arrays.stream(names).forEach(System.out::println);

        //b.获取当前目录下所有的”一级文件对象“到一个文件对象数组中去返回
        File[] files=file2.listFiles();
        assert files != null;
        Arrays.stream(files).forEach(System.out::println);

        //扩展
        File file = new File("C:\\Users\\ydy\\Desktop\\1.jpg");
        long l = file.lastModified();//最后修改时间
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(l));
    }
}
