package com.dongzhongyu.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPReceive {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(7878);
        //接收，建立跟发送端的连接
        Socket client = ss.accept();
        System.out.println("接收到一个客户端的链接");
        InputStream input = client.getInputStream();
        OutputStream output = client.getOutputStream();
        Thread t=new Thread() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    if (client.isClosed()) {
                        break;
                    }
                    String str = scanner.nextLine();
                    if (str.equals("end")) {
                        break;
                    }
                    try {
                        output.write(str.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.setDaemon(true);
        t.start();

        byte[] buf = new byte[1024];
        int length = -1;
        try {
            while ((length = input.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        client.close();
        ss.close();
    }
}
