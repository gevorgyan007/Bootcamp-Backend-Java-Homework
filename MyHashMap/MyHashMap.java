package com.company.MyHashMap;

import com.company.SimpleLinkedList.LinkedList;

import java.util.Arrays;


public class MyHashMap<K,V> {
    private LinkedList<Entry<K,V>>[] data;
    private  int capacity ;
    private int count;

    public MyHashMap() {
        data = new LinkedList[capacity];
        capacity = 16;
        count=0;
    }

    public void  put(K key,V value){
        int index = key.hashCode() % capacity;
        if (data[index]== null){
            data[index] = new LinkedList<>();
            data[index].add(new Entry<>(key,value));
            count++;
            return;
        }

        for (int i = 0; i < data[index].size(); i++) {
            if (data[index].get(i).getKey().equals(key)  ){
                data[index].get(i).setValue(value);
                return;
            }
        }
        data[index].add(new Entry<>(key,value));
        count++;
    }

    public LinkedList<Entry<K, V>>[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "data=" + Arrays.toString(data) +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }
}
