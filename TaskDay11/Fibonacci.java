package com.company.TaskDay11;

import java.util.Scanner;

public class Fibonacci {

    static int Fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = scanner.nextInt();
        System.out.println(Fib(num));
    }
}
