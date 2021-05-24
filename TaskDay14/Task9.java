package com.company.TaskDay14;


public class Task9 {
    public static String endX(String str) {
        int count = Task6.countX(str);
        String newstr = Task7.noX(str);

        for (int i = 0; i < count; i++) {
            newstr = newstr + "x";
        }
        return newstr;
    }

    public static void main(String[] args) {
        String str = "xxre";
        System.out.println(endX(str));
    }
}
