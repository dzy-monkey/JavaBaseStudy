package com.dongzhongyu.reflect;

import java.io.File;
import java.lang.reflect.Field;

public class GetFieldByClass {
    public static void main(String[] args) throws Exception {
        User u =new User(100,"dzy","40");
        Class c = Class.forName("com.dongzhongyu.reflect.User");
        //取得所有public字段
//        Field[] fields = c.getFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }
        //通过反射的方式访问成员变量
        //u.age   age.u
//        Field ageField = c.getField("age");

//        System.out.println(ageField.getInt(u));
//        Field[] fields = c.getDeclaredFields();
//        for (Field f:fields){
//            System.out.println(f);
//        }
        Field usernameField=c.getDeclaredField("username");
        usernameField.setAccessible(true);
        System.out.println(usernameField.get(u));
    }
}
