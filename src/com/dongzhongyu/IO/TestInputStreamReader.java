package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {
    //字符流输入
    @Test
    public void inputSteamReader() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream("Test\\Demo04.txt"));
//            System.out.println((char)reader.read());
            char[] data = new char[1024];
            int length = reader.read(data);
            System.out.println(new String(data,0,length));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
