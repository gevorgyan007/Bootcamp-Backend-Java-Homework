package com.company.TaskDay11;

import java.util.Scanner;

public class HasDigitEigthTask10 {
    public static boolean hasEight(int number){
        for (int i = number; i>0 ; number/=10) {
            if (number%10==8)
                return true;
            break;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter charactor");
        int num = scanner.nextInt();
        System.out.println(hasEight(num));
    }
}
