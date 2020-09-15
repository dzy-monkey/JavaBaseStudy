package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {
    public static void main(String[] args) {


    }

    @Test
    public void testBufferedInputStream() {
        //缓冲区输入流 = 输入流+缓冲区
        BufferedInputStream input = null;
        FileInputStream fileInput;

        try {
            fileInput = new FileInputStream("Test\\Demo01.txt");
            input = new BufferedInputStream(fileInput);
//            int data = input.read();
//            System.out.println((char) data);
            byte[] data =new byte[1024];
            int length =input.read(data);
            String str =new String(data,0,length);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
