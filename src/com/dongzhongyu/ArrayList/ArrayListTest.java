package com.dongzhongyu.ArrayList;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList 要注意在添加数据的时候就确定了值的类型，所以在遍历出来以后无法做强制类型转换
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        //判断是否为空
        al.isEmpty();
        //添加数据
        al.add("小明");
        //同一个集合里面一般存同一种数据类型
        //al.add(1);
        al.add("你好");
        al.add(0, "java");
        //插入多条数据
        ArrayList al2 = new ArrayList();
        al2.add("dzy");
        al2.add("python");
        al.addAll(al2);

        al.remove("你好");
        al.remove(1);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        //判断是否包含某个数据
        System.out.println(al.contains("dzy"));
        Object[] oArray = al.toArray();
        for (int i = 0; i < oArray.length; i++) {
            System.out.print(oArray[i] + " ");
        }
        System.out.println();
        Iterator iterator = al.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        int[] array = new int[]{2, 3, 54, 5, 6, 7, 78, 8, 12};
        int result = 0;
        for (int temp : array) {
            result += temp;
        }
        System.out.println(result);

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        aList.add("one");
        aList.add("Four");
        aList.add("two");
        ArrayList<String> newList = new ArrayList<String>();
        for (String a : aList) {
            if (newList.contains(a) == false) {
                newList.add(a);
            }
        }
        for (String s : newList) {
            System.out.print(s + " ");
        }

    }
}
