package com.dongzhongyu.HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap里面保存的是键值对
        HashMap map = new HashMap();
        map.put("dzy", 18);
        map.put("jack", 20);
        //键不能相同，会把之前的覆盖掉
        map.put("jack", 55);
        System.out.println(map.get("dzy"));
        for (Object key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
        for (Object value : map.values()) {
            System.out.println(value);
        }
        //是否包含key和值
        System.out.println(map.containsKey("dzy"));
        System.out.println(map.containsValue(18));
        HashMap<Integer,String> map1 =new HashMap<Integer, String>();

        map1.put(23,"dzy");
        map1.put(123,"ddd");


    }
}
