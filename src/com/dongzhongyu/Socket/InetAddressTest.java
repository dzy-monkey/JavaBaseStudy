package com.dongzhongyu.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
//            InetAddress ip =InetAddress.getByName("DESKTOP-1HSOJCG");
            InetAddress ip =InetAddress.getByName("192.168.8.127");
            System.out.println(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
