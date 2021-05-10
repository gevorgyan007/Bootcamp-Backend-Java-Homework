package com.company.TaskDay10;

import java.util.Scanner;

public class DigitHourTask2_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minutes");
        int num = scanner.nextInt();
        int houre = 0, day = 0, min = 0;
        if (num > 0 && num < 59) {
            houre/=num;
            min = num;
            System.out.println(houre+":"+ min);
        } else if (num >= 60) {
            if (num < 1440) {
                houre = num / 60;
                min = num % 60;
                System.out.println(houre+":"+ min);
            } else {
               // day = num / 1440;
                houre = (num - 1440) / 60;
                min = (num - 1440) % 60;
                System.out.println(houre+":"+ min);
            }

        }
    }
}
