package com.company.SetHomeWorks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    //. Write a Java program to get the number of elements in a hash set.
    public static <T> void getElementSet(Set<T> hashSet){
        Iterator iterator = hashSet.iterator();
       while (iterator.hasNext()) {
           T result = (T) iterator.next();
           System.out.print(result+", ");
       }
    }
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(45);
        hashSet.add(27);
        hashSet.add(23);
        hashSet.add(87);
        hashSet.add(64);
        hashSet.add(12);
        hashSet.add(17);
        getElementSet(hashSet);
    }

}
