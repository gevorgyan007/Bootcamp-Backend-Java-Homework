package com.company.TaskDay12;

public class Task10 {
    public static int reminder(int number){
        int sum = 0;
        for (int i = number; i >0 ; i/=10) {
            sum+= i%10;
        }
        return sum;
    }
    public static int reminder(int number,int num){
        int sum = 0;
        for (int i = number; i >0 ; i/=10) {
            sum+= i%10;
        }
        return sum%num;
    }
    public static void main(String[] args) {
        System.out.println(reminder(125));
        System.out.println(reminder(125,3));
    }
}
