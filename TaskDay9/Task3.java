package com.company.TaskDay9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];
         int tr[][]=new int[size][size] ;
        int k = 0 ;
        for (int i = 0; i <= size * size; i++) {
           k = scanner.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k;
            }

        }


        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                tr[i][j] = matrix[j][i];
            }
        }


    // Returns true if mat[N][N] is symmetric, else false



        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <  matrix[i].length; j++){
                if (matrix[i][j] != tr[i][j])
                    System.out.println("fals");
                else
                    System.out.println("true");
            }
    }


    }

}
