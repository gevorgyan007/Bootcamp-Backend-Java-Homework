package com.company.TaskDay10;

import java.util.Scanner;

public class ExpandPrimeNumberTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                flag = true;
              break;
        }

        if (flag)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
}
