package com.dongzhongyu.string;// 随机生成4位验证码，由用户输入并验证是否输入正确
// 如果输入错误就生成新的验证码让用户重新输入
// 最多输入5次

import java.util.Scanner;
import java.util.Random;

public class StringPracticeSeven {
    public static void main(String[] args) {
        Random r = new Random();
        int code1 = r.nextInt(10);
        int code2 = r.nextInt(10);
        int code3 = r.nextInt(10);
        int code4 = r.nextInt(10);
        String vfCode = "" + code1 + code2 + code3 + code4;
        System.out.println("验证码是" + vfCode);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入验证码:");
            String str = s.nextLine();
            if (vfCode.equals(str)) {
                System.out.println("输入正确");
                break;
            } else {
                if (5 - i - 1 == 0) {
                    System.out.println("输入错误，您的账号被锁定，请在30分钟后再试");
                } else {
                    System.out.println("输入错误，您还剩下" + (5 - i - 1) + "次机会");
                }
            }
        }

    }
}
