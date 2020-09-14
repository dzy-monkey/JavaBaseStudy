package com.dongzhongyu.Function;

// 抽象类
abstract class FunctionDemo03 {
    private String name;
    private int id;
    private float pay;

    // 抽象类中是可以提供get函数的
    public String nameGet(){
        return this.name;
    }

    FunctionDemo03(){}
    public FunctionDemo03(String name, int id, float pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    public abstract void method01();

    public abstract void sleep();
}
