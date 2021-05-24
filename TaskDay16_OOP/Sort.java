package com.company.TaskDay16_OOP;

import java.util.Scanner;

public class Sort {
    //has a Sort class with 3 methods ` sort() which will sort Students by` age, weight,name
    Student[] students;
    int count;
    Scanner scanner = new Scanner(System.in);

    public Sort(int _count) {
        count = _count;
        students = new Student[_count];
        for (int i = 0; i < students.length; i++) {
            int _age = scanner.nextInt();
            String _name = scanner.next();
            int _weight = scanner.nextInt();
            students[i] = new Student(_age, _name, _weight);
        }

    }

    public int[] sortAge() {
        int len = this.students.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = this.students[i].age;
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public int[] sortWeight() {
        int len = this.students.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = this.students[i].weight;
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public String[] sortName(){
        int len = this.students.length;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = this.students[i].name;
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1])>0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public  void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public  void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
