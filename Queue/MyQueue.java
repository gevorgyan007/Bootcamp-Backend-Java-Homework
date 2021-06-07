package com.company.Queue;

public interface MyQueue<T> {
    void addFirst(T item);
    void addLast(T item);
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
}
