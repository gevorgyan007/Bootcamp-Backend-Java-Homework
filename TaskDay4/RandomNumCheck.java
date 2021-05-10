package com.company.TaskDay4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumCheck {
    public static void main(String[] args) {


        Random random = new Random();

        int randomNum = random.nextInt();

        boolean bool = (randomNum > -1000 && randomNum < 1000);

        if (bool && randomNum % 3 == 0) {
            System.out.println("true");
        } else if (bool && randomNum % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("true");
        }


    }
}
