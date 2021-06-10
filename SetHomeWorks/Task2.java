package com.company.SetHomeWorks;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    //2. Write a Java program to test a hash set is empty or not.
    public static <T> boolean isEmptyHashSet(Set<T> hashSet){
        return hashSet.isEmpty();
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
        System.out.println(isEmptyHashSet(hashSet));
    }
}
