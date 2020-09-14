package com.dongzhongyu.VariableParameter;

//可变参数
//1.可变指的是个数可变
//2.在调用方法的时候，如果能够和固定参数的方法匹配，也能够和可变参数的方法匹配，那么将会调用固定参数的方法
//3.一个方法最多只能一个可变参数，可变参数必须放在最后一个参数位置
public class VariableParameterDemo {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 45));
        System.out.println(add(2, 3, 4));
    }

    //我们可以传递任意数量的int类型参数，系统会帮助我们自动把传递的参数组织成一个args数组
    public static int add(int... args) {
        //这里定义了一个可变参数，args当做数组来使用
        int result = args[0];
        for (int i = 1; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }

    public static int add(int num) {
        return 1;
    }

//    public static int add(int b, int... num) {
//        return 2;
//    }
}
