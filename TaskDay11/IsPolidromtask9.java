package com.company.TaskDay11;

import java.util.Scanner;

public class IsPolidromtask9 {
    public static boolean IsPalindrome(String number) {

        int i = 0, j = number.length() - 1;

        for (; i < j; i++, j++) {
            if (number.charAt(i) != number.charAt(j))
                return false;
            break;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        String num = scanner.next();
        System.out.println(IsPalindrome(num));
    }
}
