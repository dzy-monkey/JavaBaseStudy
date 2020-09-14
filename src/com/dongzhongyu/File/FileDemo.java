package com.dongzhongyu.File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileDemo {
    public static void main(String[] args) {


    }

    @Test
    public void practice03() throws IOException {
        //将一个文件复制到另一个目录下
        File soure = new File("C:\\Users\\36240\\Desktop\\FileTestDemo\\Demo.txt");
        File target = new File("C:\\Users\\36240\\Desktop\\FileTestDemo\\1\\Demo.txt");
        Files.copy(soure.toPath(), target.toPath());
    }

    @Test
    public void practice02() {
        //递归遍历某个目录下所有的文件包括子目录
        listFiles(new File("E:\\Java Projects\\JavaBaseStudy\\src\\com\\dongzhongyu"));
    }

    public static void listFiles(File f) {
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                listFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    @Test
    public void practice01() {
        //查看当前目录下有多少个java源文件
        String path = "E:\\Java Projects\\JavaBaseStudy\\src\\com\\dongzhongyu\\array";
        File newPath = new File(path);
        String[] names = newPath.list();
        int count = 0;
        for (String string : names) {
            if (string.endsWith(".java")) {
                count++;
                System.out.println(string);
            }
        }
        System.out.println(count);
    }

    public void methodPanDuan() {
        /**File可以指向一个文件，也可以指向文件夹*/
        File p1 = new File("C:\\Users\\36240\\Desktop\\FileTestDemo");
        File f = new File(p1, "Demo.txt");
        //是否是路径
        System.out.println(p1.isDirectory());
        System.out.println(f.isDirectory());
        System.out.println("--------------------------");
        //是否是文件
        System.out.println(p1.isFile());
        System.out.println(f.isFile());
        System.out.println("--------------------------");
        //路径或者文件是否存在
        System.out.println(p1.exists());
        System.out.println(f.exists());
        System.out.println("--------------------------");
        //是否可读
        System.out.println(p1.canRead());
        System.out.println(f.canRead());
        System.out.println("--------------------------");
        //是否可执行
        System.out.println(f.canExecute());
        System.out.println(p1.canExecute());
        System.out.println("--------------------------");
        //是否是隐藏的
        System.out.println(f.isHidden());
    }

    public void methodCUD() {
        String path2 = "C:\\Users\\36240\\Desktop\\FileTestDemo2";
        String path3 = "C:\\Users\\36240\\Desktop\\FileTestDemo3\\Test";
        /**File可以指向一个文件，也可以指向文件夹*/
//        File p1 = new File(path1);
        File p2 = new File(path2);
        File p3 = new File(path3);
//        p2.delete();
//        File f = new File(p1, "Demo2.txt");
        //创建一个文件
//        try {
//            boolean isSuccess = f.createNewFile();
//            System.out.println(isSuccess);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //只能创建一级文件夹
        //p2.mkdir();
        //可以创建多级文件夹
        //p3.mkdirs();
//        p3.delete();
        //文件的删除
//        f.delete();
        //文件改名
        //f.renameTo(new File("C:\\Users\\36240\\Desktop\\FileTestDemo\\Demo3.txt"));
    }

    public void methodGet() {
        String path1 = "C:\\Users\\36240\\Desktop\\FileTestDemo";
        File p1 = new File(path1);
        File f1 = new File(path1, "Demo2.txt");

        System.out.println(p1.getAbsolutePath());
        System.out.println(p1.getPath());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        //相对路径
        //File p=new File("Test\\t1");
        System.out.println(p1.getName());
        System.out.println(f1.getName());
        System.out.println(p1.getParent());
        System.out.println(f1.getParent());
        //获取文件大小 单位是字节
        System.out.println(f1.length());
        //获取最后修改的时间
        System.out.println(f1.lastModified());
        System.out.println(p1.lastModified());
    }

    public void methodListFiles() {
        String path1 = "C:\\Users\\36240\\Desktop\\FileTestDemo";
        File p1 = new File(path1);
        File f1 = new File(path1, "Demo2.txt");
        //获取子文件 这个返回的是String类型的字符串，根据需求调用方法即可
        String[] str = p1.list();
        for (String s : str) {
            System.out.println(s);
        }
        //获取子文件 这个会转变成File类型的数据，方便操作，根据需求做出选择
        File[] files = p1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
