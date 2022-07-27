package com.ydy._09文件上传演示;

import java.io.*;
import java.net.Socket;

/**
    目标：实现客户端上传图片给服务端保存起来。

    开发客户端：本地图片：C:\Users\ydy\Desktop\tea\4.jpg
    开发服务端：服务器路径：C:\Users\ydy\Desktop\test
 */
public class ClientDemo {
    public static final String SRC_IMAGE="C:\\Users\\ydy\\Desktop\\tea\\4.jpg";

    public static void main(String[] args) throws Exception{
        //1.请求与服务端的socket通信
        Socket socket=new Socket("127.0.0.1",7777);

        //2.从Socket管道中得到一个字节输出流！
        OutputStream os = socket.getOutputStream();

        //3.把字节输出流包装成高级缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //4.读取本地上传的文件写出到bos管道：复制！
        //定义一个缓冲字节输入管道
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_IMAGE));
        byte[] buffer=new byte[1024];
        int len;
        while ((len=bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        bos.flush();
        bis.close();//本地读文件管道
        socket.shutdownOutput();
        System.out.println("客户端传输图片数据完成！！");
        //5.接收服务端发回来的响应消息！
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
    }
}
