package com.company.Stack;

import java.util.ArrayList;

public class Stack<T>  {
    ArrayList<T> arrayList = new ArrayList<>();

    public void push(T item) {
        arrayList.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        T result = arrayList.get(arrayList.size() - 1);
        arrayList.remove(result);
        return result;
    }

    public boolean isEmpty() {
        return arrayList.size() == 0;
    }
}
