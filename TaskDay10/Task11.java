package com.company.TaskDay10;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row");
        int n = scanner.nextInt();
        System.out.println("Please enter col");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int count = 0;
        int lastCol = 0, lastRow = 0;
        while (lastCol <= n && lastRow <= m) {
            for (int i = 0; i < lastRow; i++) {
                for (int j = 0; j < lastCol; j++) {
                    if ((i + j) == (lastRow - 1)) {
                        matrix[i][j] = count;
                        count++;
                    }
                }
            }
            lastCol++;
            lastRow++;
        }
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0)
                        matrix[i][j] = matrix[i][j - 1] + 4;
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {

                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0)
                        matrix[i][j] = matrix[i][j - 1] + 5;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
