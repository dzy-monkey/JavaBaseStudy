package Array;

import java.util.Arrays;

//引用类型要养成创建就给初始值的习惯
public class ArrayDemo01 {
    public static void main(String[] args) {
        //两种初始化方式
        //int[] scoreArray = new int[50];
        int[] scoreArray = {10, 12, 30, 30, 50, 60, 450};
        System.out.println(scoreArray.length);
        System.out.println(scoreArray[0]);
        scoreArray[0] = 200;
        System.out.println(scoreArray[0]);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] b = new int[10];
        int[] b = null;
//        System.out.println(a[0] + " " + b[0]);
//        b[0] = a[0];
//        System.out.println(a[0] + " " + b[0]);
//        b[0] = 200;
//        System.out.println(a[0] + " " + b[0]);
        b = a;
        b[0] = 200;
        System.out.println(a[0] + " " + b[0]);
        Arrays.fill(b,100);
        System.out.println(a[0] + " " + b[0]);
        System.out.println(a[1] + " " + b[1]);
        System.out.println(a[2] + " " + b[2]);
        System.out.println(a[3] + " " + b[3]);
    }
}
