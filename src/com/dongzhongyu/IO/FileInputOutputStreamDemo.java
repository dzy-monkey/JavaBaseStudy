package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

    }

    //文件输入输出流
    //FileInputStream FileOutputStream
    @Test
    public void testFileInputStream() {
        FileInputStream input = null;
        try {
            input = new FileInputStream("Test/Demo01.txt");
            try {
                //读取一个字节
                //int a = input.read();
                //System.out.println((char) a);
                //要记得关闭
                //读取多个字节
                int a = 0;
                while (true) {
                    a = input.read();
                    System.out.print((char) a);
                    if (a == -1) {
                        input.close();
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //要记得关闭
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
