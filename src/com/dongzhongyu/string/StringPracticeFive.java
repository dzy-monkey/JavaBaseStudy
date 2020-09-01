package com.dongzhongyu.string;// 接收用户输入的一个字符串，判断这个字符串是否对称

public class StringPracticeFive {
    public static void main(String[] args) {
        String str = "123456789";
        boolean isDui = true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isDui = false;
                break;
            }
        }
        System.out.println("是对称字符串吗："+isDui);
    }
}
