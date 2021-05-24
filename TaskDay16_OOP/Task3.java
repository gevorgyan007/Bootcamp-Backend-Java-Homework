package com.company.TaskDay16_OOP;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();
        university.admission();
        int num = scanner.nextInt();
        System.out.println("please write your age");
        int age = scanner.nextInt();

        if (university.checkAge(age))
        {
            switch (num){
                case 1:
                case 2:
                case 3:
                case 4:
                    university.register();
                    System.out.println("You register faculty");
                    break;
            }
        }else{
            System.out.println("Sorry your age invalid");
        }

        university.printInfo();

    }
}
