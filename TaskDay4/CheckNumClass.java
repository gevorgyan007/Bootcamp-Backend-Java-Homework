package com.company.TaskDay4;

import java.util.Scanner;

public class CheckNumClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gret then 0 number");
        int num = scanner.nextInt();

        if (num!= 1 && num != 4 && num!=2 && num!= 7  ) {
            System.out.println("number can presention");
        } else
        {
            System.out.println("no");
        }
    }
}
