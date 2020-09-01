package com.dongzhongyu.array;

//复制数组，将数组里面的数据全部复制到另一个数组里面
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] scoreArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            newArray[i] = scoreArray[i];
        }
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
