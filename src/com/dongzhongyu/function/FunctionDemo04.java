package com.dongzhongyu.function;

// 使用抽象类
class FunctionDemo04 extends FunctionDemo03 {
    private float bonus;

    public FunctionDemo04() {
    }

    public FunctionDemo04(String name, int id, float pay, float bonus) {
        super(name, id, pay);
        this.bonus = bonus;

    }

    @Override
    public void method01() {
        System.out.println("重写的方法1");

    }

    @Override
    public void sleep() {
        System.out.println("重写的睡觉方法");

    }

}
