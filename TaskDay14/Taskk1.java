package com.company.TaskDay14;

import java.util.Scanner;

public class Taskk1 {
    public static int SumOfArray(int[] array, int n) {

        if (n <= 0)
            return 0;
        return (array[n - 1] + SumOfArray(array, n - 1));
    }

    public static int Factorial(int n) {
        if (n == 1)
            return 1;
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = SumOfArray(arr, arr.length);
        System.out.println(sum);
        System.out.println(Factorial(5));
    }
}
