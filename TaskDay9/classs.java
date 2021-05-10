package com.company.TaskDay9;

public class classs {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int k =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
            }
            k++;
        }
        System.out.println(arr[7][8]);
        }
    }


