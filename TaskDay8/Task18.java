package com.company.TaskDay8;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        System.out.println("Enter size array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter number array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("_________________________");
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > array.length/2)
            System.out.println(array[index]);
        else
            System.out.println("Non element");
    }
}
