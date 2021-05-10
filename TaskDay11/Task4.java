package com.company.TaskDay11;

import java.util.Scanner;

public class Task4 {
    static boolean election(boolean x, boolean y, boolean z){
        int countTrue =0;
        int countFalse =0;
        if (x == true)
            countTrue++;
        if (y == true)
            countTrue++;
        if (z == true)
            countTrue++;
        if (x == false)
            countFalse++;
        if (y == false)
            countFalse++;
        if (z == false)
            countFalse++;

        if(countTrue>countFalse)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        boolean result =  election(a,b,c);
        System.out.println(result);
    }
}
