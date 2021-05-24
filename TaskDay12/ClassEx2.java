package com.company.TaskDay12;

public class ClassEx2 {
    public static int[] ChangeArray(int[][] arr,int n, int m){
        int[] newArr = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum +=arr[i][j];
            }
            sum /=m;
            newArr[i] = sum;
            sum = 0;
        }
        return  newArr;
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{1,1,1},{2,2,2}};
        int[] arr =  ChangeArray(array,3,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
