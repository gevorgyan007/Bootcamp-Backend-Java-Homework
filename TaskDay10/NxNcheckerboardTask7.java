package com.company.TaskDay10;

import java.util.Scanner;

public class NxNcheckerboardTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num");
        int N = scanner.nextInt();
        String[][] checkerboard = new String[N][N];
        // first solve
        //for (int i = 0; i < N; i++)
        //{
        //    for (int j = 0; j < N; j++)
        //    {
        //        if (i%2 ==0 && j%2!=0)
        //            checkerboard[i][j] = "X";
        //        else if(i%2 == 0  && j%2==0)
        //            checkerboard[i][j] = "O";
        //        else if(i%2!= 0  && j%2==0)
        //            checkerboard[i][j] = "X";
        //        else if(i%2!= 0  && j%2!=0)
        //            checkerboard[i][j] = "O";;
        //    }
        //}
        //2 solve
        String O = "O", X = "X";
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < N; j++) {
                    if (j % 2 == 0)
                        checkerboard[i][j] = O;
                    else
                        checkerboard[i][j] = X;
                }
            if (i % 2 != 0)
                for (int j = N - 1; j >= 0; j--) {
                    if (j % 2 == 0)
                        checkerboard[i][j] = X;
                    else
                        checkerboard[i][j] = O;
                }
        }
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard[i].length; j++) {
                System.out.print(checkerboard[i][j]);
            }
            System.out.println();
        }
    }
}
