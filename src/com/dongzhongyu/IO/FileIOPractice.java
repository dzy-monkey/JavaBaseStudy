package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {

    }

    @Test
    public void testCopy() {
//        Practice("Test\\Demo01.txt", "Test\\Demo02.txt");
        long start = 0, end = 0;
        start = System.currentTimeMillis();
        CopyByByte("Test\\timg.jpg", "Test\\copyimage1.jpg");
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        CopyByByteArray("Test\\timg.jpg", "Test\\copyimage2.jpg");
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public void CopyByByteArray(String sourceName, String targetName) {
        {
            FileInputStream input = null;
            FileOutputStream output = null;
            try {
                input = new FileInputStream(sourceName);
                output = new FileOutputStream(targetName);
                int length = -1;
                byte[] data = new byte[1024];
                while ((length = input.read(data)) > -1) {
                    output.write(data, 0, length);
                }
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
                try {
                    if (output != null) {
                        output.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void CopyByByte(String sourceName, String targetName) {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(sourceName);
            output = new FileOutputStream(targetName);
            int data = -1;
            while ((data = input.read()) > -1) {
                output.write(data);
            }
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
            try {
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
