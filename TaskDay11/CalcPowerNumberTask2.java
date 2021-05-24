package com.company.TaskDay11;

import java.util.Scanner;

public class CalcPowerNumberTask2 {
    public static double CalcPow(double a, int n) {
        double pow = 1;
        for (int i = 0; i < n; i++) {
            pow *= a;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        double num = scanner.nextDouble();
        System.out.println("Please Enter pow ");
        int pow = scanner.nextInt();
        double result = CalcPow(num, pow);
        String s = "";

        System.out.println(num + "^" + pow + " = " + result);
    }
}
