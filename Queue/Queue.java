package com.company.Queue;


import java.util.LinkedList;

public class Queue<T> implements MyQueue<T> {
    LinkedList<T> data = new LinkedList<>();
    @Override
    public void addFirst(T item) {
        data.addFirst(item);
    }

    @Override
    public void addLast(T item) {
        data.addLast(item);
    }

    @Override
    public void removeFirst() {
        data.removeFirst();
    }

    @Override
    public void removeLast() {
        data.removeLast();
    }

    @Override
    public T getFirst() {
       return data.getFirst();
    }

    @Override
    public T getLast() {
      return data.getLast();
    }
}
