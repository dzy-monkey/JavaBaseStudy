package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    @Test
    public void testBufferedReader() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Test\\Demo05.txt"));

            char[] data =new char[1024];
            reader.read(data);
            System.out.print(new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
