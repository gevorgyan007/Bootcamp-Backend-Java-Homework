package com.company.TaskDay13;

import java.util.Scanner;

public class Task7 {
    public static String MoveChar(String str){
        String newstr = "";
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++) {
                if((int)str.charAt(j)== i )
                    newstr+=str.charAt(i+2);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write string!");
        String str = scanner.next();

        System.out.println(MoveChar(str));
    }
}
