package com.company.TaskDay11;

import java.util.Scanner;

public class Task11 {
    public static boolean hasEight(int number){
        for (int i = number; i>0 ; number/=10) {
            if (number%10==8)
                return true;
            break;
        }
        return false;
    }

   public static int MagicSum(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a positive integer (or -1 to end):");

       int sum = 0;
       int n;
      do {

          n = scanner.nextInt();
          if(hasEight(n))
          sum+=n;
      }while (n!=-1);
       return sum;
   }
    public static void main(String[] args) {
        int result = MagicSum();
        System.out.println(result);
    }
}
