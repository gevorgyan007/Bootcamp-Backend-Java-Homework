package com.company.HashMapHomeWorks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Task10 {
    // Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    public static <K extends Comparable, V> List<K> getKeyGreaterGivenNum(HashMap<K, V> hashMap, K givenKey){
        List<K> list = new ArrayList<>();
        for ( K key :hashMap.keySet()) {
            if (key.compareTo(givenKey) > 0 ){
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(45, "Black");
        hashMap.put(18, "Green");
        hashMap.put(77, "White");
        hashMap.put(4, "Orange");
        hashMap.put(10, "Red");

        System.out.println(getKeyGreaterGivenNum(hashMap, 18));
    }
}
