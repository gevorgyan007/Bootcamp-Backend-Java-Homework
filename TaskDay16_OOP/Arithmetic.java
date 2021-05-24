package com.company.TaskDay16_OOP;

public class Arithmetic {
    int[] array;

    public Arithmetic(int... array) {
        this.array = array;
    }

    public void options() {
        System.out.println("Please enter Sorting algoritm");
        System.out.println("Binary Search -- 1" + "\n" +
                "QuickSort -- 2" + "\n" +
                " bubbleSort()  -- 3" + "\n" +
                " min -- 4" + "\n" +
                "max -- 5" + "\n" +
                "average -- 6" + "\n" +
                "checkArithmeticProgression -- 7");
    }

    public int binarySearch(int l, int r, int number) {
        int[] arr = bubbleSort();
        if (l < r) {

            int mid = (r + l) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (mid < number) {
                return binarySearch(mid + 1, r, number);
            } else {
                return binarySearch(l, mid - 1, number);
            }
        }
        return -1;
    }

    public int[] bubbleSort() {
        long start = System.currentTimeMillis();
        int len = this.array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        return array;
    }

    public int max() {
        int[] arr = bubbleSort();
        return arr[arr.length - 1];
    }

    public int min() {
        int[] arr = bubbleSort();
        return arr[0];
    }

    public double average() {
        int[] arr = bubbleSort();
        int sum = 0, ave;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ave = sum / arr.length;
        return ave;
    }

    public boolean checkArithmeticProgression() {
        int[] arr = bubbleSort();
        int d = arr[1] - arr[0];
        if (arr.length == 1) {
            return true;
        }
        for (int i = 2; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                return false;
            }

        }
        return true;
    }

    public void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(this.array[i] + " ");
        }
    }
}
