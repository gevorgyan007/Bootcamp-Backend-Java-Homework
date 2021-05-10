package com.company.TaskDay11;

import java.util.Scanner;

public class FactorialTask7 {
  public  static   int factorial(int a){
      int fac = 1;
      for (int i = a; i>0; i--) {
          fac*=i;
      }
      return  fac;
  }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = scanner.nextInt();
        System.out.println( factorial(num));
    }
}
