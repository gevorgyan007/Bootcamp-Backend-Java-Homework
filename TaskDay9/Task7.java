package com.company.TaskDay9;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Random r = new Random();
        int[][] matrix1 = new int[n][m];
        int[][]  matrix2= new int[n][m];
        int[][]  multMatrix= new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix1[i][j] = r.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix2[i][j] = r.nextInt(10);
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_______________");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_______________");
        int el = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                multMatrix[i][j]=0;
                for (int k = 0; k <  matrix1.length; k++) {
                    multMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < multMatrix.length; i++) {
            for (int j = 0; j < multMatrix[i].length; j++) {
                System.out.print(multMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
