package com.company.TaskDay9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int tr[][]=new int[n][m] ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = scanner.nextInt();
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 =  Integer.MIN_VALUE; int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                    sum+=matrix[i][j];
                }
                if (sum > sum1) {
                    sum1 = sum;
                    index = i;
            }
        }
        System.out.println(sum1 + " - " + index);
    }
}
