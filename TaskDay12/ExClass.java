package com.company.TaskDay12;

public class ExClass {

    public  static  int Fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
       return  Fib(n-1) + Fib(n-2);
    }
    public  static  int Recursia(int n){
        if(n == 0)
            return  1;
        return 2 * Recursia(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Recursia(5));
        System.out.println(Fib(5));
    }
}
