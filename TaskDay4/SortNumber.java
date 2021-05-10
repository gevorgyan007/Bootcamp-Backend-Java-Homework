package com.company.TaskDay4;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();



        if (num3 > num1 && num3 > num2 && num2 > num1) {

            System.out.println(num1 );
            System.out.println(num2 );
            System.out.println(num3 );
        }else if(num1 > num2 && num1 < num3)
        {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }else if(num3 < num1 && num2<num3)
        {
            System.out.println(num2) ;
            System.out.println(num3);
            System.out.println(num1);
        }
    }
}
