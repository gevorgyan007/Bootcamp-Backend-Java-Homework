package com.company.TaskDay12;

public class Task5 {
    public static int search(int[ ] array){
        return array.length;
    }
    public static int search(int[ ] array, int a){
        int i = 0;
        for (; i < array.length; i++) {
            if(array[i]==a){
                break;
            }
        }
        return i;
    }
    public static boolean search(int[] array, int argument, int index){
        int i = 0;
        for (; i < array.length; i++) {
            if(i == index && array[i] == array[index])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
