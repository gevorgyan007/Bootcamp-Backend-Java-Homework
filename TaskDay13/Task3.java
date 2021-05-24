package com.company.TaskDay13;

import java.util.Scanner;

public class Task3  {
    public static  boolean   ContainChar(String str,char ch){
      String string = "" + ch;
       if (str.contains(string) == true)
            return  true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write string!");
        String str = scanner.next();
        System.out.println("Please enter char");


        System.out.println(ContainChar(str,'a'));

    }
}
