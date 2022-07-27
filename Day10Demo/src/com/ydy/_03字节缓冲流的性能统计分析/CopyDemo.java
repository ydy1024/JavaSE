package com.ydy._03字节缓冲流的性能统计分析;

import java.io.*;

/**
    目标：利用字节流的复制统计各种写法形式下缓冲流的性能执行情况。

    复制流：
        （1）使用低级的字节流按照一个一个字节的形式复制文件。
        （2）使用低级的字节流按照一个一个字节数组的形式复制文件。
        （3）使用高级的缓冲字节流按照一个一个字节的形式复制文件。
        （4）使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。

    源文件：D:\XiJingping.mp4
    目标文件：C:\Users\ydy\Desktop\Xi.mp4

    小结：
        缓冲流按照字节数组读写数据的性能是最高的，建议使用！

 */
public class CopyDemo {
    public static final String SRC_FILE="D:\\XiJingping.mp4";
    public static final String DEST_FILE="C:\\Users\\ydy\\Desktop\\";

    public static void main(String[] args) {
//        copy01();//太慢太慢了，踢出局。
        copy02();//速度较慢
        copy03();//速度较慢
        copy04();//速度最快
    }

    /**
        （1）使用低级的字节流按照一个一个字节的形式复制文件。
     */
    public static void copy01(){
        long startTimer=System.currentTimeMillis();
        try (
                //1.创建一个低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个低级的字节输出流与源文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"t1.mp4");
        ){
            //3定义一个整型变量存储读取的字节
            int ch; //a b c
            while ((ch=is.read())!=-1){
                os.write(ch);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTimer=System.currentTimeMillis();
        System.out.println("低级字节按字节-复制完毕，耗时："+(endTimer-startTimer)/1000.0+"s");
    }

    /**
        （2）使用低级的字节流按照一个一个字节数组的形式复制文件。
     */
    public static void copy02(){
        long startTimer=System.currentTimeMillis();
        try (
                //1.创建一个低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个低级的字节输出流与源文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"t2.mp4");
        ){
            //3定义一个字节数组存储读取的字节
            byte[] bytes = new byte[1024];
            //定义一个变量存储每次读取的字节数量。
            int len;
            while ((len= is.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTimer=System.currentTimeMillis();
        System.out.println("低级字节按字节数组-复制完毕，耗时："+(endTimer-startTimer)/1000.0+"s");
    }
    /**
        （3）使用高级的缓冲字节流按照一个一个字节的形式复制文件。
     */
    public static void copy03(){
        long startTimer=System.currentTimeMillis();
        try (
                //1.创建一个低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis=new BufferedInputStream(is);
                //2.创建一个低级的字节输出流与源文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"t3.mp4");
                BufferedOutputStream bos=new BufferedOutputStream(os);
        ){
            //3定义一个整型变量存储读取的字节
            int ch; //a b c
            while ((ch=bis.read())!=-1){
                bos.write(ch);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTimer=System.currentTimeMillis();
        System.out.println("高级字节按字节-复制完毕，耗时："+(endTimer-startTimer)/1000.0+"s");
    }
    /**
        （4）使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。
     */

    public static void copy04(){
        long startTimer=System.currentTimeMillis();
        try (
                //1.创建一个低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis=new BufferedInputStream(is);
                //2.创建一个低级的字节输出流与源文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"t4.mp4");
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
        long endTimer=System.currentTimeMillis();
        System.out.println("高级字节按字节数组-复制完毕，耗时："+(endTimer-startTimer)/1000.0+"s");
    }
}
