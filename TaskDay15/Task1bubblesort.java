package com.company.TaskDay15;

import java.util.Random;
import java.util.Scanner;

public class Task1bubblesort {
    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(20);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] arr = bubbleSort(array, size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
