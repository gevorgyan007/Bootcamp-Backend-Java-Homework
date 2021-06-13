package com.company.HashMapHomeWorks;

import java.util.HashMap;

public class Task2 {
    // Write a Java program to remove all of the mappings from a map.
    public  static <K,V> void removeAllMap(HashMap<K,V> hashMap) {
        hashMap.clear();
        //et<Map.Entry<K, V>> set = hashMap.entrySet();
        //terator<Map.Entry<K, V>> iterator = set.iterator();

        //hile (iterator.hasNext()) {
        //   Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
        //     hashMap.remove(entry.getKey());
        //}
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);
        hashMap.put(4,40);
        hashMap.put(5,50);
        hashMap.put(6,60);
        System.out.println(hashMap);
        removeAllMap(hashMap);
        System.out.println(hashMap);
    }
}
