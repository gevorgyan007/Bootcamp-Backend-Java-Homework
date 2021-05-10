package com.company.TaskDay4;

import java.util.Scanner;

public class VotePersonAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int personAge = scanner.nextInt();

        if (personAge > 0 && personAge < 18) {
            System.out.println("you cant vote");
        } else if(personAge  >= 18)
        {
            System.out.println("you can vote");
        } else
        {
            System.out.println("you write wrong number");
        }
    }
}
