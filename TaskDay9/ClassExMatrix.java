package com.company.TaskDay9;

import java.util.Random;

public class ClassExMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[3][3];

        int min = 55,max =105;
        int diff = max - min;




        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(diff +1) + min;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum is matrix:: " + sum);


        int sum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j < i)
                sum1 += matrix[i][j];
            }
        }
        System.out.println("Sum is matrix:: " + sum1);
        // int[] tempArr = new int[5*5];
       // int count =0;
       // for (int i = 0; i < matrix.length; i++) {
       //     for (int j = 0; j <  matrix[i].length; j++) {
       //         tempArr[count] = matrix[i][j] ;
       //         count++;
       //     }
       // }


       //for (int i = 0; i < matrix.length; i++) {
       //    for (int j = 0; j < matrix[i].length; j++) {
       //        System.out.print(matrix[i][j] + " ");
       //    }
       //    System.out.println();
       //}


    }
}
