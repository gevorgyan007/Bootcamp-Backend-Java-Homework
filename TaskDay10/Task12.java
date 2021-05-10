package com.company.TaskDay10;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row");
        int n = scanner.nextInt();
        System.out.println("Please enter col");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i%2==0)
            {
                for (int j = 0; j < m; j++)
                {
                      matrix[i][j] = sum;
                      sum++;
                }
            }
            if (i%2!=0){
            for (int j = m-1; j >=0; j--) {
                matrix[i][j] =  sum;
                sum++;
            }}
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
