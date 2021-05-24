package com.company.TaskDay14;

public class Task11 {
    public static boolean primeNumber(int number, int i){
        if(number <= 2)
            return  true;

        if(i==number)
            return true;
        if (number%i == 0)
            return false;

        return  primeNumber(number,i+1);

    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println(primeNumber(number,2));

    }
}
