package com.company.TaskDay16_OOP;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Arithmetic arithmetic = new Arithmetic(10,14,2,4,19,55,27,100);
        arithmetic.options();
        int sort=scanner.nextInt();
        switch (sort){
            case 1:
                System.out.println(arithmetic.binarySearch(0,arithmetic.array.length,19));
                break;
            case 2:
                break;
            case 3:
               int[] arr1 = arithmetic.bubbleSort();
                arithmetic.PrintArray(arr1);

                break;
            case 4:
                System.out.println(arithmetic.min());
                break;
            case 5:
                System.out.println(arithmetic.max());
                break;
            case 6:
                System.out.println(arithmetic.average());
                break;
            case 7:
                if (arithmetic.checkArithmeticProgression()){
                    System.out.println("array is ArithmeticProgression");
                }else{
                    System.out.println("array is NOT ArithmeticProgression");
                }
                break;
            default:
                System.out.println("You enter wrong number");
        }
    }
}
