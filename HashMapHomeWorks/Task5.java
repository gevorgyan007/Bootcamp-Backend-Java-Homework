package com.company.HashMapHomeWorks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task5 {
    //5. Write a Java program to get a collection view of the values contained in this map.
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);
        hashMap.put(4, 40);
        hashMap.put(5, 50);
        hashMap.put(6, 60);
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = (Map.Entry<Integer, Integer>) iterator.next();
            System.out.print(next.getValue() + " ");
        }
    }
}
