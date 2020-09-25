package com.dongzhongyu.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveThread extends Thread {
    private int port;

    public ReceiveThread(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(port);
            while (true){
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null) {
                ds.close();
            }
        }
    }
}
