package com.company.TaskDay13;

import java.util.Scanner;

public class Task6 {
    //Enter a String: testing12345
    //Number of vowels: 2 (16.67%)
    //Number of digits: 5 (41.67%)

    public static void CountStr(String str){
      int countVowel =  Task4.CountVowel(str);

      int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >=48 && str.charAt(i) <=57)
                count++;
        }

       float countVowel1= 100 * countVowel/str.length();
       float count2= 100 * count/str.length();
        System.out.println("Number of vowels:" + countVowel +" "+countVowel1+"%");
        System.out.println("Number of digits:" + count +" "+ count2+"%");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write string!");
        String str = scanner.next();

       CountStr(str);
    }
}
