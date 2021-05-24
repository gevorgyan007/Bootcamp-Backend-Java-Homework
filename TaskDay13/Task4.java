package com.company.TaskDay13;

import java.util.Scanner;

public class Task4 {
    public static int CountVowel(String str){
        char a = 'a';
        char A = 'A';
        char e = 'e';
        char E = 'E';
        char i = 'i';
        char I = 'I';
        char o = 'O';
        char O = 'O';
        char u = 'u';
        char U = 'U';
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j)==a||str.charAt(j)==A||str.charAt(j)==e||str.charAt(j)==E||str.charAt(j)==I||str.charAt(j)==i||str.charAt(j)==o||str.charAt(j)==O||str.charAt(j)==u||str.charAt(j)==U){
                count++;
            }
        }
       return  count;
    }
    public static int CountVowel(String str,int count){
        char a = 'a';
        char A = 'A';
        char e = 'e';
        char E = 'E';
        char i = 'i';
        char I = 'I';
        char o = 'O';
        char O = 'O';
        char u = 'u';
        char U = 'U';
        count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j)!=a||str.charAt(j)!=A||str.charAt(j)!=e||str.charAt(j)!=E||str.charAt(j)!=I||str.charAt(j)!=i||str.charAt(j)!=o||str.charAt(j)!=O||str.charAt(j)!=u||str.charAt(j)!=U){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write string!");
        String str = scanner.next();

        System.out.println(CountVowel(str));
        System.out.println(CountVowel(str,0));
    }
}
