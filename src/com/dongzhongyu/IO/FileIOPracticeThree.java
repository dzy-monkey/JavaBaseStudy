package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIOPracticeThree {
    /**
     * 读取文本文件中的内容，按照单行内容，放到集合里面
     *
     */
    @Test
    public void test03(){
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader("Test\\Demo05.txt"));
            String data =null;
            while ((data=reader.readLine())!= null){
                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader!=null){
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (String stringNum : list){
            System.out.println(stringNum);
        }
    }
}
