package com.company.TaskDay10;

import java.util.Scanner;

public class CheckNumberprimeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minutes");
        int num = scanner.nextInt();
        Boolean bool = false;
        for (int i = num / 2; i > 1; i--) {
            if (num % i == 0)
                bool = false;
            else
                bool = true;
}

        if (bool)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
