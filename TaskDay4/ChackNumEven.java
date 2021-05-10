package com.company.TaskDay4;

import java.util.Scanner;

public class ChackNumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int eventNum = scanner.nextInt();

        if (eventNum %2 == 0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
