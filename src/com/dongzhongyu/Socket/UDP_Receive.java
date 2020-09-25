package com.dongzhongyu.Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP_Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(7878);
        while (true) {
            byte[] buf = new byte[1024];
            int length = buf.length;
            DatagramPacket dp = new DatagramPacket(buf, length);
            //程序会在这里等待，等数据的到来
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
//            System.out.println(str);
            InetAddress address = dp.getAddress();
//            System.out.println(address);
            //这是发送端的端口号
//            System.out.println(dp.getPort());
            System.out.println(address + ":" + str);
        }
//        ds.close();
    }
}
