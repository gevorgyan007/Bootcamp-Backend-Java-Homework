package com.company.HashMapHomeWorks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Task4 {
    //4. Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);
        hashMap.put(4,40);
        hashMap.put(5,50);
        hashMap.put(6,60);
        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();;
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(keySet);
    }
}
