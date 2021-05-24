package com.company.TaskDay14;

public class Task14 {
    public static String allStar(String str)
    {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "hjafdj";
        System.out.println(allStar(str));
    }
}
