package com.company.TaskDay14;

public class Task13 {
    public static int findDigit(String str){
        char ch;
        if(str.length() == 0)
            return 0;
         ch=str.charAt(0);
        if (str.charAt(0)>=48 && str.charAt(0)<=57)
            return 1 + findDigit(str.substring(1));
        else
            return  findDigit(str.substring(1));

    }
    public static void main(String[] args) {
            String str = "ag5hd7fhJ8J8";
        System.out.println(findDigit(str));
    }
}
