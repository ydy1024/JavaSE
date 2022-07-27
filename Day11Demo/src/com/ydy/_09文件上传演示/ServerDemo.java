package com.ydy._09文件上传演示;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
    功能点：
        1.接收多个客户端传输来的图片数据存储到服务器路径:C:\Users\ydy\Desktop\test
        2.响应一个成功的消息给当前客户端。
 */
public class ServerDemo {
    public static final String DEST_DIR="C:\\Users\\ydy\\Desktop\\test";
    public static void main(String[] args) throws Exception{
        System.out.println("==服务端启动==");
        //1.注册端口
        ServerSocket ss=new ServerSocket(7777);
        //定义一个循环不断接受客户端的连接请求
        while (true){
            //2.开始等待接收客户端的Socket管道连接。
            Socket socket = ss.accept();
            //3.每接收一个客户端必须为这个客户端管道分配一个独立的线程来处理与之通信。
            new ServerReaderThread(socket).start();

        }
    }
}
class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //1.接收当前客户端发来的图片
            InputStream is = socket.getInputStream();
            //2.包装成高级的缓冲字节输入流
            BufferedInputStream bis = new BufferedInputStream(is);
            //3.从bis管道中读取客户端发来的图片字节，写出到服务器的仓库路径中！
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ServerDemo.DEST_DIR + UUID.randomUUID().toString() + ".jpg"));
            byte[] buffer=new byte[1024];
            int len;
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            bos.flush();
            bos.close();

            //服务端响应结果！
            //4.得到一个字节输出流，直接包装成打印流
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("传输完毕！！");
            ps.flush();
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(socket.getRemoteSocketAddress()+"下线了~~~~");
        }
    }
}
