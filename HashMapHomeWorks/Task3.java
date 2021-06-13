package com.company.HashMapHomeWorks;

import java.util.HashMap;

public class Task3 {
    //. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static <K,V> boolean containKeyValue(HashMap<K,V> hashMap,K key,V value){
       return (hashMap.containsKey(key) && hashMap.containsValue(value));
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);
        hashMap.put(4,40);
        hashMap.put(5,50);
        hashMap.put(6,60);

        System.out.println(containKeyValue(hashMap,2,40));
    }
}
