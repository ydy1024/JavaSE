package com.ydy._22递归实现文件搜索;

import java.io.File;

/**
    目标：递归实现文件搜索（非规律递归）

    需求：希望去C:\Users\ydy\Desktop\tea\4.jpg

    分析：
        （1）定义一个方法用于做搜索。
        （2）进入方法中进行业务搜索分析。

    小结：
        按照业务流程开发
 */
public class FileSearchDemo {
    public static void main(String[] args) {
        searchFiles(new File("C:\\Users\\ydy\\Desktop\\tea"),"5.11.jpg");
    }

    /**
     * 搜索文件
     * @param dir 搜索文件的目录
     * @param name 搜索文件的名称
     */
    public static void searchFiles(File dir, String name){
        //1.判断是否存在该路径，是否是文件夹
        if (dir.exists()&&dir.isDirectory()){
            //2.提取当前目录下的全部一级文件对象
            File[] files=dir.listFiles();
            //3.判断是否存在一级文件对象（判断是否不为空目录）
            if (files!=null&&files.length>0){
                //4.遍历一级文件对象
                for (File file : files) {
                    //5.判断file是文件还是文件夹
                    if (file.isFile()){
                        if (file.getName().contains(name)){
                            System.out.println(file.getAbsolutePath());

                        }
                    }else {
                        //7.该文件是文件夹，文件夹递归进入继续找
                        searchFiles(file,name);
                    }
                }
            }
        }
    }
}
