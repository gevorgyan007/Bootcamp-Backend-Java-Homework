package com.company.HashMapHomeWorks;

import java.util.*;

public class Task8 {
    // Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
    public static <K, V> void firstLastLowestKey(HashMap<K, V> hashMap) {
        TreeMap<K,V> treeMap1 = new TreeMap<>();
        for (Map.Entry<K,V> entry :hashMap.entrySet()){
            treeMap1.put(entry.getKey(),entry.getValue());
        }
        ArrayList<K> arrayList = new ArrayList<>();
        for (K entry : treeMap1.keySet()) {
            arrayList.add(entry);
        }
        System.out.println("first (lowest) key -" +arrayList.get(0)+ " last (highest) key-" + arrayList.get(arrayList.size()-1));
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(45, "Black");
        hashMap.put(18, "Green");
        hashMap.put(77, "White");
        hashMap.put(4, "Orange");
        hashMap.put(10, "Red");
        System.out.println(hashMap);
        firstLastLowestKey(hashMap);

    }
}
