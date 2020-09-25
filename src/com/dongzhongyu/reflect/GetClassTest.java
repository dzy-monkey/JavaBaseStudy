package com.dongzhongyu.reflect;

public class GetClassTest {
    public static void main(String[] args) {
        //获取Class对象
        //1.通过对象
        User user1 = new User(100, "dzy", "123");
        User user2 = new User(200, "dik", "321");
        Class c1 = user1.getClass();
        System.out.println(c1);

        Class c2 = user2.getClass();
        System.out.println(c2);
        System.out.println(c1 == c2);

        GetClassTest o = new GetClassTest();
        Class c3 = o.getClass();
        System.out.println(c3 == c2);

        //2.通过类
        Class c4 = User.class;
        System.out.println(c4 == c1);

        //3.通过Class.forName | 类的路径
        try {
            Class c5 = Class.forName("com.dongzhongyu.reflect.User");
            System.out.println(c5 == c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
