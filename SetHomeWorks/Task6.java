package com.company.SetHomeWorks;

import java.util.HashSet;
import java.util.Iterator;

public class Task6 {
    //6. Write a Java program to compare two hash set.
    public static <T extends Comparable<T>> boolean compareTwoHashSet(HashSet<T> hashSet1, HashSet<T> hashSet2) {
        Iterator<T> iterator1 = hashSet1.iterator();
        Iterator<T> iterator2 = hashSet2.iterator();
        boolean flag = false;
        while (iterator1.hasNext() && iterator2.hasNext()) {
            if (iterator1.next().compareTo(iterator2.next()) !=0){
                return false;
            }
        }
        return true;
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
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(45);
        hashSet1.add(27);
        hashSet1.add(23);
        hashSet1.add(87);
        hashSet1.add(64);
        hashSet1.add(12);
        hashSet1.add(17);

        System.out.println(compareTwoHashSet(hashSet,hashSet1));
    }
}
