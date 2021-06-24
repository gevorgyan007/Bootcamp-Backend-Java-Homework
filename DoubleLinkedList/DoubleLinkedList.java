package com.company.DoubleLinkedList;

import com.company.SimpleLinkedList.MyList;

public class DoubleLinkedList<T> implements MyList<T> {
    private Node first;
    private Node last;
    private int count;

    class Node {
        Node next;
        Node prev;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void add(T obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            count++;
            return;
        }
        last.next = node;
        last.next.prev = last;
        last = node;
        last.next = null;
        count++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node current = first;
        if (index == 0) {
            current = current.next;
            current.prev = null;
            count--;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == count-1){
            last = current;
            last.next=null;
        }
        current.next = current.next.next;
        current.next.prev = current;//current.next.prev = current;true
        count--;
    }

    @Override
    public boolean remove(T obj) {
       if (first.data.equals(obj)){
           first=first.next;
           first.prev = null;
           count--;
       }
       Node current = first;
        for (int i = 0; i < count; i++) {
            if (current.next.data.equals(obj)){
               if (i == count-2){
                   last=current;
                   last.next = null;

               }else {
                   current.next=current.next.next;
                   current.next.prev=current;

               }
               count--;
               return true;
            }
            current = current.next;
        }
        return  false;
    }

    @Override
    public int size() {
       return count;
    }

    @Override
    public boolean contains(T obj) {
        Node current = first;
        for (int i = 0; i < count; i++) {
            if (current.data.equals(obj)){
                return true;
            }
            current =current.next;

        }
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
    }
}
