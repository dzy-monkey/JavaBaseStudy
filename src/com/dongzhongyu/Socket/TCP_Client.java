package com.dongzhongyu.Socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Client {
    public static void main(String[] args) throws Exception {
        Socket s =new Socket("localhost",7878);
        Scanner scanner =new Scanner(System.in);
        s.getOutputStream().write(scanner.nextLine().getBytes());
        s.close();
    }
}
