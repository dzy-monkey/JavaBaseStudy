package com.dongzhongyu.array;

//把数组里面为0的元素剔除，然后给予一个新的数组
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] oldArr = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 0, 0, 23, 4, 0, 0, 2, 3, 0};
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int number = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                newArr[number] = oldArr[i];
                number++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
