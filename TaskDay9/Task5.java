package com.company.TaskDay9;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Random r = new Random();
        int[][] matrix = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = r.nextInt(10);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println(max);
    }
}
