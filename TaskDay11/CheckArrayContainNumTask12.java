package com.company.TaskDay11;

public class CheckArrayContainNumTask12 {
    public static boolean contains(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 64, 7, 8, 3, 11, 22};

        System.out.println(contains(arr, 25));
    }
}
