package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
    //字符流
    //OutputStreamWriter 是包装流
    //InputStreamReader
    @Test
    public void testOutputStreamWriter() {
        OutputStreamWriter writer = null;
        try {
            FileOutputStream fileOutput = new FileOutputStream("Test\\Demo04.txt");
            writer = new OutputStreamWriter(fileOutput, "UTF-8");
//            writer.write('中');
//            writer.write('国');
//            writer.write("中国好，我爱中国");
//            writer.write(new char[]{'的','子'});
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
}
