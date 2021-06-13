package com.company.HashMapHomeWorks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static <K,V> HashMap<K,V> copyTwoHashmap(HashMap<K,V> hashMap){
        HashMap<K,V> hashMap1 = new HashMap<>();
        Set<Map.Entry<K, V>> entries = hashMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<K,V> me = (Map.Entry)iterator.next();
            hashMap1.put(me.getKey(),me.getValue());
        }
        return hashMap1;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);
        hashMap.put(4,40);
        hashMap.put(5,50);
        hashMap.put(6,60);

        System.out.println(copyTwoHashmap(hashMap));
    }
}
