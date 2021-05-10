package com.company.TaskDay11;

public class Task13 {
    public static int search(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 64, 7, 8, 3, 11, 22};

        System.out.println(search(arr, 11));
    }
}
