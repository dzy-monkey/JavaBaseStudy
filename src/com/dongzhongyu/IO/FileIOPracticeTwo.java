package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileIOPracticeTwo {

    @Test
    public void testCopyFunction() {
        long start = System.currentTimeMillis();
        copyByByte("Test\\timg.jpg", "Test\\copy2.jpg");
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        copyByByteArray("Test\\timg.jpg", "Test\\copy3.jpg");
        System.out.println(System.currentTimeMillis() - start);

    }

    public void copyByByteArray(String sourceName, String targetName) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            input = new BufferedInputStream(new FileInputStream(sourceName));
            output = new BufferedOutputStream(new FileOutputStream(targetName));
            int length = -1;
            byte[] data = new byte[1024];
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (output != null) {
                    output.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyByByte(String sourceName, String targetName) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        try {
            input = new BufferedInputStream(new FileInputStream(sourceName));
            output = new BufferedOutputStream(new FileOutputStream(targetName));
            int data = -1;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
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
