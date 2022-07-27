package com.ydy._07序列化;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
    目标：对象反序列化技术
     IO流的体系：
                 字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）
                                                           InputStreamReader           OutputStreamWriter
     ObjectInputStream     ObjectOutputStream

    对象反序列化（对象字节输入流）：ObjectInputStream
        --作用：读取序列化的对象文件恢复到Java对象中。
        --构造器：public ObjectInputStream(InputStream is)
        --方法：public final Object readObject()

    如果一个字段不想参与序列化：
            transient修饰改成员变量，将不参与序列化
    序列化版本号：
         //加入序列化版本号
         private static final long serialVersionUID=2L;
        必须序列化使用的版本号和反序列化使用的版本号一致才可以正常反序列化！否则报错！

    小结：
        对象反序列化可以把对象序列化的文件数据恢复成Java对象。
 */
public class SerializeDemo02 {
    public static void main(String[] args) throws Exception{
        //1.定义一个低级的字节输入流通向源文件
        InputStream is=new FileInputStream("Day10Demo/src/data.txt");

        //2.把字节输入流包装成高的对象字节输入流
        ObjectInputStream ois=new ObjectInputStream(is);

        //3.反序列化
        User user= (User) ois.readObject();

        System.out.println(user);
    }
}
