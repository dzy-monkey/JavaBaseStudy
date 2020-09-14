package com.dongzhongyu.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add(123);
        ll.addFirst(100);
        ll.addLast(300);
        
        //方便插入数据和删除数据
        for (Object o : ll) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
