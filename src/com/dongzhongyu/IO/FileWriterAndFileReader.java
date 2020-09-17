package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReader {
    @Test
    public void testFileWriter() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("Test\\Demo04.txt");
            writer.write("Dzy是企业家");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void testFileReader(){
        FileReader reader=null;
        try {
            reader=new FileReader("Test\\Demo04.txt");
            char[] data =new char[1024];
            int length=reader.read(data);
            System.out.println(new String(data,0,length));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
