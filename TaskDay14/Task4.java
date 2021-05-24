package com.company.TaskDay14;

public class Task4 {
    public static int SumOfDigit(int number) {
        if (number <= 0)
            return 0;
        return number % 10 + SumOfDigit(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigit(12345));
    }
}
