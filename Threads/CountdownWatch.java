package com.company.Threads;

import java.util.Scanner;

public class CountdownWatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input minutes ");
        int min = scan.nextInt();
        System.out.println("input second ");
        int second = scan.nextInt();

        while (min >=0){
            while (second>=0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(min +":"+second);
                second--;
            }
            second = 60;
            min--;
        }
    }
}
