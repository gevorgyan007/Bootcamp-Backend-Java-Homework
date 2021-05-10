package com.company.TaskDay11;

import java.util.Scanner;

public class CheckPrimenumTask5 {

    public static Boolean CheckPrime(int num){
        Boolean flag = true;
        if(num>1 && num < 20000000)
        for (int i = 2; i <= num/2; i++) {
            if (num%i==0)
                flag = false ;
            break;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = scanner.nextInt();
       Boolean prime =  CheckPrime(num);
        System.out.println(prime);
    }
}
