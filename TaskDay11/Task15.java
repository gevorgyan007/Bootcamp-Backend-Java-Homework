package com.company.TaskDay11;

import java.util.Scanner;

public class Task15 {
    public static void Student() {
        System.out.println("Enter the number of students: ");
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        int[] student = new int[numStudents];
        int k = 0;
        while (numStudents > 0) {
            System.out.println("Enter the grade for student :: ");
            int num = scanner.nextInt();
            student[k++] = num;
            numStudents--;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double average = 0;
        for (int i = 0; i < student.length; i++) {
            average += student[i];
            if (min > student[i])
                min = student[i];
            if (max < student[i])
                max = student[i];
        }
        average/=student.length;
        System.out.println("The average is: " + String.format("%.2f",average));
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is: " + max);
        //String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
    }

    public static void main(String[] args) {
        Student();
    }
}
