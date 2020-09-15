package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @author dzy
 */
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

    }

    /**
     * 文件输入输出流
     * FileInputStream FileOutputStream
     */
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
//                int a = -1;
//                while ((a = input.read())>-1) {
//                    System.out.print((char) a);
//                }
                //按照字节数组1024
                byte[] data = new byte[4];
                int length = -1;
                while ((length = input.read(data)) > -1) {
//                    for (int i = 0; i < length; i++) {
//                        System.out.print((char) data[i]);
//                    }
                    String str = new String(data, 0, length);
                    System.out.print(str);
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
