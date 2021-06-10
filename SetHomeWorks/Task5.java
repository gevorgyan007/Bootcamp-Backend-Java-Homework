package com.company.SetHomeWorks;

import java.util.ArrayList;
import java.util.HashSet;

public class Task5 {
    //5. Write a Java program to convert a hash set to a List/ArrayList.
    public static <T> ArrayList<T> convertList(HashSet<T> hashSet){
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.addAll(hashSet);
        return arrayList;
    }
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(45);
        hashSet.add(27);
        hashSet.add(23);
        hashSet.add(87);
        hashSet.add(64);
        hashSet.add(12);
        hashSet.add(17);
        ArrayList<Integer> arrayList =convertList(hashSet);
        System.out.println(arrayList.toString());
    }
}
