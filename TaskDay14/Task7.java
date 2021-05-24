package com.company.TaskDay14;

public class Task7 {
    public static String noX(String str) {
        char ch;
        if(str.length() == 0)
            return  str;
        ch = str.charAt(0);
        if(str.charAt(0)=='x')
            return noX(str.substring(1));
        return ch+noX(str.substring(1));
    }
    public static void main(String[] args) {
        String str ="xahhxtyxhjx";
        System.out.println(noX(str));
    }
}
