package com.company.TaskDay13;

import java.util.Scanner;

public class Task5 {
    public  static  String ReversStr(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
      String newStr =  stringBuilder.reverse().toString();
      return  newStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write string!");
        String str = scanner.next();

        System.out.println(ReversStr(str));
    }

}
