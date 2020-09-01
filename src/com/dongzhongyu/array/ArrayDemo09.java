package com.dongzhongyu.array;

public class ArrayDemo09 {
    public static void main(String[] args) {
        //scoreArray是一个长度为10的数组，这个数组里面包含了50个元素，其中每个元素又是一个长度为5的数
        int[][] scoreArray = new int[10][50];
        scoreArray[3][6] = 80;
        //第二种初始化形式
        int[][] arr = {{1, 2, 3, 4, 5, 6}, {2, 3, 4, 5, 6, 7}, {3, 4, 5, 6, 7, 8}};
        //第三种初始化形式
        int[][] a = {{2, 5}, {3, 1, 2}, {2}};
        //第四种初始化形式，此时访问具体的数值会输出Null
        int[][] b = new int[10][];
        b[0]=new int[]{12,3,4,5,6};
        System.out.println(b[0][1]);

        //遍历二维数组
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
