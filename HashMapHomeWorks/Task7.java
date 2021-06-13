package com.company.HashMapHomeWorks;

import java.util.Map;
import java.util.TreeMap;

public class Task7 {
    //Write a Java program to copy a Tree Map content to another Tree Map.
    public static <K,V> TreeMap<K,V> copyOfTreemap(TreeMap<K,V> treeMap){
        TreeMap<K,V> treeMap1 = new TreeMap<>();
        //Map.Entry<K,V> entry = (Map.Entry<K, V>) treeMap.entrySet();
        for (Map.Entry<K,V> entry :treeMap.entrySet()){
            treeMap1.put(entry.getKey(),entry.getValue());
        }
        return  treeMap1;
    }
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(45,"Black");
        treeMap.put(18,"Green");
        treeMap.put(77,"White");
        treeMap.put(4,"Orange");
        treeMap.put(10,"Red");

        System.out.print(copyOfTreemap(treeMap));

    }
}
