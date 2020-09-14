package com.dongzhongyu.Function;

// 随机数
class FunctionDemo05 {

    public FunctionDemo05() {
    }

    public static void main(String[] args) {
        //生成随机数[0,1)
        System.out.println(Math.random());
        //生成随机数[0,5)
        System.out.println(Math.random() * 5);
        //向上取整 0 1 2 3 4
        System.out.println(Math.floor(Math.random() * 5));
        //生成随机数[0,5) 取整
        System.out.println((int) (Math.random() * 5));
        //生成6-8之间的随机数
        System.out.println((int) (Math.random() * 3) + 6);


    }

}
