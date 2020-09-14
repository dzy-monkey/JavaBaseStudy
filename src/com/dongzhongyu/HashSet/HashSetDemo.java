package com.dongzhongyu.HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //ArrayList LinkedList Vector 可以添加重复数据，有序的（按照添加顺序排列）
        HashSet set = new HashSet();
        set.add("dzy");
        set.add(123123);

        //HashSet 不重复的，无序的  哈希值
        for (Object o : set) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
