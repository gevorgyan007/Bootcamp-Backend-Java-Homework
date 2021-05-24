package com.company.TaskDay14;

public class Task6 {
    public static int countX(String str) {
        if(str.length() == 0)
            return 0;
        if (str.charAt(0)== 'x')
            return 1 + countX(str.substring(1));
        return  countX(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "xxhixx";

    System.out.println(countX(str));
    }
}
