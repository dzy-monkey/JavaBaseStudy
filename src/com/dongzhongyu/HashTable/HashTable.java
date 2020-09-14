package com.dongzhongyu.HashTable;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        //线程安全，但是性能比较低
        Hashtable map = new Hashtable();
        map.put("dzy", 12);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("dzy"));
        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
    }
}
