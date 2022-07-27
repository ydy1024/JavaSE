package com.ydy._06TCP通信三;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("==服务端启动==");
        //1.注册端口
        ServerSocket ss=new ServerSocket(8888);
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
            //从Socket通信管道中得到一个字节输入流。
            InputStream is = socket.getInputStream();
            //把字节输入流转换成字符输入流
            Reader isr = new InputStreamReader(is);
            //把字符输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(isr);
            //按照行读取消息
            String msg;
            while ((msg= br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说："+msg);
            }
        }catch (Exception e){
            System.out.println(socket.getRemoteSocketAddress()+"下线了~~~~");
        }
    }
}