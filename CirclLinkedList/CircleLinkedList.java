package com.company.CirclLinkedList;

import com.company.SimpleLinkedList.MyList;

public class CircleLinkedList<T> implements MyList<T> {
    class Node{
        T data;
        Node prev;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }
    private Node first;
    private Node last;
    private int count;

    private void checkIndex(int index){
        if (index<0){
            throw new IndexOutOfBoundsException("index < 0");
        }else if (index>=count){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(T obj) {
        Node node = new Node(obj);
        if (first == null){
            first = node;
            last = node;
            last.next = first;
            first.prev =last;
            count++;
            return;
        }
        last.next = node;
        last.next.prev = last;
        last = node;
        last.next = first;
        first.prev = last;
        count++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node current = first;
        if (index ==0){
            first.next.prev=last;
            last.next =first.next;
        }
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        current.next.next.prev =current;
        count--;
    }

    @Override
    public boolean remove(T obj) {return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }
}
