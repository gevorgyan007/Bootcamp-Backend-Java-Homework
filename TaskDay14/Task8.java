package com.company.TaskDay14;

public class Task8 {
   public  static  String ReversString(String str){
      char ch;
      int count;
      if(str.length() == 0)
          return str;
        count = str.length()-1;
        ch = str.charAt(count);
      return ch + ReversString(str.substring(0,count--));
  }
   public static void main(String[] args) {
        String str = "HELLk";
     String revers=   ReversString(str);

       System.out.println(revers);
    }
}
