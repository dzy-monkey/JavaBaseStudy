package com.dongzhongyu.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendThread extends Thread {

    private int port;

    public SendThread(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            Scanner s = new Scanner(System.in);
            while (true) {
                String str = s.nextLine();
                if (str.equals("end")) {
                    break;
                }
                byte[] buf = str.getBytes();
                int length = buf.length;
                InetAddress address = InetAddress.getByName("localhost");
                DatagramPacket dp = new DatagramPacket(buf, length, address, port);
                ds.send(dp);
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
