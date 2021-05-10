package com.company.TaskDay9;

import java.util.Random;
import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        int k=0,l=0,i;
        int lastRow = n-1, lastCol = m-1;
        while (lastRow > k && lastCol > l)
        {
            // 1 row
            for ( i = l; i <= lastCol; i++) {
                matrix[k][i] = 1;
            }
            k++;
            //last col
            for ( i = k; i <= lastRow; i++) {
                matrix[i][lastCol] = 1;

            }
            lastCol--;

            if(k<= lastRow)
                for ( i = lastCol; i >= l ; i--) {
                    matrix[lastRow][i] = 0;

                }
            lastRow--;

                if(l<=lastCol)
                    for ( i = lastRow; i >=k ; i--) {
                        matrix[i][l] = 1;
                    }
                l++;
        }


        System.out.println("_______________");
        for (int j = 0; j < matrix.length; l++) {

            for (int p = 0; p < matrix[j].length; p++) {
                System.out.print(matrix[j][p] + " ");
            }

            System.out.println();
        }

    }
}
