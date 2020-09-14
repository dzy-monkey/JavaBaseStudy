package com.dongzhongyu.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set =new TreeSet();
        set.add("dzuy");
        set.add(123);
        for (Object o : set){
            System.out.print(o+ " ");
        }
        System.out.println();
    }
}
