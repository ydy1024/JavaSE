package com.ydy._07TCP通信四;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class ReaderClientRunnable implements Runnable{
    private Socket socket;

    public ReaderClientRunnable(Socket socket) {
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
