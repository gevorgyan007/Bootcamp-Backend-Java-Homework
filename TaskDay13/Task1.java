package com.company.TaskDay13;

import java.util.Scanner;

public class Task1 {
    public static  int  MeasureLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(MeasureLength(str));

    }
}
