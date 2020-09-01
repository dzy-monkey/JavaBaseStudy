package com.dongzhongyu.string;

//在一个字符串中查找一个子串，计算出来这个子串在字符串中出现的次数
public class StringPracticeTwo {
    public static void main(String[] args){
        String str = "ashdaabcsjabcabssjjabc";
        String str2 = "abc";
        int count = 0;
        while (true){
            int pos =str.indexOf(str2);
            if (pos == -1 ){
                break;
            }else {
                count++;
            }
            str=str.substring(pos + str2.length());
        }
        System.out.println("子串出现的次数："+count);
    }

}
