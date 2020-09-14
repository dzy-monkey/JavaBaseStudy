package com.dongzhongyu.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //线程是否安全
        Vector v = new Vector();
        v.add("1");
        v.add("2");
        for (Object o : v) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println(v.get(1));
        v.remove(1);
        for (Object o : v) {
            System.out.print(o + " ");
        }
    }

}
