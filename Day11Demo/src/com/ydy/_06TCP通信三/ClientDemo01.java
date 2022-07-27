package com.ydy._06TCP通信三;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
    目标：实现一个服务端可以同时接收多个客户端的消息。

    总结：
        需求在服务端引入多线程。
        每接收一个客户端的Socket通道，就为它分配一个独立的线程来处理他的消息。
        如此便可实现：一个服务端可以同时接收多个客户端消息。
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        System.out.println("==客户端启动==");
        //1.客户端要求请求于服务端的socket管道连接。对方IP，端口
        Socket socket = new Socket("127.0.0.1",8888);
        //2.从socket通信管道中得到一个字节输出流。
        OutputStream os=socket.getOutputStream();
        //3.把低级的字节输出流包装成高级的打印流
        PrintStream ps = new PrintStream(os);
        //4.开始发消息出去
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请说：");
            ps.println(scanner.nextLine());
            ps.flush();
        }

    }
}
