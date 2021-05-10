package com.company.TaskDay4;

import com.company.TaskDay3.RangeFindClass;

import java.util.Random;

public class RandomGenNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt();


        if (randomNum > 2 && randomNum < 7) {

            System.out.println(randomNum);
        } else if (randomNum > 7) {
            randomNum = randomNum - (randomNum - 7);
            System.out.println(randomNum);
        } else if (randomNum < 2) {
            randomNum = randomNum - (randomNum - 2);
            System.out.println(randomNum);
        }




    }
}
