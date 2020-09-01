package com.dongzhongyu.function;

//接口测试
public class FunctionDemo02 implements A,B{

    @Override
    public void method1() {
        System.out.println(1);
    }

    @Override
    public void method2() {
        System.out.println(2);
    }

    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}

interface A{
    void method1();
    void method2();
}
interface B{
    void work();
    void sleep();
}