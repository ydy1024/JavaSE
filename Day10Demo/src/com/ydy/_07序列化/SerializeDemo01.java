package com.ydy._07序列化;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
    目标：对象序列化技术

    对象序列化：就是把Java对象数据直接存储到文件中去。          对象=>文件中
    对象反序列化：就是把Java对象的文件数据恢复到Java对象中。     文件中=>对象

     IO流的体系：
     字节流                                                    字符流
     字节输入流              字节输出流                        字符输入流                   字符输出流
     InputStream           OutputStream                    Reader                      Writer        （抽象类）
     FileInputStream       FileOutputStream                FileReader                  FileWriter    （实现类）
     BufferedInputStream   BufferedOutputStream            BufferedReader              BufferedWriter （实现类）
                                                           InputStreamReader           OutputStreamWriter
     ObjectInputStream     ObjectOutputStream

    对象序列化流（对象字节输出流）：ObjectOutputStream
            作用：把内存中的Java对象数据保存到文件中
            --构造器：：public ObjectOutputStream(OutputStream out):
            --序列化方法：public final void writeObject(Object obj):

    注意：如果要序列化对象，那么对象必须实现序列化接口：implements Serializable

    小结：
        如果要序列化对象，那么对象必须实现序列化接口：implements Serializable
        对象序列化使用的流是ObjectOutputStream
 */
public class SerializeDemo01 {
    public static void main(String[] args) throws Exception{
        //1.创建USer用户对象
        User user = new User("姚道炎","123456","姚");

        //2.创建低级字节输出流通向目标文件
        OutputStream os = new FileOutputStream("Day10Demo/src/data.txt");

        //3.把低级的字节输出流包装成高级的对象字节输出流。
        ObjectOutputStream oos = new ObjectOutputStream(os);

        //4.通过对象字节输出流序列化对象。
        oos.writeObject(user);

        //5.释放资源
        oos.close();
        System.out.println("序列化成功！");
    }
}
