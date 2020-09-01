package com.dongzhongyu.function;

// 创建方法用来得到三个整数的和
// 填充数组的方法（把数组按照某个值统一进行复制，相当于Arrays.fill）
public class FunctionDemo01 {
    public static void main(String[] args) {
        int num = sum(1, 2, 3);
        int[] a = {123, 23, 4, 5, 6, 2};

        fill(a, 200);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(num);

        FunctionDemo02 func2 = new FunctionDemo02();
        func2.method1();
        func2.method2();
        func2.sleep();
        func2.work();
        FunctionDemo04 func4=new FunctionDemo04("name",1,100.0f,100000.0f);
        System.out.println(
                new Product(){
                    @Override
                    public float getPrice(){
                        return 3.3f;
                    }
                    @Override
                    public String getName(){
                        return "苹果";
                    }
                }.getPrice()
        );
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void fill(int[] array, int value) {
        if (array == null) {
            System.out.println("array不能为空");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
interface Product{
    float getPrice();
    String getName();
}
