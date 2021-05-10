package com.company.TaskDay11;

import java.util.Scanner;

public class Fibonacci {
   public static int fib(int n){


      int result = 0;
       for (int i = 1; i < n; i++) {
            result =result  + (result +1);
       }
       return  result;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = scanner.nextInt();
        System.out.println( fib(num));
    }
}
