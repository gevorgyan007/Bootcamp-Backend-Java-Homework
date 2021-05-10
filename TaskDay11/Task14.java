package com.company.TaskDay11;

public class Task14 {

    public static int[] copyOf(int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }
        return  copy;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 64, 7, 8, 3, 11, 22};
        for (int i = 0; i <  copyOf(arr).length; i++) {
            System.out.print( copyOf(arr)[i]+" ");
        }

}}
