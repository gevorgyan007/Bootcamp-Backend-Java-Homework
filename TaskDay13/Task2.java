package com.company.TaskDay13;

import java.util.Scanner;

public class Task2 {
    public static  void   IndexOfChar(String str,int index){
       char ch = str.charAt(index);
        System.out.println(ch);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int index = scanner.nextInt();

        IndexOfChar(str,index);
    }
}
