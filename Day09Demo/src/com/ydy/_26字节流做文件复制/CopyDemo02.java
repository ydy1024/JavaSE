package com.ydy._26字节流做文件复制;

import java.io.*;

/**
    目标：JDK1.7开始之后释放资源的新方式

    try-with-resources:
        try{
            //这里只能放置资源对象，用完会自动调用close()关闭
        }{

        }catch(Exception e){
            e.printStackTrace();
        }
    什么是资源？
        资源类一定是实现了Closeable接口，实现这个接口的类就是资源。
        有close()方法，try-with-resources会自动调用它的close()关闭资源。

    小结：
        JDK1.7开始释放资源的新方式try-with-resources。如此就不需要写finally代码块了
 */
public class CopyDemo02 {
    public static void main(String[] args) {
        try(
            //（1）创建一个字节输入流管道与源文件接通。
            InputStream is = new FileInputStream("C:\\Users\\ydy\\Desktop\\tea\\4.jpg");
            //（2）创建一个字节输出流与目标文件接通。
            OutputStream os = new FileOutputStream("C:\\Users\\ydy\\Desktop\\tea.jpg");
            ){
            //（3）建一个字节数组作为桶。
            byte[] bytes = new byte[1024];
            //（4）从字节输入流管道中读取数据，写出到字节输出流管道中即可。
            //定义一个变量存储每次桶读取的字节数
            int len;
            while ((len= is.read(bytes))!=-1){
                //读取多少到多少
                os.write(bytes,0,len);
            }
            System.out.println("复制完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
