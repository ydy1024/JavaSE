package com.ydy._00编程思维题目;

import java.io.*;

/**
    目标：复制文件夹。（面试题，扩展）

    源文件：C:\Users\ydy\Desktop\tea
    目标文件：C:\Users\ydy\Desktop\test
 */
public class CopyDirDemo02 {
    public static void main(String[] args) {
        copyDir(new File("C:\\Users\\ydy\\Desktop\\tea"),new File("C:\\Users\\ydy\\Desktop\\test"));
    }

    /**
     * 复制文件夹
     * @param srcDir 源文件夹
     * @param destDir 目标文件夹
     */
    public static void copyDir(File srcDir,File destDir){
        //1.判断源路径是否存在，是否是文件夹
        if (srcDir.exists()&&srcDir.isDirectory()){
            //2.创建目标文件夹
            destDir.mkdirs();
            //3.提取源文件夹的一级文件对象。
            File[] files = srcDir.listFiles();
            //4.判断是否存在以及文件对象。
            if (files!=null&&files.length>0){
                //遍历一级文件对象
                for (File file : files) {
                    //6.判断是否是文件
                    if (file.isFile()){
                        //直接复制目标路径过去
                        copyFile(file,new File(destDir,file.getName()));
                    }else {
                        //file是文件夹了，作为新的源文件夹
                        //目标文件夹：destDir+新文件夹名称
                        copyDir(file,new File(destDir,file.getName()));
                    }
                }
            }
        }

    }

    private static void copyFile(File srcFile, File destFile) {
        try (
                //1.创建一个低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(srcFile);
                BufferedInputStream bis=new BufferedInputStream(is);
                //2.创建一个低级的字节输出流与源文件接通
                OutputStream os=new FileOutputStream(destFile);
                BufferedOutputStream bos=new BufferedOutputStream(os);
        ){
            //3定义一个字节数组存储读取的字节
            byte[] bytes = new byte[1024];
            //定义一个变量存储每次读取的字节数量。
            int len;
            while ((len= bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
