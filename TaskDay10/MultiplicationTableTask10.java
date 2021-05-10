package com.company.TaskDay10;

import java.util.Scanner;

public class MultiplicationTableTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row");
        int n = scanner.nextInt();
        System.out.println("Please enter col");
        int m = scanner.nextInt();

        int[][] A = new int[n][m];
        int count = 1;
        for (int i = 1; i < n; i++) {
            A[i][1] = count;
            count++;
        }
        count = 2;
        for (int i = 2; i < m; i++) {
            A[1][i] = count;
            count++;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < m; j++) {
                A[i][j] = i * j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
