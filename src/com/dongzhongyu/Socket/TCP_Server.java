package com.dongzhongyu.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) {
        new ConnetionThread().start();
    }
}

class ConnetionThread extends Thread {
    @Override
    public void run() {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(7878);
            while (true) {
                //监听客户端的连接请求
                Socket s = ss.accept();
                System.out.println("接收到一个客户端连接" + s.getInetAddress());
                new ClientThread(s).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ClientThread extends Thread {
    private Socket s;

    public ClientThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream input = s.getInputStream();
            byte[] buf = new byte[1024];
            int length = -1;
            while ((length = input.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (s!=null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

