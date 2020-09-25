package com.dongzhongyu.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPSend {
    public static void main(String[] args) throws Exception {
        //建立指定的ip port连接
        Socket s = new Socket("localhost", 7878);
        InputStream input = s.getInputStream();
        OutputStream output = s.getOutputStream();

        new Thread() {
            @Override
            public void run() {
                byte[] buf = new byte[1024];
                int length = -1;
                try {
                    while (true) {
                        if (s.isClosed()) {
                            break;
                        }
                        length = input.read(buf);
                        if (length == -1) {
                            break;
                        }
                        System.out.println(new String(buf, 0, length));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("end")) {
                break;
            }
            output.write(str.getBytes());
        }
        s.close();
    }
}
