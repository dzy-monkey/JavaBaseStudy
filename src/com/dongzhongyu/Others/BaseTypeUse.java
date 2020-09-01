package com.dongzhongyu.Others;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BaseTypeUse {
    public static void main(String[] args) {
        // 用于创建大的整数
        BigInteger bi1=new BigInteger("10000000000000000000000");
        // 用于创建大的小数
        BigDecimal bd1=new BigDecimal("100000000000000000000000000000000.22054");
    }
}
