package com.company.TaskDay12;

public class OverloadClass {


   //add(int, float)
   //add(int , float)
   //add(float, int)
   public static void add(int a, int b){
       System.out.println(a+b);
   }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
            add(5,5.5f);
    }
}
