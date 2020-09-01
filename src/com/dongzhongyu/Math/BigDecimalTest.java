package com.dongzhongyu.Math;
//高精度运算
import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("0.05");
         //BigDecimal number2 = new BigDecimal(0.05);
        BigDecimal number3 = BigDecimal.valueOf(0.01);
        System.out.println(number1);
        System.out.println(number3);
        BigDecimal result1=number1.add(number3);
        BigDecimal result2=number1.subtract(number3);
        BigDecimal result3=number1.multiply(number3);
        BigDecimal result4=number1.divide(number3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
