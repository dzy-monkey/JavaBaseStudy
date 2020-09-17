package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 统计一个文件中有多少个字母'A'和'a'
*/
public class FileIOPracticeFive {
    @Test
    public void test6() {
        FileReader reader = null;
        int ACount = 0;
        int aCount = 0;
        try {
            reader = new FileReader("Test\\Demo05.txt");
            int data = -1;
            while ((data = reader.read()) != -1) {
                if (data == 'A') {
                    ACount++;
                } else if (data == 'a') {
                    aCount++;
                }
            }
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
        System.out.println(ACount);
        System.out.println(aCount);
    }


}
