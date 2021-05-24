package com.company.TaskDay14;

public class Task16 {
    public static String mirrorStr(String str) {
        if (str.length() <= 0){
            return str;
        }
        if (str.charAt(str.length() - 1) != '('){
            return "" + str.charAt(str.length() - 1) + mirrorStr(str.substring(0, str.length() - 1));
        }
        else{
            return ")" + mirrorStr(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String str = "(abc(def(g";
        // System.out.println(str.substring(1, str.length() - 1));
        System.out.println(str + mirrorStr(str));
    }
}
