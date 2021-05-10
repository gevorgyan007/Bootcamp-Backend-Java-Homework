package com.company.TaskDay9;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i<matrix.length; i++) {
            for (int j = matrix[i].length-1; j >= 0; j--) {
                if ((i + j) == (matrix.length - 1)) {
                    matrix[i][j] = 1;
                }
                else if((i + j) <  (matrix.length - 1)){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = 2;}
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
