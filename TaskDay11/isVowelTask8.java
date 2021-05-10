package com.company.TaskDay11;

import java.util.Scanner;

public class isVowelTask8 {
   public static boolean isVowel(String ch){
       Boolean flag = false;
       if(ch.equals("a")  || ch.equals("o") || ch.equals("i") || ch.equals("u") || ch.equals("e") )
           flag = true;
       else
            flag = false;
       return flag;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter charactor");
        String ch = scanner.next();
        System.out.println(isVowel(ch));
    }
}
