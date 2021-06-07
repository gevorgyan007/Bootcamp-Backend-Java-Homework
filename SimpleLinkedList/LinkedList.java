package com.company.SimpleLinkedList;

public class LinkedList<T> implements MyList<T> {

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private int count;
    private Node first;
    private Node last;

    @Override
    public T get(int index) {
        checkIndex(index);
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }
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
        last = node;

        count++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            count--;
            return;
        }

        Node current = first;
        for (int i = 0; i < index - 1; i++) {

            current = current.next;
        }
        if (index == count - 2) {
            last = current;
            current.next = null;
            count--;
        }

        current = current.next.next;
        count--;
    }

    @Override
    public boolean remove(T obj) {

        if (first.data.equals(obj)) {
            first = first.next;
            count--;
        }

        Node current = first;
        for (int i = 0; i < count - 1; i++) {
            if (current.next.data.equals(obj)) {
                if (i == count - 2) {
                    last = current;
                    current.next = null;

                } else {
                    current.next = current.next.next;
                }
                count--;
                return true;
            }
            current = current.next;
        }
        return false;
    }


    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T obj) {
        Node current = first;
        for (int i = 0; i < count; i++) {
            if (current.data.equals(obj)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


}
