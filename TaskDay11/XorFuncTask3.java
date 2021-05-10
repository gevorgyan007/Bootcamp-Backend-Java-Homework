package com.company.TaskDay11;

import java.util.Scanner;

public class XorFuncTask3 {

    public   static boolean xor(boolean a, boolean b){
        boolean flag = false;
        if(a==true && b==true)
            flag = false;
        else
        if(a==false && b==true)
            flag = false;
        else
            flag = false;
        return  flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
      boolean result =  xor(true,false);
        System.out.println(result);
    }
}
