package com.company.TaskDay14;

public class Task5 {
    public static int SumOf7(int number) {
        if (number <= 0)
            return 0;
        if ((number % 10)%7 ==0 && number % 10 != 0) {
            return 1 + SumOf7(number / 10);
        }
        return 0 + SumOf7(number / 10);
    }
    public static void main(String[] args) {
        System.out.println(SumOf7(717070707));
    }
}
