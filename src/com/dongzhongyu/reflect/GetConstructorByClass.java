package com.dongzhongyu.reflect;

import java.lang.reflect.Constructor;

public class GetConstructorByClass {
    public static void main(String[] args) throws Exception {
        //1.得到所有的public构造方法
        Class c1 = Class.forName("com.dongzhongyu.reflect.User");
//        Constructor[] cs = c1.getConstructors();
//        for (Constructor con : cs) {
//            System.out.println(con);
//        }
        //忽略访问权限获取所有的构造方法
//        Constructor[] cs = c1.getDeclaredConstructors();
//        for (Constructor con : cs){
//            System.out.println(con);
//        }
        //2.得到指定的构造方法
//        Constructor con = c1.getConstructor();
        //3.使用反射调用构造方法
//        Object o1 = con.newInstance();
//        User user = (User) o1;
//        user.show();
        //忽略访问权限
        Constructor con =c1.getDeclaredConstructor(int.class);
        //此段代码忽略访问权限
        con.setAccessible(true);
        Object o1=con.newInstance(100);
        User user=(User)o1;
        user.show();
    }
}
