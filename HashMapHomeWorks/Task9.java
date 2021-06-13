package com.company.HashMapHomeWorks;

import java.util.*;

public class Task9 {
    //Write a Java program to get a reverse order view of the keys contained in a given map.
    public static <K extends Comparable, V> List<K> reversSortHashMapKeys(HashMap<K, V> hashMap) {
        TreeMap<K,V> treeMap1 = new TreeMap<>();
       List<K> list = new ArrayList<>();
        for (K keys :hashMap.keySet()){
            list.add(keys);
        }
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(45, "Black");
        hashMap.put(18, "Green");
        hashMap.put(77, "White");
        hashMap.put(4, "Orange");
        hashMap.put(10, "Red");
        System.out.println(reversSortHashMapKeys(hashMap));
    }
}
