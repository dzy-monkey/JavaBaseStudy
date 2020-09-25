package com.dongzhongyu.reflect;

import java.lang.reflect.Method;

public class GetMethodByClass {
    public static void main(String[] args) throws Exception {
        User u = new User(100, "dzy", "123");
        Class c = Class.forName("com.dongzhongyu.reflect.User");
//        Method[] methods = c.getMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }
        //u.show  show.u
//        Method m = c.getMethod("Study", String.class);
//        m.invoke(u, "数学");
//        System.out.println(o);
        //只得到自身的所有方法，不会获取到父类的方法
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        //绕过私有权限
        Method studyMethod = c.getDeclaredMethod("Study", int.class, String.class);
        studyMethod.setAccessible(true);
        studyMethod.invoke(u,1,"dzy");

    }
}
