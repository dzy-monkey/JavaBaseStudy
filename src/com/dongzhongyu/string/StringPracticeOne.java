package com.dongzhongyu.string;

public class StringPracticeOne {
    public static void main(String[] args) {
        String a = "DzyStudyDzyJava";
        String str1 = "Dzy";
        //查找字符串的长度
        System.out.println(a.length());
        //查找子字符串的位置
        System.out.println(a.indexOf(str1));
        System.out.println(a.lastIndexOf(str1));
        //获取指定位置的字符
        System.out.println(a.charAt(0));
        //从起始位置获取子字符串
        System.out.println(a.substring(1));
        System.out.println(a.substring(0,3));
        String[] Strs =a.split("z");
        for (String nume :
                Strs) {
            System.out.println(nume);
        }

    }
}
