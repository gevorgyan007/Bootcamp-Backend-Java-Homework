package com.company.TaskDay10;

import java.util.Scanner;

public class GeometricProgressionTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first term GP ");
        double b1 = scanner.nextDouble();
        System.out.println("Please enter  denominator GP ");
        double q = scanner.nextDouble();
        System.out.println("Please enter N-th term GP ");
        int N = scanner.nextInt();
        double[] GeomProgress = new double[N - 1];
        // double term = 1;
        GeomProgress[0] = b1 * q;
        for (int i = 1; i < N - 1; i++) {
            GeomProgress[i] = GeomProgress[i - 1] * q;
        }
        //find GP n-th term
        for (int i = 0; i < N - 1; i++) {
            if (i == (N - 2)){
                System.out.println(GeomProgress[i]);
            break;}
        }
    }
}
