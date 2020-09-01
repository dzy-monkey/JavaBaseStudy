package com.dongzhongyu.array;

//数据查找，有一个数组，里面存储的是整数，从这个里面查找一个指定整数，找到这个整数所在位置（索引位置）
public class ArrayDemo08 {
    public static void main(String[] args) {
        int[] oldArr = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 0, 0, 23, 4, 0, 0, 2, 3, 0};
        int numberToFind = 0;
        int index = 0;
        boolean findNumber = false;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == numberToFind) {
                index = i;
                System.out.println("你想查找的数字的索引为：" + index);
                findNumber = true;
                break;
            }
        }
        if (findNumber == false) {
            System.out.println("该数组中没有你想要找的数字");
        }
    }
}
