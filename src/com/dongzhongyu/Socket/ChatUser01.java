package com.dongzhongyu.Socket;

public class ChatUser01 {
    public static void main(String[] args) {
        new SendThread(7878).start();
        new ReceiveThread(7879).start();
    }
}
