package com.company.TaskDay12;

import java.util.Scanner;

public class ClassEx {
    public int Average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum /= arr.length;
        return sum;
    }
    //Average
    public int Average(int[][] arr, int n, int m) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        sum /= (n * m);
        return sum;
    }



    public static void main(String[] args) {


    }
}
