package com.company.MyHashMap;

import com.company.SimpleLinkedList.LinkedList;


public class MyHashMap<K, V> {
    private LinkedList<Entry<K, V>>[] data;
    private int capacity = 16;
    private int count;

    public MyHashMap() {
        data = new LinkedList[capacity];
        count = 0;
    }

    public void put(K key, V value) {
        int index = key.hashCode() % capacity;
        if (data[index] == null) {
            if (checkCountOfLinkedList()) {
                increase();
            }
            data[index] = new LinkedList<>();
            data[index].add(new Entry<>(key, value));
            count++;
            return;
        }
        for (int i = 0; i < data[index].size(); i++) {
            if (data[index].get(i).getKey().equals(key)) {
                data[index].get(i).setValue(value);
                return;
            }
        }
        data[index].add(new Entry<>(key, value));
    }

    public V getValue(K key) {
        int index = key.hashCode() % capacity;
        if (data[index] != null)
            for (int i = 0; i < data[index].size(); i++) {
                if (data[index].get(i).getKey().equals(key)) {
                    return data[index].get(i).getValue();
                }
            }
        return null;
    }

    private boolean checkCountOfLinkedList() {
        if (count >= capacity * 0.7) {
            return true;
        }
        return false;
    }

    public LinkedList<Entry<K, V>>[] getData() {
        return data;
    }

    private void increase() {
        LinkedList<Entry<K, V>>[] temp = data;
        data = new LinkedList[capacity * 2];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=null){
                for (int j = 0; j < temp[i].size(); j++) {
                    put(temp[i].get(j).getKey(),temp[i].get(j).getValue());
                }
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].size(); j++) {
                    stringBuilder.append(data[i].get(j).toString());
                    if ()
                    stringBuilder.append(", ");
                }
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
