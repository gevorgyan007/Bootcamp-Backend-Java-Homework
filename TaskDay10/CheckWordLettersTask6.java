package com.company.TaskDay10;

import java.util.Scanner;

import static java.lang.Character.*;

public class CheckWordLettersTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word ");
        String word = scanner.next();

        String str = "";
        for (int i = 0; i < word.length(); i++) {
            switch (i) {
                case 0:
                    if (word.charAt(0) >= 65 && word.charAt(0) <= 90)
                        str += word.charAt(0);
                    else
                        str += toUpperCase(word.charAt(i));
                    break;
                case 1:
                    if (word.charAt(1) >= 65 && word.charAt(1) <= 90)
                        str += toLowerCase(word.charAt(1));
                    else
                        str += word.charAt(1);
                    break;
                case 2:
                    if (word.charAt(2) >= 65 && word.charAt(2) <= 90)
                        str += toLowerCase(word.charAt(2));
                    else
                        str += word.charAt(2);
                    break;
            }
        }
        System.out.println(str);
    }
}
