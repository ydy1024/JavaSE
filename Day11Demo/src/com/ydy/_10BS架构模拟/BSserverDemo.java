package com.ydy._10BS架构模拟;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
    目标：BS-浏览器-服务器基本了解。

    引入：
        之前客户端和服务端都需要自己开发。也就是CS架构。
        接下来模拟一下BS架构。

    客户端：浏览器（无需开发）
    服务端：自己开发
    需求：在浏览器中请求本应用程序，响应一个网页文字给浏览器显示
 */
public class BSserverDemo {
    public static void main(String[] args) {
        try{
            //1.注册端口
            ServerSocket ss = new ServerSocket(8080);
            //2.创建一个循环接收多个客户端的请求。
            while (true){
                Socket accept = ss.accept();
                //3.交给一个独立的线程来处理。
                new ServerReaderThread(accept).start();
            }
        }catch (Exception e){

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
            //响应消息给浏览器显示。
            //浏览器是基于HTTP协议通信。
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");//响应数据的响应头数据！
            ps.println("Content-Type:text/html;charset=UTF-8");//响应数据的类型。网页或者文本内容！
            ps.println();//必须换一行
            //开始响应数据！！
            ps.println("<span style='color:green'>优秀的姚道炎！</span>");
            Thread.sleep(3000);
            ps.close();
        }catch (Exception e){

        }
    }
}