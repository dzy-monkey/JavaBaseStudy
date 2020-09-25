package com.dongzhongyu.Socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDP_Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner s = new Scanner(System.in);
        while (true) {
            String str = s.nextLine();
            if (str.equals("end")) {
                break;
            }
            byte[] buf = str.getBytes();
            int length = buf.length;
            InetAddress address = InetAddress.getByName("localhost");
            int port = 7878;
            DatagramPacket dp = new DatagramPacket(buf, length, address, port);
            ds.send(dp);
        }

        //释放资源
        ds.close();
    }
}
