package com.dongzhongyu.IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileIOPracticeFour {
    /**
     * 复制所有的文件夹和文件
     */
    @Test
    public void test05(){
        copy(new File("C:\\Users\\36240\\Desktop\\FileTestDemo"),new File("C:\\Users\\36240\\Desktop\\1"));
    }
    public void copy(File soucreFolder, File targetFolder){
        if (targetFolder.exists()==false){
            targetFolder.mkdirs();
        }
        File[] files = soucreFolder.listFiles();

        for (File file : files){
            if (file.isDirectory()){
                File newFile=new File(targetFolder,file.getName());
                copy(file,newFile);
            }else {
                File newFile=new File(targetFolder,file.getName());
                try {
                    Files.copy(file.toPath(),newFile.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
