package com.ydy._03UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
    目标：UDP服务端开发。接收客户都的消息。
 */
public class UDPServerDemo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("====服务端启动====");
        //1.创建一个接收客户端的数据包对象(集装箱)
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        //2.创建一个接收端码头对象

        DatagramSocket socket = new DatagramSocket(6666);

        //3.接收
        socket.receive(packet);

        //4.从集装箱中获取本次读取的数据量
        int len = packet.getLength();

        //5.输出数据
        String rs = new String(buffer,0,len);
        System.out.println(rs);

        //6.服务端还能获取发来消息的客户端的IP和端口
        String ip=packet.getAddress().getHostAddress();
        int port= packet.getPort();
        System.out.println(ip+":"+port);
    }
}
