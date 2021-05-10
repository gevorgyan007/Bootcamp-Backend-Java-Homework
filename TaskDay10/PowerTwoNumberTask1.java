package com.company.TaskDay10;

import java.util.Scanner;

public class PowerTwoNumberTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num");
        int num = scanner.nextInt();
        int result =1;
        for (int i = 1; i <= num; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
