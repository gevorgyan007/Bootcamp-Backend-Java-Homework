package com.company.TaskDay11;


public class ClassEx {

    public static void ReversMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                array[i] = -array[i];
            else if (array[i] < 0)
                array[i] = -array[i];
        }
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,-3,4};
        ReversMethod(arr);
        PrintArray(arr);

    }
}
