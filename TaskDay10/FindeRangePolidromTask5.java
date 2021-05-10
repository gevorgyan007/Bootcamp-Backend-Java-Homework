package com.company.TaskDay10;

import java.util.Scanner;

public class FindeRangePolidromTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num 1 ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter num 2 ");
        int num2 = scanner.nextInt();
        for (int i = num1; i < num2; i++) {
            if (i % 10 == i / 1000 && (i / 10) % 10 == (i / 100) % 10)
                System.out.println(i);
        }
    }
}

