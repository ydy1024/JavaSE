package com.ydy._05TCP通信二;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
    目标：客户端可以反复发送数据，服务端可以反复接收数据！！

    分析：
        只需要让客户端通过循环进行数据的发送。

    产生的问题：
        目前服务端只能接收一个客户端请求。
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
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
