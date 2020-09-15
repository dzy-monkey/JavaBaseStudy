package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffereOutputStream {
    public static void main(String[] args) {

    }

    @Test
    public void testBufferedOutputStream() {
        //缓冲区输出流（包装流）FileOutputStream + 缓冲区(数组)
        //缓冲区里面的数据什么时候会写到硬盘上呢
        //1.缓冲区满了
        //2.调用flush
        //3.调用close
        BufferedOutputStream output = null;
        try {
            output = new BufferedOutputStream(new FileOutputStream("Test\\demo03.txt", true));
            output.write('1');
            output.write('2');
            output.write('3');
            //刷新缓冲区 作为一个保障
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
