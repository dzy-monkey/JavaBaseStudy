package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    //字节流的缓冲区 包装的是 字节流
    //字节流的缓冲区 包装的是 字符流
    @Test
    public void testBufferedWriter(){
        BufferedWriter writer =null;
        try {
            writer=new BufferedWriter(new FileWriter("Test\\Demo05.txt"));
            writer.write("中国");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
