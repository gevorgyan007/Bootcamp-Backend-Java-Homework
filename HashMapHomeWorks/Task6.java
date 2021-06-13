package com.company.HashMapHomeWorks;

import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    //6. Write a Java program to associate the specified value with the specified key in a Tree Map.
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(45,"Black");
        treeMap.put(18,"Green");
        treeMap.put(77,"White");
        treeMap.put(4,"Orange");
        treeMap.put(10,"Red");
        for (Map.Entry<Integer,String> entry:treeMap.entrySet()) {
            System.out.println(entry.getKey() + "=" +entry.getValue());
        }
    }
}
