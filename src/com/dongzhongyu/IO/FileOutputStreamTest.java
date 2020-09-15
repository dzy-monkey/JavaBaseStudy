package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

    }

    @Test
    public void testFileOutputStream() {
        FileOutputStream output = null;
        try {
            //如果不存在的话，会自动帮我们创建文件  该方法会把文件里的内容覆盖
//            output = new FileOutputStream("Test/Demo02.txt");
            //这个是追加的构造方式，所以不会清空原有的内容
            output = new FileOutputStream("Test/Demo02.txt",true);

//            output.write('d');
//            output.write('z');
//            output.write('y');
            String str= "中国你好";
//            output.write(str.getBytes());
            output.write(str.getBytes(),0,12);
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
