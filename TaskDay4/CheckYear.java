package com.company.TaskDay4;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gret then 0 number");

        int inputYear =scanner.nextInt();



        if( inputYear % 4 == 0 && inputYear %100 ==0 && inputYear % 400 ==0)
        {
            System.out.println(" is a leap year.");
        }

        else if(inputYear % 4 != 0 ) {

            System.out.println(" The year is not a leap year ");
        }
        else if(inputYear %100 !=0  ) {

            System.out.println(" The year is a leap year  ");
        }
        else if(inputYear % 400 !=0 ) {

            System.out.println(" The year is not a leap year  ");
        }

    }
}
