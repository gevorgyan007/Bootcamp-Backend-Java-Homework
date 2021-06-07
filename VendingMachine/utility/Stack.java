package com.company.VendingMachine.utility;

public class Stack<T> {
    class Node{
       private T date;
       private  Node next;

       public Node(T date, Node next) {
           this.date = date;
           this.next = next;
       }
   }

   private Node top;
   private int count;

   public int size(){
       return this.count;
   }

    public Stack() {
        top = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void push(T item){
        top = new Node(item,top);
        count++;
    }
    public T pop(){
        T result = top.date;
        top = top.next;
        count--;
        return result;
    }
    public T peek(){
        return top.date;
    }
}
