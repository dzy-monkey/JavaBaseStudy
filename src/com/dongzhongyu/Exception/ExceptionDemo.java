package com.dongzhongyu.Exception;

import java.util.ArrayList;

public class ExceptionDemo {
    public static void main(String[] args) {
        //java里面把所有的异常，封装成了Exception类，所有的异常类都继承自Exception
        try {
            ArrayList list = new ArrayList();
            list.add(123);
            list.add(2);
            for (int i = 0; i < list.size(); i++) {
                System.out.println((String) list.get(i));
            }
            System.out.println(list.get(0));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("出现异常了，强制类型转换出错");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("后面的程序");
    }
}
