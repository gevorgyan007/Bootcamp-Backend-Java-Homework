package com.company.SetHomeWorks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3 {
    //Write a Java program to clone a hash set to another hash set.
    public static <T> HashSet<T>  cloneHashSet(Set<T> hashSet){
        HashSet<T> hashSet1 = new HashSet<>();
        hashSet1.addAll(hashSet);
        return  hashSet1;
    }
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(45);
        hashSet.add(27);
        hashSet.add(23);
        hashSet.add(87);
        hashSet.add(64);
        hashSet.add(12);
        hashSet.add(17);
        HashSet<Integer> hashSet1 = cloneHashSet(hashSet);
        Iterator iterator = hashSet1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" '");
        }
    }
}
