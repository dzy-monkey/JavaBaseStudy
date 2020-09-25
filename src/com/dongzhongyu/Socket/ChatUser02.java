package com.dongzhongyu.Socket;

public class ChatUser02 {
    public static void main(String[] args) {
        new ReceiveThread(7878).start();
        new SendThread(7879).start();
    }
}
