package com.company.MyHashMap;

public class Main {
    public static void main(String[] args) {

        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put(1,10);
        myHashMap.put(2,20);
        myHashMap.put(3,30);
        myHashMap.put(4,40);
        myHashMap.put(5,40);
        myHashMap.put(6,40);
        myHashMap.put(7,40);

        System.out.println(myHashMap);


    }
}
