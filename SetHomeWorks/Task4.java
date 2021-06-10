package com.company.SetHomeWorks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task4 {
    //4. Write a Java program to convert a hash set to a tree set.
    public static <T> TreeSet<T> convertTreeSet(HashSet<T> hashSet){
        TreeSet treeSet = new TreeSet<T>();
        treeSet.addAll(hashSet);
        return  treeSet;
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
        Iterator iterator =hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" '");
        }
        System.out.println();
        TreeSet<Integer> treeSet = convertTreeSet(hashSet);
        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" '");
        }
    }
}
