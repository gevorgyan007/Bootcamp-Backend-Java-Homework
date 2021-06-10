package com.company.MyHashMap;

public class Main {
    public static void main(String[] args) {

        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put(1,10);
        myHashMap.put(2,20);
        myHashMap.put(3,30);
        myHashMap.put(4,40);
        for (int i = 0; i < myHashMap.getData().length; i++) {
            System.out.println(myHashMap.getData());
        }
    }
}
